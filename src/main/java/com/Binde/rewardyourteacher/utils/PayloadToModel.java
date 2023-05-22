package com.Binde.rewardyourteacher.utils;

import com.Binde.rewardyourteacher.entity.User;
import com.Binde.rewardyourteacher.dto.GoogleOauth2User;

public class PayloadToModel {

    public static User mapRequestToUser(GoogleOauth2User request) {
        User user = new User();
        if (request.getFirstName() != null) {
            user.setFirstName(request.getFirstName());
        }
        if (request.getLastName() != null) {
            user.setFirstName(request.getFirstName());
        }

        if (request.getEmail() != null) {
            user.setEmail(request.getEmail());
        }
        if (request.getDisplayPicture() != null) {
            user.setProfilePicture(request.getDisplayPicture());
        }

        return user;
    }
}