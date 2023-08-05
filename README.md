# SweetTreats Microservice

SweetTreats is a microservice that handles courier and order management for a dessert delivery application. It allows users to place dessert orders and efficiently assigns the most cost-effective courier for delivery.

## Table of Contents

- [Introduction](#sweettreats-microservice)
- [Technologies](#technologies)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Technologies

The SweetTreats microservice is built using the following technologies:

- Java 11
- Spring Boot (with Spring Data MongoDB)
- MongoDB
- Lombok

## Features

- Add, update, and delete couriers to handle dessert deliveries.
- Place orders with specific ready times, delivery distances, and refrigeration requirements.
- Automatically select the cheapest available courier for each order based on criteria such as delivery distance and courier's rate per mile.
- Suggest tipping amounts based on the delivery distance of each order.
- Retrieve lists of all couriers and orders stored in the database.

## Getting Started

To run the SweetTreats microservice locally, follow these steps:

1. Clone the repository to your local machine:

```bash
git clone https://github.com/your-username/sweet-treats.git
```

2. Set up a MongoDB database and update the database configuration in the `application.properties` file.

3. Build the application using Maven:

```bash
cd sweet-treats
mvn clean install
```

4. Run the application:

```bash
mvn spring-boot:run
```

The microservice will now be running locally on `http://localhost:8080`.

## Usage

Once the SweetTreats microservice is up and running, you can use it by sending HTTP requests to the provided API endpoints.

## API Endpoints

The SweetTreats microservice provides the following API endpoints:

- **CourierController**

  - `POST /SweetTreats/courier`: Add a new courier.
  - `POST /SweetTreats/couriers/many`: Add multiple couriers in a single request.
  - `GET /SweetTreats/couriers`: Retrieve a list of all couriers.
  - `GET /SweetTreats/couriers/{id}`: Retrieve a courier by ID.
  - `DELETE /SweetTreats/couriers`: Delete all couriers.
  - `DELETE /SweetTreats/couriers/{id}`: Delete a courier by ID.

- **OrderController**

  - `POST /SweetTreats/orders`: Place a new order.
  - `GET /SweetTreats/orders`: Retrieve a list of all orders.
  - `GET /SweetTreats/orders/{id}`: Retrieve an order by ID.
  - `DELETE /SweetTreats/orders`: Delete all orders.
  - `DELETE /SweetTreats/orders/{id}`: Delete an order by ID.
  - `GET /SweetTreats/cheapest/{id}`: Get the cheapest courier for an order by ID.

For detailed information on the request and response formats for each endpoint, refer to the Swagger documentation available at `http://localhost:8080/swagger-ui.html` when the application is running.

## Contributing

We welcome contributions to the SweetTreats microservice! If you find any bugs or have suggestions for new features, feel free to open an issue or submit a pull request. Please make sure to follow the code style and include tests for your changes.

## License

The SweetTreats microservice is licensed under the [MIT License](LICENSE).

---

This README provides a brief overview of the SweetTreats microservice, its features, and how to run it. For more detailed documentation, please refer to the codebase and the Swagger API documentation.

Feel free to customize this README to suit your specific repository structure and project requirements.
