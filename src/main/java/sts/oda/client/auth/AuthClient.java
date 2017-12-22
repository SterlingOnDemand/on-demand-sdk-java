package sts.oda.client.auth;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.*;
import sts.oda.client.*;
import sts.oda.client.model.AccessToken;

import java.io.IOException;

public class AuthClient {

    private OkHttpClient httpClient;
    private String authUrl;
    private String basicCredentials;
    private Gson gson;

    public AuthClient(String authUrl, String basicCredentials) {
        httpClient = new OkHttpClient();
        gson = new GsonBuilder().create();

        this.authUrl = authUrl;
        this.basicCredentials = basicCredentials;
    }

    public AccessToken auth() throws ApiException {
        FormEncodingBuilder formBuilder  = new FormEncodingBuilder();
        formBuilder.add("grant_type", "client_credentials");
        RequestBody requestBody = formBuilder.build();

        Request request = new Request.Builder()
                .url(authUrl)
                .post(requestBody)
                .header("Authorization", String.format("basic %s", basicCredentials))
                .build();

        return executeAuthCall(request);
    }

    private AccessToken executeAuthCall(Request request) throws ApiException {
        Call call = httpClient.newCall(request);
        Response response;
        try {
            response = call.execute();
        } catch (IOException e) {
            throw new ApiException(e);
        }

        if (response.isSuccessful()) {
            if (response.code() == 204) {
                // or the status code is 204 (No Content)
                if (response.body() != null) {
                    try {
                        response.body().close();
                    } catch (IOException e) {
                        throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                    }
                }
                return null;
            } else {
                return deserialize(response);
            }
        } else {
            String respBody = null;
            if (response.body() != null) {
                try {
                    respBody = response.body().string();
                } catch (IOException e) {
                    throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                }
            }
            throw new ApiException(response.message(), response.code(), response.headers().toMultimap(), respBody);
        }
    }

    private AccessToken deserialize(Response response) throws ApiException {
        if (response == null) {
            return null;
        }

        String respBody;
        try {
            if (response.body() != null) {
                respBody = response.body().string();
            } else {
                respBody = null;
            }
        } catch (IOException e) {
            throw new ApiException(e);
        }

        if (respBody == null || "".equals(respBody)) {
            return null;
        }

        return gson.fromJson(respBody, AccessToken.class);
    }

}
