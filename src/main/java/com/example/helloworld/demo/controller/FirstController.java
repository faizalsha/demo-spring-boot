package com.example.helloworld.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class FirstController {
    @Autowired
    TopicService service;
    @RequestMapping("/foo")
    public String foo(){
        return "foo";
    }

    @RequestMapping("/topics")
    public List<Topic> bar(){
        return service.getAllTopic();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        service.insertTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/delete")
    public void deleteTopicById(@RequestBody String topicId){
        service.deleteTopic(topicId);
    }
}
