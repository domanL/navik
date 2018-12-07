package com.navikapp.navik.controller;


import com.navikapp.navik.domain.Activity;
import com.navikapp.navik.service.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/activity")
public class ActivityController {

    private ActivityService activityService;

    public ActivityController(ActivityService activityService){
        this.activityService = activityService;
    }


    @GetMapping(value = {"","/"})
    public Iterable<Activity> activityList(){
        return activityService.list();
    }

}
