# LibraryManagement
LibraryManagement
---------------------

Built Library Management using SpringBoot 

For DB , i used Derby database

In this application, exposed REST services to perform the add, view and search operations on Library Management.

Services:

http://hostname:8080/add --POST
http://hostname:8080/viewall --GET
http://hostname:8080/view/{id} --POST


Steps to run this application are as follows:
---------------------------------------------
Step 1 : Build the application using below Maven command

clean install

Step 2 : We can run this application in 2 ways 

(1) By running LibaryManagementApplication.java file as RunAs Java Application.

(2) By running the Jar file which is inside the target.

