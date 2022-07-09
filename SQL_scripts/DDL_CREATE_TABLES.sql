spool DDL_CREATE_TABLES.log
set echo on

create database companyPortal;

create table companyPortal.locations(
location_id int,
location_desc varchar(100),
dtm_created date,
created_by varchar(100),
dtm_modified date,
modified_by varchar(100)
);

alter table companyPortal.locations add primary key (location_id);
ALTER TABLE companyportal.locations MODIFY COLUMN location_id INT auto_increment;

create table companyPortal.jobs(
job_id int,
job_desc varchar(100),
job_location int,
posted_date date,
offered_salary varchar(50),
job_type varchar(20),
company_name varchar(100),
dtm_created date,
min_experience varchar(10),
created_by varchar(100),
dtm_modified date,
modified_by varchar(100)
);

alter table companyPortal.jobs add primary key (job_id);
ALTER TABLE companyportal.jobs MODIFY COLUMN job_id INT auto_increment;
ALTER TABLE companyportal.jobs ADD CONSTRAINT LOCATION_ID_FK FOREIGN KEY (job_location) REFERENCES companyportal.locations(location_id);


create table companyPortal.applicant_info(
applicant_id int,
first_name varchar(100),
last_name varchar(100),
gender varchar(2),
DOB date,
email varchar(100),
position_applied varchar(100),
available_start_date date,
current_employment_status varchar(100),
current_ctc varchar(50),
expected_ctc varchar(50),
notice_period varchar(50),
skills varchar(500),
trainings varchar(500),
reference_ind varchar(1)
);


alter table companyPortal.applicant_info add primary key (applicant_id);
ALTER TABLE companyportal.applicant_info MODIFY COLUMN applicant_id INT auto_increment;


create table companyportal.applicant_refrences(
reference_id int,
applicant_id int,
reference_firstName varchar(100),
reference_lastName varchar(100),
reference_gender varchar(2),
reference_dob date,
reference_email varchar(100),
reference_phone varchar(10),
reference_addr_line1 varchar(100),
reference_addr_line2 varchar(100),
reference_addr_state varchar(100),
reference_addr_city varchar(100),
reference_addr_zip varchar(100)
);

alter table companyportal.applicant_refrences add primary key (reference_id);
ALTER TABLE companyportal.applicant_refrences MODIFY COLUMN reference_id INT auto_increment;
ALTER TABLE companyportal.applicant_refrences ADD CONSTRAINT APPLICANT_ID_FK FOREIGN KEY (applicant_id) REFERENCES companyportal.applicant_INFO(applicant_id);

create table companyportal.applicant_contact(
contact_id int,
applicant_id int,
email varchar(100),
phone varchar(10),
addr_line1 varchar(100),
addr_line2 varchar(100),
addr_state varchar(100),
addr_city varchar(100),
addr_zip varchar(100)
);

alter table companyportal.applicant_contact add primary key (contact_id);
ALTER TABLE companyportal.applicant_contact MODIFY COLUMN contact_id INT auto_increment;
ALTER TABLE companyportal.applicant_contact ADD CONSTRAINT APPLICANT_ID_CONTACT_FK FOREIGN KEY (applicant_id) REFERENCES companyportal.applicant_INFO(applicant_id);

commit;
spool off
