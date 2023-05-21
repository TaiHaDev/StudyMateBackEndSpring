package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.model.FlashCard;
import com.StudyMate.StudyMate.model.Flash_card_set;
import com.StudyMate.StudyMate.model.User;
import com.StudyMate.StudyMate.repository.FlashcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flashcard")
public class Controller {
    private Integer setID;
    @Autowired
    FlashcardRepository flashcardRepository;


    @GetMapping("")
    public List<FlashCard> getFlashCard() {
        return flashcardRepository.findAll();
    }



// code rat hay, xung dang 10 anh nguoi yeu
//    @GetMapping("/user/{userID}")
//    public List<String> getFlashCardContentByUserID(List<FlashCard> flashCards,
//                                                    List<Flash_card_set> flashCardSets,
//                                                    List<User> users,
//                                                    @PathVariable Integer userID) {
//        List<String> flashCardContent = new ArrayList<>();
//
//        // Find use based on ID
//        User user = null;
//        for (User u : users) {
//            if (u.getId() == userID) {
//                user = u;
//                break;
//            }
//
//        }
//
//        if (user != null) {
//            //Get user's subscription
//            String subscription = user.getSubscription();
//
//            // Check if the subscription is valid
//            if (subscription != null) {
//                for (Flash_card_set flash_card_set : flashCardSets) {
//                    //Check if flashcard set belongs to user
//                    if (flash_card_set.getUserID().equals(userID)) {
//                        setID = flash_card_set.getId();
//                    }
//                    // Loop flash cards
//                    for (FlashCard flash_card : flashCards) {
//                        // Check the flash card belong to the set
//                        if (flash_card.getSetID().equals(setID)) {
//                            flashCardContent.add(flash_card.getContent());
//                        }
//                    }
//                }
//            }
//        }
//        return flashCardContent;
//    }
}
