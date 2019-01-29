package com.navikapp.navik.controller;


import com.navikapp.navik.domain.Activity;
import com.navikapp.navik.domain.ApiResponse;
import com.navikapp.navik.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/activity-list")
public class ActivityController {

    private ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService){
        this.activityService = activityService;
    }

//    @GetMapping(value = {"","/"})
////    public List<Activity> activityList(){
////        return activityService.list();
////    }

    @GetMapping
    public ApiResponse<List<Activity>> listReceipt(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Activity list fetched successfully.",activityService.findAll());
    }

}
