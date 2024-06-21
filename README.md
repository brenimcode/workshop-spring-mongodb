# MongoDB with Spring Boot Workshop
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white) ![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
## Project Overview

This project is designed to demonstrate how to use MongoDB with Spring Boot. It aims to provide an in-depth understanding of the document-oriented paradigm and how it differs from the relational model. By implementing CRUD operations and associations between objects, this project highlights the considerations and decisions involved in designing a document-oriented database. The project also showcases querying capabilities using Spring Data and MongoRepository.

## General Objectives

1. **Understand Document-Oriented vs. Relational Paradigms**
   - Comprehend the core differences between document-oriented databases (such as MongoDB) and traditional relational databases.
   
2. **Implement CRUD Operations**
   - Create, Read, Update, and Delete operations with MongoDB using Spring Boot.
   
3. **Design Considerations for Document-Oriented Databases**
   - Reflect on the design decisions required for a document-oriented database structure.
   
4. **Implement Object Associations**
   - Nested Objects: Understand how to handle nested documents within MongoDB.
   - References: Implement and manage references between documents.

5. **Perform Queries with Spring Data and MongoRepository**
   - Utilize the powerful querying capabilities provided by Spring Data MongoDB.

## Project Structure

The project consists of various components and modules that work together to demonstrate the capabilities and integration of MongoDB with Spring Boot.

### Prerequisites

- Java 17
- Maven
- MongoDB 4.0+
- Spring Boot 3.3.0

### Installation and Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/brenimcode/workshop-spring-mongodb.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd workshop-spring-mongodb
   ```

3. **Build the project:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

5. **Access the application:**
   - The application runs on `http://localhost:8080`.

### Project Components

#### Domain

- **User**: Represents the user entity with basic fields and associations.
- **Post**: Represents the post entity, demonstrating nested documents and references.

#### Repository

- **UserRepository**: Extends `MongoRepository` for User-related CRUD operations.
- **PostRepository**: Extends `MongoRepository` for Post-related CRUD operations.

#### Service

- **UserService**: Contains business logic for user operations.
- **PostService**: Contains business logic for post operations.

#### Resource

- **UserResource**: Defines REST endpoints for user-related operations.
- **PostResource**: Defines REST endpoints for post-related operations.

### Endpoints

#### User Endpoints

- **Get all users**: `GET /users`
- **Get user by ID**: `GET /users/{id}`
- **Create new user**: `POST /users`
- **Delete user by ID**: `DELETE /users/{id}`
- **Get posts by user ID**: `GET /users/{id}/posts`

#### Post Endpoints

- **Get all posts**: `GET /posts`
- **Get post by ID**: `GET /posts/{id}`
- **Create new post**: `POST /posts`
- **Delete post by ID**: `DELETE /posts/{id}`
- **Find posts by title**: `GET /posts/titlesearch?text={text}`

### Query Methods

- **Find posts by title containing text**: 
  ```java
  List<Post> findByTitleContaining(String text);
  ```

### Design Considerations

- **Nested Objects vs. References**:
  - Choose between embedding documents or referencing other documents based on the access patterns and size of the documents.
  
- **Query Performance**:
  - Optimize queries using appropriate indexes and query patterns provided by Spring Data MongoDB.

### Conclusion

This project provides a comprehensive example of integrating MongoDB with Spring Boot. It covers essential CRUD operations, object associations, and querying capabilities. By following this project, developers can gain a solid understanding of how to effectively design and implement a document-oriented database with Spring Boot and MongoDB.

For more details, refer to the project repository on [GitHub](https://github.com/brenimcode/workshop-spring-mongodb).
