package dev.niekirk.com.instagram4android.requests.challenge;

import dev.niekirk.com.instagram4android.requests.payload.StatusResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class InstagramChallengeRequiredResult extends StatusResult {
    private String step_name;
    private InstagramStepDate step_data;
    private long user_id;
    private String nonce_code;
    private String status;
}