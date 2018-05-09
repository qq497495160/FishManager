package com.game.manager;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ComponentScan
@EnableAutoConfiguration
public class FishManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FishManagerApplication.class, args);
	}
	
    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello ,spring boot!";
    }

    @RequestMapping("/best")
    @ResponseBody
    public String best() {
        return "best 界面";
    }
    
    @RequestMapping("/")
    String home() {
        System.out.println("cao!!!");
        return "login.html";
    }
}
