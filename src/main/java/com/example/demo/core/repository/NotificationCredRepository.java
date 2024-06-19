package com.example.demo.core.repository;

import com.example.demo.entity.NotificationEntity;

import java.util.List;

public interface NotificationCredRepository {

    public NotificationEntity saveNotification(NotificationEntity notificationEntity);

    public List<NotificationEntity> getAllNotifications();
}
