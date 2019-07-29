package dev.niekirk.com.instagram4android.requests.challenge;

import dev.niekirk.com.instagram4android.requests.InstagramGetRequest;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class InstagramChallengeRequiredRequest
        extends InstagramGetRequest<InstagramChallengeRequiredResult> {

    private String url;
    private String uuid;
    private String deviceId;

//    public InstagramChallengeRequiredRequest(String url,
//                                             String uuid,
//                                             String deviceId) {
//        this.url = url;
//        this.uuid = uuid;
//        this.deviceId = deviceId;
//    }


    @Override
    public String getUrl() {
        String baseUrl = url + "/?guid=" + uuid + "/device_id=" + deviceId;
        return baseUrl;
    }

    @Override
    @SneakyThrows
    public String getPayload() {
        return null;
    }

    @Override
    @SneakyThrows
    public InstagramChallengeRequiredResult parseResult(int statusCode, String content) {
        return parseJson(statusCode, content, InstagramChallengeRequiredResult.class);
    }

    @Override
    public boolean requiresLogin() {
        return false;
    }
}
