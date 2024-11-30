package com.opensubtitles.subtitles;


public class SubtitleDetailsResponse {
    private String subtitleContent;
    private String subtitleFormat;
    private String filename;
    private String language;

    public String getSubtitleContent() {
        return subtitleContent;
    }

    public void setSubtitleContent(String subtitleContent) {
        this.subtitleContent = subtitleContent;
    }

    public String getSubtitleFormat() {
        return subtitleFormat;
    }

    public void setSubtitleFormat(String subtitleFormat) {
        this.subtitleFormat = subtitleFormat;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
