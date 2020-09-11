package com.example.helloworld.demo.controller;

import com.example.helloworld.demo.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository repository;

    public List<Topic> getAllTopic(){
        return repository.findAll();
    }
    public void insertTopic(Topic topic){
        repository.save(topic);
    }
}
