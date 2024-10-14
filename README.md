## Technologies

- Java 17
- Spring Boot 3.0
- Spring Web
- Spring Data JPA
- MySQL
- Swagger (for API documentation)

## Features

- **Create a new user**: Register a new user with required details.
- **List all users**: Retrieve a list of all registered users.
- **Get a single user**: Fetch details of a specific user by ID.
- **Update an existing user**: Modify the information of an existing user.
- **Delete a user**: Remove a user from the system.

## API Endpoints

The following endpoints are available in the User Management API:

| Method | Endpoint          | Description                   |
|--------|-------------------|-------------------------------|
| POST   | `/users`          | Create a new user             |
| GET    | `/users`          | Get a list of all users       |
| GET    | `/users/{id}`     | Get details of a single user   |
| PUT    | `/users/{id}`     | Update an existing user        |
| DELETE | `/users/{id}`     | Delete a user                  |

## User Model

The user model stores the following information:

- **username**: Unique identifier for the user.
- **firstName**: User's first name.
- **lastName**: User's last name.
- **email**: User's email address.
- **phoneNumber**: User's phone number.
