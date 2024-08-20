# Car Rental Management System

## Description

The **Car Rental Management System** is a Spring Boot application designed to manage car rentals efficiently. This project allows users to manage car inventories, customer information, and rental transactions. The application provides functionalities to search for available cars based on various criteria like price, mileage, brand, model, and year, as well as to manage the availability status of cars.

## Status

🚧 **Under Development** 🚧

This project is currently a work in progress. Some features may not be fully implemented, and the project structure and code are subject to change.

## Features

- **Car Management:**
  - Add new cars to the inventory.
  - Update car details like brand, model, mileage, daily price, and availability status.
  - Search for cars based on various criteria (availability, price, mileage, year, etc.).

- **Customer Management:**
  - Add and manage customer information (name, contact details, etc.).
  - Associate customers with car rentals.

- **Rental Management:**
  - Record and manage car rental transactions.
  - Check car availability before renting.
  - Update car availability based on rental status.

## Technologies Used

- **Java**: Core programming language.
- **Spring Boot**: Framework used for building the backend services.
- **Spring Data JPA**: For managing and accessing the database.
- **Hibernate**: ORM framework used to interact with the database.
- **H2 Database**: In-memory database for testing and development.
- **Maven**: Dependency management and build tool.

## Setup Instructions

### Prerequisites

- **Java 17** or later
- **Maven 3.6+**

### Installation

1. Clone the repository:

    ```bash
   git clone https://github.com/yourusername/car-rental-management.git
   cd car-rental-management

2. Build the project usign Maven:

   ```bash
      mvn clean install

3. Build the project usign Maven:

    ```bash
     mvn spring-boot:run

4. Access the application at http://localhost:8080.

### Testing

- You can run tests using Maven:
  
   ```bash
    mvn spring-boot:run
  
### Database Configuration
The application is configured to use an in-memory H2 database by default. You can access the H2 console at   http://localhost:8080/h2-console using the following details:

- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (leave blank)
- To use a different database, update the application.properties file with your database configurations.



