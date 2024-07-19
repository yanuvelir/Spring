package com.yan.springApp.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World, test for reboot";
    }

    @GetMapping("/img")
    public ResponseEntity<byte[]> testPage() throws IOException {
        Resource imgFile = new ClassPathResource("static/img.png");

        byte[] imageBytes = Files.readAllBytes(imgFile.getFile().toPath());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        headers.setContentLength(imageBytes.length);

        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
    }

}
