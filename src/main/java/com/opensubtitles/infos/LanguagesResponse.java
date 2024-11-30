package com.opensubtitles.infos;

import com.google.gson.annotations.SerializedName;
import com.opensubtitles.common.Language;

import java.util.List;

public class LanguagesResponse {
    @SerializedName("data")
    private List<Language> languages;

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }
}