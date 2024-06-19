//package com.example.demo.controller;
//
//import com.example.demo.entity.NotificationEntity;
//import com.example.demo.interfaces.NotificationService;
//import com.example.demo.model.Notification;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/notifications")
//
//    public class NotificationController {
//
//        private final NotificationService notificationService;
//        private Object authTokenParser;
//        private String userEmail;
//
//    @Autowired
//        public NotificationController(NotificationService notificationService) {
//            this.notificationService = notificationService;
//        }
//
//    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<NotificationEntity> getNotification(){
//        Object authorization;
//        String userEmail = this.userEmail;
//        return this.notificationService.getNotifications(userEmail);
//        }
//    }



//    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Hello> sayHello(){
//        Hello hello = new Hello();
//        hello.setMessage("Hello World");
//        return new ResponseEntity<>(hello, HttpStatus.OK);
//    }

    //Get API for getting all the notifications from Mongo




    // Post API for creating the Notifications Object in Mongo


package com.example.demo.controller;


import com.example.demo.entity.NotificationEntity;
import com.example.demo.interfaces.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    public NotificationService notificationService;


    @PostMapping(value = "/push", produces = MediaType.APPLICATION_JSON_VALUE)
    public NotificationEntity saveNotification(@RequestBody NotificationEntity notificationEntity) {
        return notificationService.saveNotification(notificationEntity);
    }

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NotificationEntity> getAllNotifications() {
        return notificationService.getAllNotifications();
    }
}


