package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.Subscription;

import java.util.List;

public interface SubscriptionService {
    List<Subscription> getSubscriptionByUserId(Integer userId);

    void delete(Integer subscriptionId);

    void save(Subscription subscription);
}
