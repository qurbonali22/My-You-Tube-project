package com.example.youtube;


import com.example.youtube.util.MD5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YouTubeApplication {

    public static void main(String[] args) {
        System.out.println(MD5.md5("admin"));
        SpringApplication.run(YouTubeApplication.class, args);
    }

}
