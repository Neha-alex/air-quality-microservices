**Microservices-based AQI Tracker and Health Advisory System**

**Overview**

This project is a microservices-based system that tracks air quality index (AQI) and provides health advisories based on AQI levels. It is built using Spring Boot and follows a microservices architecture.

**Architecture**

The system consists of the following components:

**Service Registry** (Eureka Server): Acts as the central registry for service discovery.

**API Gateway**: Routes requests to different microservices.

**AQI Tracker Microservice:** Fetches air quality data and provides it to the API Gateway.

**Health Advisory Microservice:** Provides health recommendations based on AQI levels.

**Technologies Used**

Java

Spring Boot

Spring Cloud (Eureka, OpenFeign, API Gateway)

RESTful APIs

**Setup and Installation**

Clone the repository:

*git clone https://github.com/your-username/your-repository.git*

Navigate to each service folder and build the project using Maven:

*mvn clean install*

Start the Eureka Server:

*cd service-registry*
*mvn spring-boot:run*

**Start the other microservices:**

*cd aqi-service*
*mvn spring-boot:run*

*cd health-advisory-service*
*mvn spring-boot:run*

**Start the API Gateway:**

*cd api-gateway*
*mvn spring-boot:run*

**API Endpoints**

AQI Service:

**GET /aqi?city={city}&state={state}&country={country} - Get AQI data for a location**

Health Advisory Service:

**GET /advisory?city={city}&state={state}&country={country} - Get health advisory based on AQI**
