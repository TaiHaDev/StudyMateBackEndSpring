package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.model.Subscription;
import com.StudyMate.StudyMate.service.SubscriptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscription")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping()
    public void addNewSubscription(@RequestBody Subscription subscription){
        subscriptionService.save(subscription);
    }

    @DeleteMapping("/{subscriptionId}")
    public void deleteSubscriptionById(@PathVariable Integer subscriptionId){
        subscriptionService.delete(subscriptionId);
    }
}
