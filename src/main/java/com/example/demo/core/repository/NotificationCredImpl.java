//package com.example.demo.core.repository;
//
//import com.example.demo.entity.NotificationEntity;
//import com.example.demo.repository.NotificationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//@Component
//public class NotificationCredImpl implements NotificationCredRepository{
//
//    @Autowired
//    private NotificationRepository notificationRepository;
//
//    @Override
//    public NotificationEntity saveNotification(NotificationEntity notificationEntity) {
//        return notificationRepository.save(notificationEntity);
//    }
//
//    @Override
//    public List<NotificationEntity> getAllNotifications() {
//        return notificationRepository.findAll();
//    }
//}
