# Spring MVC Project for PLP and PDP Pages

This is a Spring MVC project that aims to create Product Listing Page (PLP) and Product Detail Page (PDP) using Java. The project utilizes data samples from Commercetools, specifically sunrise data, to display the products.

## Features

- **Product Listing Page (PLP):** Displays a list of products retrieved from the Commercetools API.
- **Product Detail Page (PDP):** Shows detailed information about a specific product, including its name, description, price, and other attributes.

## Prerequisites

To run this project, make sure you have the following prerequisites installed:

- Java Development Kit (JDK) version 8 or above
- Apache Maven
- Spring Framework
- Commercetools API credentials

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/CodeNebula07/Spring-MVC-PLP_PDP.git
   ```
2. Navigate to the project directory:
   ```bash
   cd your-repo
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## Configuration

1. Open the `application.properties` file.
2. Provide your Commercetools API credentials: `commercetools.clientId` and `commercetools.clientSecret`.
3. Configure other necessary properties, such as the API endpoint URL.

## Usage

1. Start the application:
   ```bash
   mvn spring-boot:run
   ```
2. Access the PLP: Open your web browser and go to `http://localhost:8080/plp`.
3. Click on a product to view its PDP: You will be redirected to `http://localhost:8080/pdp/{productId}`.

## Contributing

Contributions are welcome! If you have any suggestions or improvements, feel free to create a pull request.

## License

This project is licensed under the MIT License.

## Acknowledgments

This project utilizes the Commercetools API and sample sunrise data for product information. Special thanks to the Commercetools team for providing the data samples and documentation.
