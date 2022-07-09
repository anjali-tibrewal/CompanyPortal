import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { baseUrl } from 'src/environments/environment';

const httpOptions = {
  headers : new HttpHeaders({'Content-type' : 'application/json'})
};
@Injectable({
  providedIn: 'root'
})
export class PortalServiceService {

  constructor(private _http : HttpClient) { 

  }

  getJobs(): Observable<any>{
    return this._http.get(`${baseUrl}getJobs`)
    .pipe(response => {
      return response;
    });
  }

  searchJobs(data: any): Observable<any>{
    let body = JSON.stringify(data);
    return this._http.post(`${baseUrl}searchJobs`, body, httpOptions)
    .pipe(response => {
      return response;
    });
  }

  getJobNames():Observable<any>{
    return this._http.get(`${baseUrl}getJobNames`)
    .pipe(response => {
      return response;
    });
  }

  getLocations():Observable<any>{
    return this._http.get(`${baseUrl}getLocations`)
    .pipe(response => {
      return response;
    });
  }

  saveApplicant(data: any): Observable<any>{
    let body = JSON.stringify(data);
    return this._http.post(`${baseUrl}saveApplicant`, body, httpOptions)
    .pipe(response => {
      return response;
    });
  }
}
