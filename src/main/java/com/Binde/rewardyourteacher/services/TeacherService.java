package com.Binde.rewardyourteacher.services;

import com.Binde.rewardyourteacher.dto.*;
import com.osayijoy.rewardyourteacher.dto.*;
import com.Binde.rewardyourteacher.entity.Notification;

public interface TeacherService {

    UserResponseDTO signUp(SignUpDto signUpDto) throws Exception;
    LoginResponse teacherLogin(LoginDTO loginDTO);
    UserResponseDTO updateTeacher(TeacherRequestDTO teacherRequestDTO, String email);
    Notification teacherAppreciatesStudent(String email, Long userId, MessageDTO messageDTO);
    LoginResponse teacherSocialLogin(SocialLoginRequest socialLoginRequest);
}
