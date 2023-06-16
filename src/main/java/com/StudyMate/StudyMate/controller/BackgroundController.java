package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.service.BackgroundService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/background")
public class BackgroundController {
    private final BackgroundService backgroundService;

    public BackgroundController(BackgroundService backgroundService) {
        this.backgroundService = backgroundService;
    }
    @GetMapping("/{themeName}")
    public List<Background> getBackgroundByTheme(@PathVariable String themeName) {
        return backgroundService.getBackgroundByTheme(themeName);
    }
    @PostMapping()
    public void addNewBackground(@RequestBody Background background) {
        System.out.println("helllllldsfjkladsfjklsaklskadfkjl;");
        System.out.println(background);
        backgroundService.save(background);
    }
    @DeleteMapping("/{backgroundId}")
    public void deleteBackgroundById(@PathVariable long backgroundId) {
        backgroundService.delete(backgroundId);
    }

}
