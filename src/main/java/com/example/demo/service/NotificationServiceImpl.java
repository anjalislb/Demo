package com.example.demo.service;
import com.example.demo.entity.NotificationEntity;
import com.example.demo.interfaces.NotificationService;
import com.example.demo.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public NotificationEntity saveNotification(NotificationEntity notificationEntity) {
        return notificationRepository.save(notificationEntity);
    }

    @Override
    public List<NotificationEntity> getAllNotifications() {
        return notificationRepository.findAll();
    }
}

