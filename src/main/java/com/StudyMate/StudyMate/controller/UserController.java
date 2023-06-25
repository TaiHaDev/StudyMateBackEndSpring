package com.StudyMate.StudyMate.controller;
import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.User;
import com.StudyMate.StudyMate.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public List<User> getBackgroundByUserId(@PathVariable long userId) {
        return userService.getBackgroundByUserId(userId);
    }
    @PostMapping()
    public void addNewUser(@RequestBody User user) {
        userService.save(user);
    }
    @DeleteMapping("/{userId}")
    public void deleteUserById(@PathVariable long userId) {
        userService.delete(userId);
    }

}
