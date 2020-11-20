# **Spring Cloud Microservice Sample**

* Sleuth            : Tracking logs between services.
* Actuator          : Monitoring our app, gathering metrics, understanding traffic or refresh application.props, etc.
* Spring Cloud Bus  : Refresh each service application.properties using actuator and rabbitmq
* File based config : We can use different app.prop for different environment using active.profile
* Ribbon            : Eureka loadbalancer
* Gateway           : Spring cloud gateway
* Zipkin            : Distributed tracing service
* Hystrix           : Fault tolerance library
* Feign             : Rest client between services

## Proje Genel Yapisi
![](https://github.com/alicanhatun/microservice-app/blob/master/docs/arch.png)
