# Microservice demo with discovery service using Eureka and Gateway/Proxy using Zuul

Typically by moving to microservice architecture we make small set of services which works collectively as a single (or multiple as well) unit. Eash of them work indenpendenly and communcate with each other based on the need. Any kind of communcation with between services would require a knowledge about each other’s location. 

If we have multiple environments (dev, sit, uat, prod) then configuring, managing, deploying the services challanging if it is not automated as it involes issues in deployment time, monitoring. Add additional nodes for the services in the distributed environment would need better management and collaboration.

Spring Cloud provides tools for developers to quickly build some of the common patterns in distributed systems. Netflix OSS is a set of frameworks and libraries that Netflix wrote to solve some interesting distributed-systems. Netflix open source has contribute many project to spring cloud tools.

##Discovery Service Server using Eureka
Eureka, Netflix OSS project, is a service registry. Each microservice registers itself with Eureka, and then consumers of that service know how to find it using the service directory. Eureka has features for host-side load-balancing and region-isolation as well.

##Proxy/Gateway/Routing Service using Zuul
Zuul is the front door for all requests, as an edge service application. Zuul is built to enable dynamic routing, monitoring, resiliency and security. 
The goal is to work around CORS and the Same Origin Policy restriction of the browser and allow the Servicies/UI to call the API even though they don’t share the same origin.

##Business/Micro Services 
We have UserService, CatalogService and OrderService which has some specific responsibility to do.
OrderService which has the example to connect to CatalogService and UserService as an client. I have use FeignClient for accessing remote services.

##Overview

![https://github.com/deepaksinghvi/microservice/blob/master/microservicedemoarch.png](https://github.com/deepaksinghvi/microservice/blob/master/microservicedemoarch.png)

##Requirement
Java
Maven
Docker

##How to build
mvn clean install

##Running with docker
docker-compose up

##Running services individually without docker
discoveryserver> mvn springboot:run
proxyservice> mvn springboot:run
orderservice> mvn springboot:run
userserice> mvn springboot:run
catalogservice> mvn springboot:run



