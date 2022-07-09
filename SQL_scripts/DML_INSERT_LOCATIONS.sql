spool DML_INSERT_LOCATIONS.log
set echo on

INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Bihar', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Hyderabad', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Telangana', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Delhi', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Bhopal', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Bhubaneshwar', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Kerela', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Ranchi', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Surat', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Pune', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Bangalore', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Gurgaon', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Chennai', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Kolkata', sysdate(), 'system', sysdate(), 'system');
INSERT INTO COMPANYPORTAL.LOCATIONS (location_desc,dtm_created,created_by,dtm_modified,modified_by) VALUES ('Mumbai', sysdate(), 'system', sysdate(), 'system');

commit;
spool off

