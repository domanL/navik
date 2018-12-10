package com.navikapp.navik.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Activity")
public class Activity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Boolean completed;

}
