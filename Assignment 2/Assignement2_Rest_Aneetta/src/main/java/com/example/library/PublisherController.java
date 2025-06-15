package com.example.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class PublisherController {

    @Autowired
    private PublisherRepository publisherRepository;

    // Get all publishers
    @GetMapping("/publishers")
    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }
    // Get publisher by ID
    @GetMapping("/publishers/{id}")
    public Publisher getPublisherById(@PathVariable int id) {
        return publisherRepository.findById(id).orElse(null);
    }

    // Create a new publisher
    @PostMapping("/publisher")
    public Publisher createPublisher(@RequestBody Publisher publisher) {
        return publisherRepository.save(publisher);
    }
}
