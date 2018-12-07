package com.navikapp.navik.service;

import com.navikapp.navik.domain.Activity;
import com.navikapp.navik.repository.ActivityRepository;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {

    private ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository){
        this.activityRepository = activityRepository;
    }

    @Override
    public Iterable<Activity> list() {
        return activityRepository.findAll();
    }

    @Override
    public void save(Activity activity) {
        activityRepository.save(activity);
    }
}
