package com.example.demo.entity;


import com.example.demo.model.Notification;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection="notification")
@Data
public class NotificationEntity {

    @Id
    private String id;
    private String userEmail;
    private String notificationMessage;
    private LocalDate notificationDate;
    private LocalTime notificationTime;


//    public static Notification toCore(NotificationEntity notificationEntity) {
//        Notification notification = new Notification();
//        notification.setUserEmail(notificationEntity.getUserEmail());
//        notification.setNotificationMessage(notificationEntity.getNotificationMessage());
//        notification.setNotificationDate(notificationEntity.getNotificationDate());
//        notification.setNotificationTime(notificationEntity.getNotificationTime());
//        return notification;
//    }


}
