package com.navikapp.navik.service;

import com.navikapp.navik.domain.Activity;
import com.navikapp.navik.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    private ActivityRepository activityRepository;

    @Autowired
    public ActivityServiceImpl(ActivityRepository activityRepository){
        this.activityRepository = activityRepository;
    }

    @Override
    public List<Activity> list() {
        return activityRepository.findAll();
    }

    @Override
    public List<Activity> findAll() {
        List<Activity> listActivities = new ArrayList<>();
        activityRepository.findAll().iterator().forEachRemaining(listActivities::add);
        return listActivities;
    }

    @Override
    public void save(Activity activity) {
        activityRepository.save(activity);
    }
}
