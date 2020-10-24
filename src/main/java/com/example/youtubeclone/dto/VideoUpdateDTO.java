package com.example.youtubeclone.dto;

public class VideoUpdateDTO {
    private String thumbnailUrl;
    private String title;

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "VideoUpdateDTO{" +
                "thumbnailUrl='" + thumbnailUrl + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
