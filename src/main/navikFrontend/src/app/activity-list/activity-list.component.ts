import { Component, OnInit } from '@angular/core';
import {Activity} from "../model/activity.model";
import {ApiService} from "../core/api.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-activity-list',
  templateUrl: './activity-list.component.html',
  styleUrls: ['./activity-list.component.css']
})
export class ActivityListComponent implements OnInit {

  activities: Activity[];

  constructor(private router: Router, private apiService: ApiService) { }

  ngOnInit() {
    if(!window.localStorage.getItem('token')) {
      this.router.navigate(['login']);
      return;
    }

    this.apiService.getActivities()
      .subscribe( data => {
        this.activities = data.result;
      });
  }

  }

