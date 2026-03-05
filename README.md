# 🌍 Microservices-Based AQI Tracker & Health Advisory System

A **Spring Boot microservices application** that tracks Air Quality Index (AQI) for a given location and provides **health advisories based on pollution levels**.

The system follows a **microservices architecture** using service discovery and API gateway patterns to ensure scalability, modularity, and easy service communication.

---

# 🏗 System Architecture

The application is composed of multiple independent services that communicate through **Spring Cloud infrastructure**.

```
Client
│
▼
API Gateway
│
├── AQI Tracker Service
│
└── Health Advisory Service
▲
│
Service Registry (Eureka)
```

---

# 🧩 Components

## 1️⃣ Service Registry (Eureka Server)

Acts as the **central service discovery mechanism**.

Responsibilities:

- Registers all microservices
- Allows services to discover each other
- Enables dynamic scaling

---

## 2️⃣ API Gateway

The **single entry point** for all client requests.

Responsibilities:

- Routes requests to appropriate microservices
- Simplifies client communication
- Enables centralized request handling

---

## 3️⃣ AQI Tracker Microservice

Responsible for retrieving **Air Quality Index data** for a given location.

Responsibilities:

- Fetch AQI data
- Provide air pollution information
- Serve AQI data through REST APIs

---

## 4️⃣ Health Advisory Microservice

Provides **health recommendations** based on AQI levels.

Responsibilities:

- Analyze AQI values
- Generate health advisories
- Recommend precautions for different pollution levels

---

# 🛠 Tech Stack

- **Java**
- **Spring Boot**
- **Spring Cloud**
- Eureka Server
- OpenFeign
- API Gateway
- **REST APIs**
- **Maven**

---

# 📂 Project Structure

```
aqi-microservices-system
│
├── service-registry
│ └── Eureka Server
│
├── api-gateway
│ └── API Gateway Service
│
├── aqi-service
│ └── AQI Tracker Microservice
│
├── health-advisory-service
│ └── Health Advisory Microservice
│
└── README.md
```

---

# ⚙️ Setup and Installation

## 1️⃣ Clone the Repository

```
git clone https://github.com/your-username/your-repository.git
cd your-repository
```

---

## 2️⃣ Build the Services

Navigate to each service folder and build using Maven:

```
mvn clean install
```

---

## 3️⃣ Start the Service Registry

```
cd service-registry
mvn spring-boot:run
```

The Eureka dashboard will be available at:

```
http://localhost:8761
```

---

## 4️⃣ Start the Microservices

### Start AQI Service

```
cd aqi-service
mvn spring-boot:run
```

### Start Health Advisory Service

```
cd health-advisory-service
mvn spring-boot:run
```

---

## 5️⃣ Start the API Gateway

```
cd api-gateway
mvn spring-boot:run
```

All client requests should be sent through the **API Gateway**.

---

# 🔌 API Endpoints

## AQI Service

Get AQI data for a specific location.

```
GET /aqi?city={city}&state={state}&country={country}
```

Example:

```
GET /aqi?city=Delhi&state=Delhi&country=India
```

---

## Health Advisory Service

Get health recommendations based on AQI levels.

```
GET /advisory?city={city}&state={state}&country={country}
```

Example:

```
GET /advisory?city=Delhi&state=Delhi&country=India
```

---

# 💡 Example Workflow

1. Client sends a request to the **API Gateway**
2. Gateway routes request to the **AQI Service**
3. AQI Service retrieves air quality data
4. Health Advisory Service analyzes AQI values
5. System returns **health recommendations** to the client

---

# 🌱 Possible Future Enhancements

- Add caching using Redis
- Implement circuit breakers using Resilience4j
- Add Docker containerization
- Deploy on Kubernetes
- Add frontend dashboard for AQI visualization

---

# 👩‍💻 Author

**Neha Alex**

Software Engineer | Full Stack Developer | AI Enthusiast

---

# ⭐ Motivation

This project demonstrates **microservices architecture using Spring Boot and Spring Cloud**, focusing on service discovery, API gateway patterns, and modular service design.

If you found this project useful, feel free to ⭐ the repository!
