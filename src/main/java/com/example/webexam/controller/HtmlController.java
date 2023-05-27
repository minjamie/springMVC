package com.example.webexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HtmlController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "<body>\n" +
                "<h1>hi world</h1>\n" +
                "</body>\n" +
                "</html>";
    }
}
