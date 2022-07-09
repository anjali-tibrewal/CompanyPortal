import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { PortalServiceService } from '../portal-service.service';

@Component({
  selector: 'app-apply-now',
  templateUrl: './apply-now.component.html',
  styleUrls: ['./apply-now.component.scss']
})
export class ApplyNowComponent implements OnInit {

  constructor(public portalService: PortalServiceService) { }

  public showValidations: boolean = false;

  form = new FormGroup({
    firstName : new FormControl(''),
	 lastName : new FormControl(''),
	 gender : new FormControl(''),
	 dob : new FormControl(''),
	 email : new FormControl(''),
	 phone : new FormControl(''),
	 addrLine1 : new FormControl(''),
	 addrLine2 : new FormControl(''),
	 addrState : new FormControl(''), 
	 addrCity : new FormControl(''),
	 addrZip : new FormControl(''),
	 positionApplied : new FormControl(''), 
	 availableStartDate : new FormControl(''),
	 currentEmploymentStatus : new FormControl(''),
	 currentCtc : new FormControl(''),
	 expectedCtc : new FormControl(''),
	 noticePeriod : new FormControl(''),
	 skills : new FormControl(''),
	 trainings : new FormControl(''),
	 referenceInd : new FormControl(''),
	 reference1FirstName : new FormControl(''),
	 reference1LastName : new FormControl(''),
	 reference1Gender : new FormControl(''),
	 reference1Dob : new FormControl(''),
	 reference1Email : new FormControl(''), 
	 reference1Phone : new FormControl(''),
	 reference1AddrLine1 : new FormControl(''),
	 reference1AddrLine2 : new FormControl(''), 
	 reference1AddrState : new FormControl(''),
	 reference1AddrCity : new FormControl(''),
	 reference1AddrZip : new FormControl(''),
	 reference2FirstName : new FormControl(''),
	 reference2LastName : new FormControl(''),
	 reference2Gender : new FormControl(''),
	 reference2Dob : new FormControl(''),
	 reference2Email : new FormControl(''), 
	 reference2Phone : new FormControl(''),
	 reference2AddrLine1 : new FormControl(''),
	 reference2AddrLine2 : new FormControl(''), 
	 reference2AddrState : new FormControl(''),
	 reference2AddrCity : new FormControl(''),
	 reference2AddrZip : new FormControl('')
  });

  
  ngOnInit(): void {
	this.showValidations = false;
  }

  saveApplicant(){
	if(!this.form.dirty){
		this.showValidations = true;
	}
	if(this.form.dirty){
		this.showValidations = false;
		this.portalService.saveApplicant(this.form.value).subscribe(data =>{
			console.log(data);
		  });
	}
    
  }

}
