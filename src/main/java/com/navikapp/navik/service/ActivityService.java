package com.navikapp.navik.service;

import com.navikapp.navik.domain.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> list();

    List<Activity> findAll();
    void save(Activity activity);
}
