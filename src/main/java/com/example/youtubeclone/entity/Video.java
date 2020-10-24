package com.example.youtubeclone.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String duration;
    private String videoUrl;
    private String title;
    private String thumbnailUrl;
    private int views;
    private Date uploadDate;

    @ManyToOne
    @JoinColumn(name = "channel_id", nullable = false)
    private Channel channel;

    public Video() {}

    public Video(Long id, String duration, String videoUrl, String title, String thumbnailUrl, int views, Date uploadDate, Channel channel) {
        this.id = id;
        this.duration = duration;
        this.videoUrl = videoUrl;
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
        this.views = views;
        this.uploadDate = uploadDate;
        this.channel = channel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
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

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", duration='" + duration + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", title='" + title + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", views=" + views +
                ", uploadDate=" + uploadDate +
                ", channel=" + channel +
                '}';
    }
}
