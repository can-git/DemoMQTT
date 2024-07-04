package org.example.demomqtt.services;

import org.springframework.stereotype.Service;

@Service
public class DemoServices {

    private int message;

    public void addMessage(int message) {
        this.message = message;
    }

    public int getMessage() {return message;}
}
