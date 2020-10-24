package com.example.youtubeclone.controller;

import com.example.youtubeclone.dto.VideoDTO;
import com.example.youtubeclone.dto.VideoUpdateDTO;
import com.example.youtubeclone.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class VideoController {

    private static final String CHANNEL_ID = "channelId";
    private static final String VIDEO_ID = "videoId";

    @Autowired
    private VideoService videoService;

    @RequestMapping(value = "/getVideos/{channelId}", method = RequestMethod.GET)
    public List<VideoDTO> getVideos(@PathVariable(name = CHANNEL_ID) Long channelId) {
        return videoService.getVideos(channelId);
    }

    @RequestMapping(value = "/saveVideo/{channelId}", method = RequestMethod.POST)
    public ResponseEntity<?> saveVideo(@RequestBody VideoDTO videoDTO, @PathVariable(name = CHANNEL_ID) Long channelId) {
        videoService.saveNewVideo(videoDTO, channelId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/updateVideo/{videoId}", method = RequestMethod.PUT)
    public void updateVideo(@RequestBody VideoUpdateDTO videoUpdateDTO, @PathVariable Long videoId) {
        videoService.updateVideoData(videoId, videoUpdateDTO);
    }

    @RequestMapping(value = "/deleteVideo/{videoId}", method = RequestMethod.DELETE)
    public void deleteVideo(@PathVariable(name = VIDEO_ID) Long videoId) {
        videoService.deleteVideo(videoId);
    }

}
