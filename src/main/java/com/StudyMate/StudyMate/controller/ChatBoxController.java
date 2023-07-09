package com.StudyMate.StudyMate.controller;


import com.StudyMate.StudyMate.dto.ChatBotResponse;
import com.StudyMate.StudyMate.dto.ChatGPTRequest;
import com.StudyMate.StudyMate.dto.ChatGPTResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/chatbox")
public class ChatBoxController {

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiURL;

    @Autowired
    private RestTemplate template;


    @GetMapping("/chat")
    public ChatBotResponse chat(@RequestParam("prompt") String prompt){
        try {
            ChatGPTRequest request=new ChatGPTRequest(model, prompt);
            ChatGPTResponse chatGPTResponse = template.postForObject(apiURL, request, ChatGPTResponse.class);
            return new ChatBotResponse(chatGPTResponse.getChoices().get(0).getMessage().getContent());
        } catch (Exception e) {
            return new ChatBotResponse("helloooooo");
        }
    }
}
