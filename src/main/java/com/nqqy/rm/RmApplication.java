package com.nqqy.rm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RmApplication {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(RmApplication.class, args);
    }

}
