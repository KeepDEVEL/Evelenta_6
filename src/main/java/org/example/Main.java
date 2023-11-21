package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Ivan");
        user.addMessage("Hello");
        user.addMessage("How are you?");
        user.addMessage("Goodbye");

        System.out.println("Before deleting messages:");
        for (String message : user.getMessages()) {
            System.out.println(message);
        }

        user.deleteMessage(1);

        System.out.println("After deleting messages:");
        for (String message : user.getMessages()) {
            System.out.println(message);
        }
    }
}