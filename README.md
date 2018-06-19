# JSON WebToken With Spring Boot Security

How to use JSON Web Tokens along with Spring Boot.


## The Goal

The goal of this project is to understand the capabilities of Apache Camel on how it can perform as a **smart endpoint**. For achieving this smartness a routing mechanism is built under **route** package where you can find a abstract router class extending **RouteBuilder** and two different routers extending this abstract class . You can think of these two extending classes as single ,independent microservices.Once the router directs messages to relevant ActiveMQ queues, the service who is subscribed to these topics , get and  use the messages.

Another intention of this project is exposing **rest endpoints** with Camel RestDSL and direct these requests  to related queues in ActiveMQ  by using  **RouteBuilder** .

For connecting ActiveMQ ,the **AMQP** protocol is used via **Apache Qpid** libary. You can find how the properties set to connect to ActiveMQ in config package together with **application.properties** file.

### Prerequisites

Because the incoming requests are being directed to ActiveMQ, you need to have activemq installed on your environment.



### Installing

In Pom.xml you can find all required dependencies , once you install the project with maven, just start it as springboot app and your rest endpoints start to serve immediately on embededed tomcat at the port 8080 unless you change it .

## The Endpoints to reach after running the project
**http://localhost:8080/index** This is a **GET** endpoint ,you need to include the token to the header of the request in order to successfully get the result.
**header values==>** **Key=Authorisation  Value= Check <THE GENERATED TOKEN>  **
**http://localhost:8080/token** This is a **POST** request for getting the token


## Deployment

Embededed Tomcat is coming out of the box ,so no need for extra effort to package the project as war or jar and deploy it to somewhere unless you have special intentions .


