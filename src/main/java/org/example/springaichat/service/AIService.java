package org.example.springaichat.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    private final OllamaChatModel ollamaChatModel;

    public AIService(OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }

    public String generateResult(String prompt){
        return ollamaChatModel.call(new Prompt(prompt)).getResult().getOutput().getContent();
    }
}
