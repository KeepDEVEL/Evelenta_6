package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<String> messages;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.messages = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public void deleteMessage(int messageId) {
        if (messageId >= 0 && messageId < messages.size()) {
            messages.remove(messageId);
        } else {
            System.out.println("Invalid message id.");
        }
    }

    public List<String> getMessages() {
        return messages;
    }
}
