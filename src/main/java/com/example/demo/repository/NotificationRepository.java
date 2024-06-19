package com.example.demo.repository;

import com.example.demo.entity.NotificationEntity;
import com.example.demo.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Properties;
@Repository
public interface NotificationRepository extends MongoRepository<NotificationEntity, String> {

}
