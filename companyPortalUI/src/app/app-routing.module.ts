import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ApplyNowComponent } from './apply-now/apply-now.component';
import { HomeComponent } from './home/home.component';
import { JobDetailsComponent } from './job-details/job-details.component';
import { JobListingComponent } from './job-listing/job-listing.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'jobs',
    component: JobListingComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'apply-now',
    component: ApplyNowComponent
  },
  {
    path: 'jobDetails',
    component: JobDetailsComponent
  },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
