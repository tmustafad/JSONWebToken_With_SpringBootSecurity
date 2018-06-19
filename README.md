# JSON WebToken With Spring Boot Security

How to use JSON Web Tokens along with Spring Boot.


## The Goal

Generating JWT tokens and how to use it for authenticating a user for accessing rest endpoints. Because this projet is for demonstration purposes , I will not use an authentication server, a rest endpoint will be used to generate token instead.


### Installing

In Pom.xml you can find all required dependencies , once you install the project with maven, just start it as springboot app and your rest endpoints start to serve immediately on embededed tomcat at the port 8080 unless you change it .

## The Endpoints to reach after running the project
**http://localhost:8080/index** This is a **GET** endpoint ,you need to include the token to the header of the request in order to successfully get the result.

**header values==>** **Key=Authorisation**  **Value=Check <THE GENERATED TOKEN>**

**http://localhost:8080/token** This is a **POST** request for getting the token


## Deployment

Embededed Tomcat is coming out of the box ,so no need for extra effort to package the project as war or jar and deploy it to somewhere unless you have special intentions .


