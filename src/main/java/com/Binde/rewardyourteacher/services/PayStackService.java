package com.Binde.rewardyourteacher.services;


import com.Binde.rewardyourteacher.dto.PayStackPaymentRequest;
import com.Binde.rewardyourteacher.dto.PayStackResponse;
import com.Binde.rewardyourteacher.utils.VerifyTransactionResponse;

import java.io.IOException;
import java.security.Principal;

public interface PayStackService {

    PayStackResponse initTransaction(Principal principal, PayStackPaymentRequest request) throws Exception;

    VerifyTransactionResponse verifyPayment(String reference) throws IOException;
}
