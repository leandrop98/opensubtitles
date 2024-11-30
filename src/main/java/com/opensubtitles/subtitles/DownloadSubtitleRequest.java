package com.opensubtitles.subtitles;

public class DownloadSubtitleRequest {
    private int fileId;
    private String subFormat; // Optional, subtitle format (e.g., .srt, .vtt)
    private String fileName; // Optional, desired file name
    private Float inFps; // Optional, input FPS for conversion
    private Float outFps; // Optional, output FPS for conversion
    private Float timeshift; // Optional, time shift in seconds
    private boolean forceDownload; // Optional, force download flag

    public DownloadSubtitleRequest(int fileId) {
        this.fileId = fileId;
    }

    // Getters and setters
    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public String getSubFormat() {
        return subFormat;
    }

    public void setSubFormat(String subFormat) {
        this.subFormat = subFormat;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Float getInFps() {
        return inFps;
    }

    public void setInFps(Float inFps) {
        this.inFps = inFps;
    }

    public Float getOutFps() {
        return outFps;
    }

    public void setOutFps(Float outFps) {
        this.outFps = outFps;
    }

    public Float getTimeshift() {
        return timeshift;
    }

    public void setTimeshift(Float timeshift) {
        this.timeshift = timeshift;
    }

    public boolean isForceDownload() {
        return forceDownload;
    }

    public void setForceDownload(boolean forceDownload) {
        this.forceDownload = forceDownload;
    }
}
