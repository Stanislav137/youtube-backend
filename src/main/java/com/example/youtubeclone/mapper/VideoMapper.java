package com.example.youtubeclone.mapper;

import com.example.youtubeclone.dto.VideoDTO;
import com.example.youtubeclone.entity.Video;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface VideoMapper {
    List<VideoDTO> videoEntitiesToDTOs(Iterable<Video> videos);
    Video videoDTOToEntity(VideoDTO videoDTO);
}
