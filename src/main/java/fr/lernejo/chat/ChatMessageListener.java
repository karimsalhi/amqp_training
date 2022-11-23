package fr.lernejo.chat;

import org.springframework.stereotype.Component;

public class ChatMessageListener {

    public void onMessage(String message) {
        System.out.println(message);
    }
}
