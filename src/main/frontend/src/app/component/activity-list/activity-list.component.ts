import { Component, OnInit } from '@angular/core';
import {Activity} from '../../model/activity';

@Component({
  selector: 'app-activity-list',
  templateUrl: './activity-list.component.html',
  styleUrls: ['./activity-list.component.css']
})
export class ActivityListComponent implements OnInit {

  activities: Activity[] = [

    { name : 'Test', completed : false },
    { name : 'Test 2', completed : false },
    { name : 'Test 3', completed: false},
    { name : 'Test 4', completed : false },
    { name : 'Test 5', completed: false}
  ];

  constructor() { }

  ngOnInit() {
  }

}
