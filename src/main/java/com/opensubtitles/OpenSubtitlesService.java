package com.opensubtitles;

import com.opensubtitles.api.ApiClient;
import com.opensubtitles.api.OpenSubtitlesApi;
import com.opensubtitles.auth.LoginRequest;
import com.opensubtitles.auth.LoginResponse;
import com.opensubtitles.auth.LogoutResponse;
import com.opensubtitles.common.OpenSubtitlesApiException;
import com.opensubtitles.infos.LanguagesResponse;
import com.opensubtitles.subtitles.*;
import retrofit2.Call;
import retrofit2.Response;
import java.io.IOException;

public class OpenSubtitlesService {

    private final static String DEFAULT_BASE_URL = "https://api.opensubtitles.com/api/v1/";

    private final OpenSubtitlesApi api;
    private final String apiKey;
    private String appName = "";
    private String appVersion = "";


    public OpenSubtitlesService(String apiKey, String appName, String appVersion, String baseUrl) {
        this.apiKey = apiKey;
        this.appName = appName;
        this.appVersion = appVersion;
        this.api = ApiClient.getClient(apiKey, appName, appVersion, baseUrl).create(OpenSubtitlesApi.class);
    }
    public OpenSubtitlesService(String apiKey) {
        this(apiKey, "" ,"" , DEFAULT_BASE_URL);
    }

    public OpenSubtitlesService(String apiKey, String appName, String appVersion){
        this(apiKey, appName, appVersion, DEFAULT_BASE_URL);
    }

    public LanguagesResponse getLanguages() throws IOException {
        Response<LanguagesResponse> response = api.getLanguages().execute();
        if (response.isSuccessful() && response.body() != null){
            return response.body();
        }
        else {
            throw new OpenSubtitlesApiException(response.message(), response.code());
        }
    }

    public void login(String username, String password) throws IOException {
        LoginRequest request = new LoginRequest(username, password);
        Call<LoginResponse> call = api.login(request);

        Response<LoginResponse> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            if (response.body().getToken() == null || response.body().getToken().isEmpty()){
                throw new OpenSubtitlesApiException("The token returned be the server is empty");
            }
            ApiClient.setToken(response.body().getToken());
        } else {
            throw new OpenSubtitlesApiException(response.message(), response.code());
        }
    }

    public void logout() throws IOException {
        if (ApiClient.getToken() == null || ApiClient.getToken().isEmpty()) {
            throw new OpenSubtitlesApiException("No active session to log out from.");
        }

        Call<LogoutResponse> call = api.logout();
        Response<LogoutResponse> response = call.execute();
        if (response.isSuccessful()) {
            ApiClient.setToken(null);
        } else {
            throw new OpenSubtitlesApiException(response.message(), response.code());
        }
    }

    private void ensureLoggedIn() throws OpenSubtitlesApiException {
        if (!isLoggedIn()) {
            throw new OpenSubtitlesApiException("User is not logged in. Please log in first.");
        }
    }
    
    public boolean isLoggedIn(){
       return (ApiClient.getToken() != null && !ApiClient.getToken().isEmpty());
    }

    // Search subtitles based on a query and language
    public SubtitleSearchResponse searchSubtitles(SubtitleSearchRequest request) throws IOException {
        Call<SubtitleSearchResponse> call = api.searchSubtitles(request.getQueryParameters());

        Response<SubtitleSearchResponse> response = call.execute();

        if (response.isSuccessful()) {
            if (response.body() != null) {
                return response.body();
            } else {
                // Handle empty body, possibly with a custom exception or alternative action
                throw new OpenSubtitlesApiException("No content in the response body", response.code());
            }
        } else {
            if (response.errorBody()!=null){
                throw new OpenSubtitlesApiException("Request failed: " + response.errorBody().toString(), response.code());
            }
            throw new OpenSubtitlesApiException("Request failed! ", response.code());
        }
    }

    // Get subtitle details based on subtitle ID
    public SubtitleDetailsResponse getSubtitleDetails(String subtitleId) throws IOException {

        Call<SubtitleDetailsResponse> call = api.getSubtitleDetails(subtitleId);
        Response<SubtitleDetailsResponse> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            return response.body();
        } else {
            throw new OpenSubtitlesApiException("Failed to get subtitle details: " + response.message(), response.code());
        }
    }


    // Download subtitle in the specified format
    public DownloadSubtitleResponse downloadSubtitle(int fileId) throws IOException {
        DownloadSubtitleRequest request = new DownloadSubtitleRequest(fileId);

        Call<DownloadSubtitleResponse> call = api.downloadSubtitle(request);
        Response<DownloadSubtitleResponse> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            return response.body();
        } else {
            throw new OpenSubtitlesApiException("Failed to download subtitle: " + response.message(), response.code());
        }
    }
    public DownloadSubtitleResponse downloadSubtitle(DownloadSubtitleRequest request) throws IOException {
        Call<DownloadSubtitleResponse> call = api.downloadSubtitle(request);
        Response<DownloadSubtitleResponse> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            return response.body();
        } else {
            throw new OpenSubtitlesApiException("Failed to download subtitle: " + response.message(), response.code());
        }
    }
}
