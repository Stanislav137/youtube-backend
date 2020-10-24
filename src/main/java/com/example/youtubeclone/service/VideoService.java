package com.example.youtubeclone.service;

import com.example.youtubeclone.dto.VideoDTO;
import com.example.youtubeclone.dto.VideoUpdateDTO;
import com.example.youtubeclone.entity.Channel;
import com.example.youtubeclone.entity.Video;
import com.example.youtubeclone.exception.ChannelNotExistException;
import com.example.youtubeclone.exception.VideoNotExistException;
import com.example.youtubeclone.mapper.VideoMapper;
import com.example.youtubeclone.repository.ChannelRepository;
import com.example.youtubeclone.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    private static final String VIDEO_NOT_EXIST = "Video not exist";
    private static final String CHANNEL_NOT_EXIST = "Channel not exist";

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private ChannelRepository channelRepository;

    @Autowired
    private VideoMapper videoMapper;

    @Transactional(readOnly = true)
    public List<VideoDTO> getVideos(Long channelId) {
        Optional<Channel> channel = channelRepository.findById(channelId);

        if (channel.isEmpty()) {
            throw new ChannelNotExistException(CHANNEL_NOT_EXIST);
        }

        return videoMapper.videoEntitiesToDTOs(channel.get().getVideos());
    }

    @Transactional
    public void saveNewVideo(VideoDTO videoDTO, Long channelId) {
        Optional<Channel> channel = channelRepository.findById(channelId);

        if (channel.isEmpty()) {
            throw new ChannelNotExistException(CHANNEL_NOT_EXIST);
        }

        videoDTO.setUploadDate(new Date());
        Video video = videoMapper.videoDTOToEntity(videoDTO);

        video.setChannel(channel.get());
        videoRepository.save(video);
    }

    @Transactional
    public void updateVideoData(Long videoId, VideoUpdateDTO videoUpdateDTO) {
        Optional<Video> videoFromDB = videoRepository.findById(videoId);

        if (videoFromDB.isEmpty()) {
            throw new VideoNotExistException(VIDEO_NOT_EXIST);
        }

        videoFromDB.get().setThumbnailUrl(videoUpdateDTO.getThumbnailUrl());
        videoFromDB.get().setTitle(videoUpdateDTO.getTitle());

        videoRepository.save(videoFromDB.get());
    }

    @Transactional
    public void deleteVideo(Long videoId) {
        Optional<Video> videoFromDB = videoRepository.findById(videoId);

        if (videoFromDB.isEmpty()) {
            throw new VideoNotExistException(VIDEO_NOT_EXIST);
        }

        videoRepository.delete(videoFromDB.get());
    }
}
