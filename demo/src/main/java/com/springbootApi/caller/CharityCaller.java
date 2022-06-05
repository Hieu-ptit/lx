package com.springbootApi.caller;

import com.springbootApi.model.response.Response;
import com.springbootApi.model.response.UserResponse;
import com.springbootApi.service.ApiStorage;
import com.springbootApi.uitils.Global;
import com.util.Json;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
@RequiredArgsConstructor
public class CharityCaller {

    private final RestClient restClient;

    private final ApiStorage apiStorage;

    public CompletableFuture<Response<UserResponse>> getUserById(String userId) {
        return restClient.get(apiStorage.apiGetUser(userId), restClient.headers)
            .thenApply(httpResponse -> Json.decode(httpResponse.body(), Global.userResponse));
    }

}
