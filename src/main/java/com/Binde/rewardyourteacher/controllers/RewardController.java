package com.Binde.rewardyourteacher.controllers;

import com.Binde.rewardyourteacher.dto.APIResponse;
import com.Binde.rewardyourteacher.dto.PaymentResponse;
import com.Binde.rewardyourteacher.dto.SenderTransferDto;
import com.Binde.rewardyourteacher.services.RewardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rewards")
public class RewardController {
    private final RewardService rewardService;

    public RewardController(RewardService rewardService) {
        this.rewardService = rewardService;
    }

    @PostMapping("receiverId/{receiverId}")
    @PreAuthorize("hasAuthority('ROLE_STUDENT')")
    public ResponseEntity<APIResponse<PaymentResponse>> sendTeacherReward(@PathVariable("receiverId") Long receiverId, @RequestBody SenderTransferDto senderTransferDto) {
        APIResponse<PaymentResponse> apiResponse = new APIResponse<>();
        try {
            PaymentResponse response = rewardService.rewardTeacher(receiverId, senderTransferDto);
            return new ResponseEntity<>(new APIResponse<>(true, "success", response), HttpStatus.OK);
        } catch (Exception ex) {
            apiResponse.setStatus(false);
            apiResponse.setMessage(ex.getMessage());
            return new ResponseEntity<>(new APIResponse<>(false, ex.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
    }

}
