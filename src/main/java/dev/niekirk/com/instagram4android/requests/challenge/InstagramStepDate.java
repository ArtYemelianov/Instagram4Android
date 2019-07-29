package dev.niekirk.com.instagram4android.requests.challenge;

import dev.niekirk.com.instagram4android.requests.payload.StatusResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class InstagramStepDate extends StatusResult {
    private String choice;
    private String fb_access_token;
    private String big_blue_token;
    private String google_oauth_token;
    private String email;
    private String phone_number;
    private String security_code;
    private int resend_delay;
    private String contact_point;
    private String form_type;
}