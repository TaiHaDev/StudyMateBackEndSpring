package com.StudyMate.StudyMate.serviceImpl;

import com.StudyMate.StudyMate.model.Subscription;
import com.StudyMate.StudyMate.repository.SubscriptionRepository;
import com.StudyMate.StudyMate.service.SubscriptionService;

import java.util.List;

public class SubscriptionServiceImpl implements SubscriptionService {
    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionServiceImpl(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public List<Subscription> getSubscriptionByUserId(Integer userId){
        return subscriptionRepository.getSubscriptionByUserId(userId);
    }

    @Override
    public void delete(Integer subscriptionId){
        subscriptionRepository.deleteById(subscriptionId);
    }

    @Override
    public void save(Subscription subscription){
        subscriptionRepository.save(subscription);
    }
}
