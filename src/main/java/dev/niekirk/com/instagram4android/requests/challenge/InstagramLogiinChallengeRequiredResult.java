package dev.niekirk.com.instagram4android.requests.challenge;

import dev.niekirk.com.instagram4android.requests.payload.StatusResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class InstagramLogiinChallengeRequiredResult extends StatusResult {
    private String message;
    private InstagramChallengeResult challenge;
    private String status;
    private String error_type;

}