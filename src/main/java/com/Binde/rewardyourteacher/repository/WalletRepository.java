package com.Binde.rewardyourteacher.repository;

import com.Binde.rewardyourteacher.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
}

