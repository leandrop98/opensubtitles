package com.opensubtitles.subtitles;

import com.opensubtitles.common.Subtitle;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SubtitleSearchResponse {

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName("per_page")
    private int perPage;

    @SerializedName("page")
    private int page;

    @SerializedName("data")
    private List<Subtitle> data;

    // Getters and setters
    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Subtitle> getData() {
        return data;
    }

    public void setData(List<Subtitle> data) {
        this.data = data;
    }
}
