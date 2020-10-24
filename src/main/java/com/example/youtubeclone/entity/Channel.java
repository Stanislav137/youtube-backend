package com.example.youtubeclone.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Channel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy="channel")
    private Set<Video> videos;

    public Channel() {}

    public Channel(Long id, String name, Set<Video> videos) {
        this.id = id;
        this.name = name;
        this.videos = videos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Video> getVideos() {
        return videos;
    }

    public void setVideos(Set<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", videos=" + videos +
                '}';
    }
}
