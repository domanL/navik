import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Activity} from "../model/activity.model";
import {Observable} from "rxjs/index";
import {ApiResponse} from "../model/api.response";

@Injectable()
export class ApiService {

  constructor(private http: HttpClient) { }
  baseUrl: string = 'http://localhost:8080/';
  activityListUrl: string = 'activity-list/';

  getActivities() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl + this.activityListUrl);
  }

  getActivityById(id: number): Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl + this.activityListUrl+id);
  }
}
