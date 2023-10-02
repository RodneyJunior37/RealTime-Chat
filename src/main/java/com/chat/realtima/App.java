package com.chat.realtima;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.chat.realtima.config.Msg;

@Controller
public class App {
    @MessageMapping("/chatMessage")
    @SendTo("/chat")

    public Msg sendMessage(Msg message){
        return message;
    }

}
