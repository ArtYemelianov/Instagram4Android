package dev.niekirk.com.instagram4android.requests.challenge;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class InstagramChallengeRequiredPayload {
    private String challengeUrl;
    private int user_id;
    private String step_name;
    private String choice;
    private String fb_access_token;
    private String big_blue_token;
    private String google_oauth_token;
    private String email;
    private String phone_number;
    private String nonce_code;
    private String status;
}