package com.opensubtitles.common;

import java.io.Serializable;

public class DownloadLimitOpenSubtitlesApiException extends RuntimeException implements Serializable {
    private int requests;
    private int remainingRequests;
    private String resetTime;
    private String resetTimeUtc;



    // Constructor with message
    public DownloadLimitOpenSubtitlesApiException(String message) {
        super(message);
    }

    // Constructor to include all response details
    public DownloadLimitOpenSubtitlesApiException(String message, int requests, int remainingRequests, String resetTime, String resetTimeUtc) {
        super(message);
        this.requests = requests;
        this.remainingRequests = remainingRequests;
        this.resetTime = resetTime;
        this.resetTimeUtc = resetTimeUtc;
    }


    public int getRequests() {
        return requests;
    }

    public int getRemainingRequests() {
        return remainingRequests;
    }

    public String getResetTime() {
        return resetTime;
    }

    public String getResetTimeUtc() {
        return resetTimeUtc;
    }
}
