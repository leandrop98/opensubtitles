package com.opensubtitles.subtitles;

import java.util.HashMap;
import java.util.Map;

public class SubtitleSearchRequest {
    private String query;               // Required
    private String languages;           // Required
    private String imdbId;              // Optional
    private String moviehash;           // Optional
    private String moviehashMatch;      // Optional
    private String foreignPartsOnly;    // Optional
    private String hearingImpaired;     // Optional
    private String machineTranslated;   // Optional
    private String orderBy;             // Optional
    private String orderDirection;      // Optional
    private Integer page;               // Optional
    private Integer seasonNumber;       // Optional
    private Integer episodeNumber;      // Optional
    private Integer id;                 // Optional
    private Integer parentFeatureId;    // Optional
    private Integer parentImdbId;       // Optional
    private Integer parentTmdbId;       // Optional
    private Integer tmdbId;             // Optional
    private String trustedSources;      // Optional
    private String type;                // Optional
    private Integer uploaderId;         // Optional
    private Integer year;               // Optional
    private String aiTranslated;        // Optional

    // Constructor for required fields
    public SubtitleSearchRequest(String query, String languages) {
        this.query = query;
        this.languages = languages;
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String> queryParameters = new HashMap<>();

        // Add required fields
        queryParameters.put("query", query);
        queryParameters.put("languages", languages);

        // Add optional fields if they are not null or empty
        if (imdbId != null) queryParameters.put("imdb_id", imdbId);
        if (moviehash != null) queryParameters.put("moviehash", moviehash);
        if (moviehashMatch != null) queryParameters.put("moviehash_match", moviehashMatch);
        if (foreignPartsOnly != null) queryParameters.put("foreign_parts_only", foreignPartsOnly);
        if (hearingImpaired != null) queryParameters.put("hearing_impaired", hearingImpaired);
        if (machineTranslated != null) queryParameters.put("machine_translated", machineTranslated);
        if (orderBy != null) queryParameters.put("order_by", orderBy);
        if (orderDirection != null) queryParameters.put("order_direction", orderDirection);
        if (page != null) queryParameters.put("page", page.toString());
        if (seasonNumber != null) queryParameters.put("season_number", seasonNumber.toString());
        if (episodeNumber != null) queryParameters.put("episode_number", episodeNumber.toString());
        if (id != null) queryParameters.put("id", id.toString());
        if (parentFeatureId != null) queryParameters.put("parent_feature_id", parentFeatureId.toString());
        if (parentImdbId != null) queryParameters.put("parent_imdb_id", parentImdbId.toString());
        if (parentTmdbId != null) queryParameters.put("parent_tmdb_id", parentTmdbId.toString());
        if (tmdbId != null) queryParameters.put("tmdb_id", tmdbId.toString());
        if (trustedSources != null) queryParameters.put("trusted_sources", trustedSources);
        if (type != null) queryParameters.put("type", type);
        if (uploaderId != null) queryParameters.put("uploader_id", uploaderId.toString());
        if (year != null) queryParameters.put("year", year.toString());
        if (aiTranslated != null) queryParameters.put("ai_translated", aiTranslated);

        return queryParameters;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getMoviehash() {
        return moviehash;
    }

    public void setMoviehash(String moviehash) {
        this.moviehash = moviehash;
    }

    public String getMoviehashMatch() {
        return moviehashMatch;
    }

    public void setMoviehashMatch(String moviehashMatch) {
        this.moviehashMatch = moviehashMatch;
    }

    public String getForeignPartsOnly() {
        return foreignPartsOnly;
    }

    public void setForeignPartsOnly(String foreignPartsOnly) {
        this.foreignPartsOnly = foreignPartsOnly;
    }

    public String getHearingImpaired() {
        return hearingImpaired;
    }

    public void setHearingImpaired(String hearingImpaired) {
        this.hearingImpaired = hearingImpaired;
    }

    public String getMachineTranslated() {
        return machineTranslated;
    }

    public void setMachineTranslated(String machineTranslated) {
        this.machineTranslated = machineTranslated;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Integer getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentFeatureId() {
        return parentFeatureId;
    }

    public void setParentFeatureId(Integer parentFeatureId) {
        this.parentFeatureId = parentFeatureId;
    }

    public Integer getParentImdbId() {
        return parentImdbId;
    }

    public void setParentImdbId(Integer parentImdbId) {
        this.parentImdbId = parentImdbId;
    }

    public Integer getParentTmdbId() {
        return parentTmdbId;
    }

    public void setParentTmdbId(Integer parentTmdbId) {
        this.parentTmdbId = parentTmdbId;
    }

    public Integer getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    public String getTrustedSources() {
        return trustedSources;
    }

    public void setTrustedSources(String trustedSources) {
        this.trustedSources = trustedSources;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(Integer uploaderId) {
        this.uploaderId = uploaderId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAiTranslated() {
        return aiTranslated;
    }

    public void setAiTranslated(String aiTranslated) {
        this.aiTranslated = aiTranslated;
    }
}
