package com.Stream.App.spring_stream_backend.services;

import com.Stream.App.spring_stream_backend.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VideoService {

    //save video

    Video save(Video video, MultipartFile file);

    //get video by id
    Video get(String videoId);

    //get Video by Title
    Video getByTitle(String title);


    //get All video
    List<Video> getaAll();
}
