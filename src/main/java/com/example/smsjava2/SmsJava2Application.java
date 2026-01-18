package com.example.smsjava2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SmsJava2Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SmsJava2Application.class, args);
        var manager = context.getBean(NotificationManager.class);
        manager.sendNotification("This is a test");
    }

}
