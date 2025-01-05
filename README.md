# Spring Boot demo study project

## Introduction
A Spring Boot project with an RESTful API. The project is following MCV(Model View Controller) architecture.
This web application developed using the Spring Boot framework was built with the goal of learning and applying key concepts such as:

- Spring Boot 3
- JPA (Java Persistence API), Hibernate implementation
- Annotations JPA, Jackson, SpringBoot, Java
- Class Relationships
- Object-Relational Mapping
- Jackson API
- Maven
- H2 database
- PostgreSQL

## Architecture
### Domain Model 
![Screenshot from 2025-01-04 22-31-27](https://github.com/user-attachments/assets/aa71ad3b-3593-45c4-8a21-009317a0998c)

### Domain Instance
![Screenshot from 2025-01-04 22-31-43](https://github.com/user-attachments/assets/dba681b4-0033-4e81-a2ca-761be3e5b7ca)

### Logical Layers
![Screenshot from 2025-01-04 22-31-59](https://github.com/user-attachments/assets/acff56f7-06b1-49b8-95e7-22628a24c817)

## Project Structure
- **src.main.java.com.course.demo_spring.**: Contains the main Java source code.
    - **repositories**: Package for repositories.
    - **resources**: Package for resources.
    - **services**: Package for services.
    - **config**: Package for configuration on project.
    - **entities**: Package for entities classes.

## Technologies Used
- **Spring Boot 3**: Project framework.
- **Java 17 LTS**: Core programming language.
- **H2 Database**: Example memory database used for this project (any other RDBMS can be used).
- **JPA**: Java API for persistence on database.
- **Maven**: Package manager.
- **PostgreSQL**: Database for persistence.

  
## Resources 
- localhost:8080/users
- localhost:8080/categories
- localhost:8080/orders
- localhost:8080/products

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Installation and running the project
1. **Clone the repository**:
   ```sh
   git git@github.com:leonardoraupp/demo-spring.git
   cd demo-spring
   ```
   
2.  **Execute the project on H2 Database**:
    -  Open the project folder on Intellij IDE.
    -  Change to the test profile on application.properties:

       ```sh
       spring.application.name=demo-spring
       spring.profiles.active=test
       spring.jpa.open-in-view=true
       ```
    -  Run the class DemoSpringApplication located on src.main.java.com.course.demo_spring package.
    -  Use the platform Postman to test and make requests.
      
3.  **Execute the project on PostgreSQL Database**:
   *Make sure you have installed PostgreSQL*
    -  Open the project folder on Intellij IDE.
    -  Change to the dev profile on application.properties:

       ```sh
       spring.application.name=demo-spring
       spring.profiles.active=dev
       spring.jpa.open-in-view=true
       ```
    -  Create a database on Postgre and update the application.dev.properties with the necessary data:

       ```sh
       spring.datasource.url=jdbc:postgresql://localhost:5432/demo_springboot_course
       spring.datasource.username=postgres
       spring.datasource.password=your_password
       spring.datasource.driver-class-name=org.postgresql.Driver

       spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
       spring.jpa.hibernate.ddl-auto=update
       spring.jpa.show-sql=true
       spring.jpa.properties.hibernate.format_sql=true
       ```
    -  Run the class DemoSpringApplication located on src.main.java.com.course.demo_spring package.
    -  Use the platform Postman to test and make requests.
   
## Contributing
Contributions are welcome! Please fork this repository and submit pull requests for any enhancements, bug fixes, or new features.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Author
Leonardo Raupp

https://www.linkedin.com/in/leonardo-raupp
