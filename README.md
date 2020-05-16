Project Title
==============
API creation and authentication

Getting Started
================
This project is built using Spring Boot, Spring REST, Spring JPA, Spring Security(BCrypt) and in-memory database H2.
Initial set of data are pushed into DB using h2-data.sql script placed in resources folder.
This project contains two REST APIs (getconfigdetails and getproductdetails) which returs the data from DB in JSON format.
These APIs can be accessed only for authenticated users. The users are stored in DB. The passwords are stored in Bcrypt format.
Coding was done using STS IDE and testing was done using Postman tool

Prerequisites
=============
Java 11
Spring Tool Suite(STS)
Postman tool - testing

Running the tests
=================
Using Postman tool,
TEST CASE 1: Get config details - authentication success
Request type: GET ; localhost:8080/api/getconfigdetails;
Authorization -> Basic Auth -> 
Provide any of the below credentials :
Username : testuser1 ; Password : testuser1
Username : testuser2 ; Password : testuser2
Username : testuser3 ; Password : testuser3

Expected Output:
[
    {
        "name": "x64",
        "description": "64 bit"
    },
    {
        "name": "x32",
        "description": "32 bit"
    }
]

TEST CASE 2: Get config details - authentication success
Request type: GET ; localhost:8080/api/getproductdetails
Authorization -> Basic Auth -> 
Provide any of the below credentials :
Username : testuser1 ; Password : testuser1
Username : testuser2 ; Password : testuser2
Username : testuser3 ; Password : testuser3

Expected Output:
[
    {
        "name": "Dell Laptop",
        "description": "With i3"
    },
    {
        "name": "HP Laptop",
        "description": "With i5"
    }
]


TEST CASE 3: Get config details - authentication failure
Request type: GET ; localhost:8080/api/getconfigdetails
Authorization -> Basic Auth -> 
Provide any invalid credential:
ex: Username: tester Password: password

Expected Output:
Authentication will fail and disallows to access the API

TEST CASE 4: Get config details - authentication failure
Request type: GET ; localhost:8080/api/getproductdetails
Authorization -> Basic Auth -> 
Provide any invalid credential:
ex: Username: tester Password: password

Expected Output:
Authentication will fail and disallows to access the API


Built With
==========
Spring Boot - Java Framework
Maven - Dependency Management
Spring JPA - Database connectivity

Deployment
===========
Import the project as maven project into STS(Spring Tool Suite)
Right click on the project -> Maven -> Update Project -> Force update snapshots -> OK
Right click on the project -> Run as -> Spring Boot app

Versioning
==========
1.0

Authors
=======
Karthiga Mani

License
=======
This project is not licensed

