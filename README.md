# JEE JPA App

This is a Java Enterprise Edition (JEE) application that demonstrates the use of Java Persistence API (JPA) to interact with a relational database.

## Features

- Add, update, and delete users from a MySQL database
- View a list of all users in the database
- Search for a specific user by name or ID
- Sort the list of users by name or ID
- Pagination of the user list
- User authentication and authorization using Java EE Security
- CRUD operations using JPA

## Prerequisites

To run this application, you will need:

- Java SE Development Kit 8 or later
- Apache Maven
- MySQL server

## How to Run

1. Clone this repository to your local machine using `git clone https://github.com/spyhimself/JEE_jpa-app.git`
2. Navigate to the project root directory using `cd JEE_jpa-app`
3. Create a MySQL database and execute the SQL script `create-table.sql` to create the necessary table
4. Update the `persistence.xml` file with the appropriate database connection details
5. Run `mvn clean package` to build the project and create a WAR file
6. Deploy the WAR file to a JEE application server, such as Apache Tomcat
7. Access the application at `http://localhost:<port>/JEE_jpa-app/`

## Built With

- Java Enterprise Edition
- Java Persistence API
- MySQL
- Apache Maven
- Hibernate
- Spring Web
- Lombock
