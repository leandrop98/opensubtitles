package com.opensubtitles.api;

import com.opensubtitles.auth.LoginRequest;
import com.opensubtitles.auth.LoginResponse;
import com.opensubtitles.auth.LogoutResponse;
import com.opensubtitles.infos.LanguagesResponse;
import com.opensubtitles.subtitles.DownloadSubtitleRequest;
import com.opensubtitles.subtitles.DownloadSubtitleResponse;
import com.opensubtitles.subtitles.SubtitleDetailsResponse;
import com.opensubtitles.subtitles.SubtitleSearchResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface OpenSubtitlesApi {

    // Get languages endpoint (new method)
    @GET("infos/languages")
    Call<LanguagesResponse> getLanguages();

    // Login endpoint
    @POST("login")
    @Headers("Content-Type: application/json")
    Call<LoginResponse> login(@Body LoginRequest request);

    @POST("logout")
    @Headers("Content-Type: application/json")
    Call<LogoutResponse> logout();

    @GET("subtitles")
    Call<SubtitleSearchResponse> searchSubtitles(
            @QueryMap Map<String, String> queryParameters
    );

    // Get subtitle details endpoint
    @GET("subtitles/{id}")
    Call<SubtitleDetailsResponse> getSubtitleDetails(@Path("id") String subtitleId);

    // Download subtitle endpoint
    @POST("download")
    Call<DownloadSubtitleResponse> downloadSubtitle(@Body DownloadSubtitleRequest request);

}

