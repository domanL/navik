package com.navikapp.navik.controller;


import com.navikapp.navik.domain.Activity;
import com.navikapp.navik.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/activity")
public class ActivityController {

    private ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService){
        this.activityService = activityService;
    }

    @GetMapping(value = {"","/"})
    public List<Activity> activityList(){
        return activityService.list();
    }

}
