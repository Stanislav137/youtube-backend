package com.example.youtubeclone.service;

import com.example.youtubeclone.entity.Channel;
import com.example.youtubeclone.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;

@Service
public class ChannelService {
    @Autowired
    private ChannelRepository channelRepository;

    public void createNewChannel() {
        Optional<Channel> channelFromDB = channelRepository.findById(1L);

        if (channelFromDB.isPresent()) {
            Channel channel = new Channel(1L, "Cobra code", new HashSet<>());

            channelRepository.save(channel);
        }
    }
}
