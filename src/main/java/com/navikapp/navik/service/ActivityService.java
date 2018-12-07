package com.navikapp.navik.service;

import com.navikapp.navik.domain.Activity;

public interface ActivityService {

    public Iterable<Activity> list();

    public void save(Activity activity);
}
