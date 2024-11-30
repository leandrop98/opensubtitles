package com.opensubtitles.subtitles;

import com.google.gson.annotations.SerializedName;

public class DownloadSubtitleResponse {

    @SerializedName("link")
    private String downloadUrl;

    @SerializedName("file_name")
    private String fileName;

    @SerializedName("requests")
    private int requests;

    @SerializedName("remaining")
    private int remainingRequests;

    @SerializedName("message")
    private String message;

    @SerializedName("reset_time")
    private String resetTime;

    @SerializedName("reset_time_utc")
    private String resetTimeUtc;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getRequests() {
        return requests;
    }

    public void setRequests(int requests) {
        this.requests = requests;
    }

    public int getRemainingRequests() {
        return remainingRequests;
    }

    public void setRemainingRequests(int remainingRequests) {
        this.remainingRequests = remainingRequests;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResetTime() {
        return resetTime;
    }

    public void setResetTime(String resetTime) {
        this.resetTime = resetTime;
    }

    public String getResetTimeUtc() {
        return resetTimeUtc;
    }

    public void setResetTimeUtc(String resetTimeUtc) {
        this.resetTimeUtc = resetTimeUtc;
    }
}
