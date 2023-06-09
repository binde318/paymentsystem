package com.Binde.rewardyourteacher.utils;

import com.Binde.rewardyourteacher.entity.User;
import com.Binde.rewardyourteacher.exceptions.UserNotFoundException;
import com.Binde.rewardyourteacher.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
@NoArgsConstructor
public class AuthDetails {


    private UserRepository userRepository;

    @Autowired
    public AuthDetails(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getAuthorizedUser(Principal principal) {
        if (principal != null) {
            final UserDetails currentUser = (UserDetails) ((Authentication) principal).getPrincipal();
            return userRepository.findUserByEmail(currentUser.getUsername()).orElseThrow(
                    () -> new UserNotFoundException(currentUser.getUsername())
            );
        } else {
            return null;
        }
    }

    public User getAuthorizedUser() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userRepository.findUserByEmail(userDetails.getUsername()).orElseThrow(
                () -> new UserNotFoundException(userDetails.getUsername())
        );
    }
}

