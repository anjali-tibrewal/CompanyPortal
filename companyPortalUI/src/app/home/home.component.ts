import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { baseUrl } from 'src/environments/environment';
import { PortalServiceService } from '../portal-service.service';
import {Job} from '../../app/model/job.model';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

const httpOptions = {
  headers : new HttpHeaders({'Content-type' : 'application/json'})
};
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})



export class HomeComponent implements OnInit {

  constructor(public portalService: PortalServiceService, private router: Router) { }

  [x: string]: any;
  lastKeyDown = 0;
  public jobs : Array<String> = [];
  jobList : Array<String> = [];

  public locations : Array<String> = [];
  locationList : Array<String> = [];

  public openJobsList : Array<Job> = [];

  form = new FormGroup({
    jobDesc : new FormControl(''),
    jobLocation: new FormControl('')
  });


  ngOnInit(): void {
    this.portalService.getJobNames().subscribe(data=>{
      let jobNames = data.map(item => {
        return item;
      });
      this.jobs.length = 0;
      this.jobs.push(...jobNames);
    });
    this.portalService.getLocations().subscribe(data=>{
      let locationNames = data.map(item => {
        return item;
      });
      this.locations.length = 0;
      this.locations.push(...locationNames);
    });
    this.portalService.getJobs().subscribe(data=>{
      let groups = data.map(item => {
        return item;
      });
      this.openJobsList.length = 0;
      this.openJobsList.push(...groups);
      if(this.openJobsList.length > 5){
        while(this.openJobsList.length > 5){
          this.openJobsList.pop();
        }
      }
    });
    
  }

  getJobs($event){
    let jobName = (document.getElementById('jobDesc') as HTMLInputElement).value;
    this.jobList = [];

    if(jobName.length > 0){
      if($event.timeStamp - this.lastKeyDown > 200){
        this.jobList = this.searchFromArray(this.jobs, jobName);
      }
    }else{
      this.jobList = this.jobs;
    }
    
  }

  getLocations($event){
    let jobLocation = (document.getElementById('jobLocation') as HTMLInputElement).value;
    this.locationList = [];

    if(jobLocation.length > 0){
      if($event.timeStamp - this.lastKeyDown > 200){
        this.locationList = this.searchFromArray(this.locations, jobLocation);
      }
    }else{
      this.locationList = this.locations;
    }
    
  }

  searchFromArray(arr, regex){
    let matches: any = [], i;
    for(i=0; i< arr.length; i++){
      let r = arr[i].search(new RegExp(regex, "i"));
      if(r != i){
        matches.push(arr[i])
      }
    }
    return matches;
  }

  searchJobs(){
    //this.form.controls.jobDesc.setValue((document.getElementById('jobDesc') as HTMLInputElement).value);
    this.portalService.searchJobs(this.form.value).subscribe(data =>{
      this.router.navigate(['./jobs']);
    });
  }

}
