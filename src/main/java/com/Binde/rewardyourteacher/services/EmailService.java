package com.Binde.rewardyourteacher.services;

import com.Binde.rewardyourteacher.dto.EmailResponse;
import com.Binde.rewardyourteacher.utils.EmailDetails;

public interface EmailService {

    EmailResponse sendSimpleMail(EmailDetails details, String email);
    EmailResponse sendMailWithAttachment(EmailDetails details, String email);
}
