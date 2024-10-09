package com.Stream.App.spring_stream_backend.repositories;

import com.Stream.App.spring_stream_backend.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface VideoRepository extends JpaRepository<Video,String> {
    Optional<Video>findByTitle(String title);


    //query method
    //native query
    //criteria api



}
