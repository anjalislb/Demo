package com.example.demo.interfaces;
import com.example.demo.entity.NotificationEntity;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

    @Component
    public interface NotificationService {

        //@Bean
        NotificationEntity saveNotification(NotificationEntity notificationEntity);
        //@Bean
        List<NotificationEntity> getAllNotifications();
    }


