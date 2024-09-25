package org.example.springaichat.controller;


import org.example.springaichat.service.AIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/api/v1/generate")
    public String generate(@RequestParam(value= "message") String prompt){
        return aiService.generateResult(prompt);
    }
}
