package com.opensubtitles.common;

import com.google.gson.annotations.SerializedName;

public class Language {

    @SerializedName("language_code")
    private String languageCode;

    @SerializedName("language_name")
    private String languageName;


    // Getters and setters
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

}

