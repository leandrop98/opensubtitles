package com.opensubtitles.common;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Subtitle {

    @SerializedName("id")
    private String id;

    @SerializedName("type")
    private String type;

    @SerializedName("attributes")
    private SubtitleAttributes attributes;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SubtitleAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(SubtitleAttributes attributes) {
        this.attributes = attributes;
    }

    public static class SubtitleAttributes {

        @SerializedName("subtitle_id")
        private String subtitleId;
        @SerializedName("language")
        private String language;
        @SerializedName("download_count")
        private int downloadCount;
        @SerializedName("new_download_count")
        private int newDownloadCount;
        @SerializedName("hearing_impaired")
        private boolean hearingImpaired;
        @SerializedName("hd")
        private boolean hd;
        @SerializedName("fps")
        private double fps;
        @SerializedName("votes")
        private int votes;
        @SerializedName("ratings")
        private double ratings;
        @SerializedName("from_trusted")
        private Boolean fromTrusted;
        @SerializedName("foreign_parts_only")
        private boolean foreignPartsOnly;
        @SerializedName("upload_date")
        private String uploadDate;
        @SerializedName("file_hashes")
        private List<String> fileHashes;
        @SerializedName("ai_translated")
        private boolean aiTranslated;
        @SerializedName("nb_cd")
        private int nbCd;
        @SerializedName("slug")
        private String slug;
        @SerializedName("machine_translated")
        private boolean machineTranslated;
        @SerializedName("release")
        private String release;
        @SerializedName("comments")
        private String comments;
        @SerializedName("legacy_subtitle_id")
        private Integer legacySubtitleId;
        @SerializedName("legacy_uploader_id")
        private Integer legacyUploaderId;
        @SerializedName("uploader")
        private Uploader uploader;
        @SerializedName("feature_details")
        private FeatureDetails featureDetails;
        @SerializedName("url")
        private String url;
        @SerializedName("related_links")
        private List<RelatedLink> relatedLinks;
        @SerializedName("files")
        private List<SubtitleFile> files;

        // Getters
        public String getSubtitleId() {
            return subtitleId;
        }

        public String getLanguage() {
            return language;
        }

        public int getDownloadCount() {
            return downloadCount;
        }

        public int getNewDownloadCount() {
            return newDownloadCount;
        }

        public boolean isHearingImpaired() {
            return hearingImpaired;
        }

        public boolean isHd() {
            return hd;
        }

        public double getFps() {
            return fps;
        }

        public int getVotes() {
            return votes;
        }

        public double getRatings() {
            return ratings;
        }

        public Boolean getFromTrusted() {
            return fromTrusted;
        }

        public boolean isForeignPartsOnly() {
            return foreignPartsOnly;
        }

        public String getUploadDate() {
            return uploadDate;
        }

        public List<String> getFileHashes() {
            return fileHashes;
        }

        public boolean isAiTranslated() {
            return aiTranslated;
        }

        public int getNbCd() {
            return nbCd;
        }

        public String getSlug() {
            return slug;
        }

        public boolean isMachineTranslated() {
            return machineTranslated;
        }

        public String getRelease() {
            return release;
        }

        public String getComments() {
            return comments;
        }

        public Integer getLegacySubtitleId() {
            return legacySubtitleId;
        }

        public Integer getLegacyUploaderId() {
            return legacyUploaderId;
        }

        public Uploader getUploader() {
            return uploader;
        }

        public FeatureDetails getFeatureDetails() {
            return featureDetails;
        }

        public String getUrl() {
            return url;
        }

        public List<RelatedLink> getRelatedLinks() {
            return relatedLinks;
        }

        public List<SubtitleFile> getFiles() {
            return files;
        }

        // Setters
        public void setSubtitleId(String subtitleId) {
            this.subtitleId = subtitleId;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public void setDownloadCount(int downloadCount) {
            this.downloadCount = downloadCount;
        }

        public void setNewDownloadCount(int newDownloadCount) {
            this.newDownloadCount = newDownloadCount;
        }

        public void setHearingImpaired(boolean hearingImpaired) {
            this.hearingImpaired = hearingImpaired;
        }

        public void setHd(boolean hd) {
            this.hd = hd;
        }

        public void setFps(double fps) {
            this.fps = fps;
        }

        public void setVotes(int votes) {
            this.votes = votes;
        }

        public void setRatings(int ratings) {
            this.ratings = ratings;
        }

        public void setFromTrusted(Boolean fromTrusted) {
            this.fromTrusted = fromTrusted;
        }

        public void setForeignPartsOnly(boolean foreignPartsOnly) {
            this.foreignPartsOnly = foreignPartsOnly;
        }

        public void setUploadDate(String uploadDate) {
            this.uploadDate = uploadDate;
        }

        public void setFileHashes(List<String> fileHashes) {
            this.fileHashes = fileHashes;
        }

        public void setAiTranslated(boolean aiTranslated) {
            this.aiTranslated = aiTranslated;
        }

        public void setNbCd(int nbCd) {
            this.nbCd = nbCd;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public void setMachineTranslated(boolean machineTranslated) {
            this.machineTranslated = machineTranslated;
        }

        public void setRelease(String release) {
            this.release = release;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public void setLegacySubtitleId(Integer legacySubtitleId) {
            this.legacySubtitleId = legacySubtitleId;
        }

        public void setLegacyUploaderId(Integer legacyUploaderId) {
            this.legacyUploaderId = legacyUploaderId;
        }

        public void setUploader(Uploader uploader) {
            this.uploader = uploader;
        }

        public void setFeatureDetails(FeatureDetails featureDetails) {
            this.featureDetails = featureDetails;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setRelatedLinks(List<RelatedLink> relatedLinks) {
            this.relatedLinks = relatedLinks;
        }

        public void setFiles(List<SubtitleFile> files) {
            this.files = files;
        }
    }

    public static class RelatedLink {

        @SerializedName("label")
        private String label;

        @SerializedName("url")
        private String url;

        @SerializedName("img_url")
        private String imgUrl;

        // Getters
        public String getLabel() {
            return label;
        }

        public String getUrl() {
            return url;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        // Setters
        public void setLabel(String label) {
            this.label = label;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }
    }

    public static class SubtitleFile {

        @SerializedName("file_id")
        private String fileId;

        @SerializedName("cd_number")
        private int cdNumber;

        @SerializedName("file_name")
        private String fileName;

        // Getters
        public String getFileId() {
            return fileId;
        }

        public int getCdNumber() {
            return cdNumber;
        }

        public String getFileName() {
            return fileName;
        }

        // Setters
        public void setFileId(String fileId) {
            this.fileId = fileId;
        }

        public void setCdNumber(int cdNumber) {
            this.cdNumber = cdNumber;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
    }

    public static class Uploader {

        @SerializedName("uploader_id")
        private Integer uploaderId;

        @SerializedName("name")
        private String name;

        @SerializedName("rank")
        private String rank;

        // Getters
        public Integer getUploaderId() {
            return uploaderId;
        }

        public String getName() {
            return name;
        }

        public String getRank() {
            return rank;
        }

        // Setters
        public void setUploaderId(Integer uploaderId) {
            this.uploaderId = uploaderId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }
    }

    public static class FeatureDetails {

        @SerializedName("feature_id")
        private Integer featureId;
        @SerializedName("feature_type")
        private String featureType;
        @SerializedName("language_name")
        private String languageName;
        @SerializedName("year")
        private Integer year;
        @SerializedName("title")
        private String title;
        @SerializedName("movie_name")
        private String movieName;
        @SerializedName("imdb_id")
        private Integer imdbId;
        @SerializedName("tmdb_id")
        private Integer tmdbId;
        @SerializedName("season_number")
        private Integer seasonNumber;
        @SerializedName("episode_number")
        private Integer episodeNumber;
        @SerializedName("parent_imdb_id")
        private Integer parentImdbId;
        @SerializedName("parent_title")
        private String parentTitle;
        @SerializedName("parent_tmdb_id")
        private Integer parentTmdbId;
        @SerializedName("parent_feature_id")
        private Integer parentFeatureId;


        public int getFeatureId() {
            return featureId;
        }

        public String getFeatureType() {
            return featureType;
        }

        public String getLanguageName() {
            return languageName;
        }


        public void setFeatureId(int featureId) {
            this.featureId = featureId;
        }

        public void setFeatureType(String featureType) {
            this.featureType = featureType;
        }

        public void setLanguageName(String languageName) {
            this.languageName = languageName;
        }

        public void setFeatureId(Integer featureId) {
            this.featureId = featureId;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public Integer getImdbId() {
            return imdbId;
        }

        public void setImdbId(Integer imdbId) {
            this.imdbId = imdbId;
        }

        public Integer getTmdbId() {
            return tmdbId;
        }

        public void setTmdbId(Integer tmdbId) {
            this.tmdbId = tmdbId;
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

        public Integer getParentImdbId() {
            return parentImdbId;
        }

        public void setParentImdbId(Integer parentImdbId) {
            this.parentImdbId = parentImdbId;
        }

        public String getParentTitle() {
            return parentTitle;
        }

        public void setParentTitle(String parentTitle) {
            this.parentTitle = parentTitle;
        }

        public Integer getParentTmdbId() {
            return parentTmdbId;
        }

        public void setParentTmdbId(Integer parentTmdbId) {
            this.parentTmdbId = parentTmdbId;
        }

        public Integer getParentFeatureId() {
            return parentFeatureId;
        }

        public void setParentFeatureId(Integer parentFeatureId) {
            this.parentFeatureId = parentFeatureId;
        }
    }
}
