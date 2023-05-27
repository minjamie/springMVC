package com.example.webexam.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @GetMapping("/hello.json") // Hello 클래스가 View의 역할
    public Hello hello(){
        Hello hello = new Hello();
        hello.setName("hi json");
        hello.setCount(10);
        return hello;
    }
}


@Data
class Hello {
    private String name;
    private int count;
}