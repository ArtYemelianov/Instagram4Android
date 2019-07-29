package dev.niekirk.com.instagram4android.requests.challenge;

import dev.niekirk.com.instagram4android.requests.payload.StatusResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class InstagramChallengeResult extends StatusResult {
    public String url;
    public String api_path;
    private boolean hide_webview_header;
    private boolean lock;
    private boolean logout;
    private boolean native_flow;

}