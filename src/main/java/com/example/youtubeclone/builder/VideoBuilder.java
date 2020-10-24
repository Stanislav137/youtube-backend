package com.example.youtubeclone.builder;

import com.example.youtubeclone.entity.Channel;
import com.example.youtubeclone.entity.Video;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class VideoBuilder {
    private Long id;
    private String duration;
    private String videoUrl;
    private String thumbnailUrl;
    private String title;
    private Channel channel;
    private int views;
    private Date uploadDate;

    public VideoBuilder(Long id, String duration, String videoUrl, String thumbnailUrl, String title, int views, Date uploadDate) {
        this.id = id;
        this.duration = duration;
        this.videoUrl = videoUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
        this.views = views;
        this.uploadDate = uploadDate;
    }

    public VideoBuilder() {

    }

    public VideoBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public VideoBuilder setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    public VideoBuilder setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public VideoBuilder setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public VideoBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public VideoBuilder setViews(int views) {
        this.views = views;
        return this;
    }

    public VideoBuilder setUploadDate() {
        this.uploadDate = new Date();
        return this;
    }

    public VideoBuilder setChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public Video build() {
        return new Video(id, duration, videoUrl, title, thumbnailUrl, views, uploadDate, channel);
    }
}
