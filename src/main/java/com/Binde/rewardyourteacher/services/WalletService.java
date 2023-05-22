package com.Binde.rewardyourteacher.services;


import com.Binde.rewardyourteacher.dto.CurrentBalanceResponse;
import com.Binde.rewardyourteacher.dto.WalletRequest;
import com.Binde.rewardyourteacher.dto.WalletResponse;
import com.Binde.rewardyourteacher.entity.User;
import com.Binde.rewardyourteacher.entity.Wallet;
import com.Binde.rewardyourteacher.utils.VerifyTransactionResponse;

import java.util.List;

public interface WalletService {
    WalletResponse createOrUpdateWallet(WalletRequest walletRequest, String email);

    CurrentBalanceResponse currentUserWalletBalance(String email);

    void fundWallet(String email, VerifyTransactionResponse payStackResponse, String walletName, String description);

    WalletResponse getWallet(String email);

    List<WalletResponse> getAllWallet();

    Wallet createWallet(User user, String walletName, String description, WalletRequest... walletRequests);
}
