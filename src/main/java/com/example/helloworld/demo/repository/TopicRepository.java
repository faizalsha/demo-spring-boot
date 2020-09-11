package com.example.helloworld.demo.repository;

import com.example.helloworld.demo.controller.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, String> {
}
