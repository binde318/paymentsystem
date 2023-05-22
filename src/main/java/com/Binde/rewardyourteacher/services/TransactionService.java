package com.Binde.rewardyourteacher.services;


import com.Binde.rewardyourteacher.dto.TransactionHistoryDTO;
import com.Binde.rewardyourteacher.entity.Transaction;
import com.Binde.rewardyourteacher.entity.User;
import com.Binde.rewardyourteacher.enums.TransactionType;

import java.math.BigDecimal;
import java.util.List;

public interface TransactionService {
    List<TransactionHistoryDTO> transactionHistory(String email, int limit);
    Transaction saveTransaction(Transaction transaction);
    Transaction saveTransaction(User user, long senderId, BigDecimal amount, String description, TransactionType transactionType);

    void updateUserTransactionList(User user, long senderId, BigDecimal amount, String description, TransactionType transactionType);

    BigDecimal getTotalMoneySent(String email);
}
