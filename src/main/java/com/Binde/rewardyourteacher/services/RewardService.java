package com.Binde.rewardyourteacher.services;


import com.Binde.rewardyourteacher.exceptions.WalletNotFoundException;
import com.Binde.rewardyourteacher.dto.PaymentResponse;
import com.Binde.rewardyourteacher.dto.SenderTransferDto;

public interface RewardService {
    PaymentResponse rewardTeacher(Long receiverId, SenderTransferDto senderTransferDto)
        throws WalletNotFoundException;
}
