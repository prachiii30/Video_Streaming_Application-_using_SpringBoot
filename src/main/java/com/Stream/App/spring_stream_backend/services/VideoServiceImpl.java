package com.Stream.App.spring_stream_backend.services;


import com.Stream.App.spring_stream_backend.entities.Video;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Override
    public Video save(Video video, MultipartFile file) {
        return null;
    }

    @Override
    public Video get(String videoId) {
        return null;
    }

    @Override
    public Video getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getaAll() {
        return List.of();
    }
}
