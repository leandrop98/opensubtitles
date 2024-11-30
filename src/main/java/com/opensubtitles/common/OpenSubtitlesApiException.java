package com.opensubtitles.common;

public class OpenSubtitlesApiException extends RuntimeException {
    private Integer statusCode = null;

    public OpenSubtitlesApiException(String message) {
        super(message);
    }

    public OpenSubtitlesApiException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
