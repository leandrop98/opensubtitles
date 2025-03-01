package com.opensubtitles.api;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
public class ApiClient {

    private static Retrofit retrofit;
    private static String token;  // Store the token

    // Method to set the token after login
    public static void setToken(String userToken) {
        token = userToken;
    }
    public static String getToken(){
        return token;
    }

    public static Retrofit getClient(String apiKey, String appName, String appVersion, String baseUrl) {
        if (retrofit == null || !retrofit.baseUrl().toString().equals(baseUrl)) {
            OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();

            // Add Interceptor to include headers
            clientBuilder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();

                    // Build the request with default headers
                    Request.Builder requestBuilder = original.newBuilder()
                            .header("Content-Type", "application/json")
                            .header( "Accept" , "application/json")
                            .header("Api-Key", apiKey);


                    // If token exists, add Authorization header
                    if (token != null && !token.isEmpty()) {
                        requestBuilder.header("Authorization", "Bearer " + token);
                    }

                    // Add User-Agent header if requested
                    if (!appName.isEmpty() && !appVersion.isEmpty()) {
                        requestBuilder.header("User-Agent", appName + " v" + appVersion);
                    }

                    Request request = requestBuilder
                            .method(original.method(), original.body())
                            .build();
                    return chain.proceed(request);
                }
            });

            // Build the OkHttpClient
            OkHttpClient client = clientBuilder.build();

            // Initialize Retrofit with the custom client
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
