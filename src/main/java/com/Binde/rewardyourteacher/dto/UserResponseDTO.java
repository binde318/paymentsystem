package com.Binde.rewardyourteacher.dto;

import com.Binde.rewardyourteacher.entity.School;
import com.Binde.rewardyourteacher.enums.Gender;
import com.Binde.rewardyourteacher.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class UserResponseDTO {

    private Long Id;
    private String firstName;
    private String lastName;
    private String email;

    private Gender gender;
    private String about;

    private String profilePicture;
    private UserRole role;
    private String position;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private LocalDateTime yearOfEmployment;
    private LocalDateTime yearOfResignation;

    private School school;
}
