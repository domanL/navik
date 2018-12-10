package com.navikapp.navik.service;

import com.navikapp.navik.domain.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> list();

    void save(Activity activity);
}
