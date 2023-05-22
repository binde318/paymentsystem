package com.Binde.rewardyourteacher.repository;

import com.Binde.rewardyourteacher.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    Optional<User> findById(Long Id);



    Optional<User> findUserByEmail(String username);
}
