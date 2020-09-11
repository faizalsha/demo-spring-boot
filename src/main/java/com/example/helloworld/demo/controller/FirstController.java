package com.example.helloworld.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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

}
