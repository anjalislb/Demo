package com.example.demo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Notification {

    private String userEmail;
    private String notificationMessage;
    private LocalDate notificationDate;
    private LocalTime notificationTime;
}
