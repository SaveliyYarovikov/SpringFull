package com.example.serving_web_content;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Map<String, Object> model){
        model.put("name", name);
        return "greeting";
    }
    @GetMapping
    public String start(Map<String, Object> model){
        model.put("start", "let`s start");
        return "start";
    }
}
