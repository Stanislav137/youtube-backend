package com.example.youtubeclone.dto;

import java.util.Date;

public class VideoDTO {
    private Long id;
    private String title;
    private String duration;
    private String thumbnailUrl;
    private String videoUrl;
    private int views;
    private Date uploadDate;
    private ChannelDTO channelDTO;

    public VideoDTO () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public ChannelDTO getChannelDTO() {
        return channelDTO;
    }

    public void setChannelDTO(ChannelDTO channelDTO) {
        this.channelDTO = channelDTO;
    }

    @Override
    public String toString() {
        return "VideoDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", views=" + views +
                ", uploadDate=" + uploadDate +
                ", channelDTO=" + channelDTO +
                '}';
    }
}
