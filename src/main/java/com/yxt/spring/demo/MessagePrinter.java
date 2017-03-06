package com.yxt.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yxt.spring.demo.service.MessageService;

@Component
public class MessagePrinter {

	@Autowired
    private MessageService service;

    /*@Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }*/

    public void printMessage() {
        System.out.println(service.getMessage());
    }
}