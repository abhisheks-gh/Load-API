# Load-API
This is a Load API created using Spring Boot and JPA Hibernate with PostgreSQL. This application provides a RESTful API for managing online shipments, including creating, retrieving, updating, and deleting loads.

## Requirements
To run this application, you will need:

Java 17 or higher
Maven
PostgreSQL
## Getting Started
To get started with this application, follow these steps:

Clone this repository to your local machine.
Open the project in your preferred IDE (such as IntelliJ or Eclipse).
Update the application.properties file located in the src/main/resources directory with your PostgreSQL database configuration details.
Build the application using Maven: mvn clean install
Run the application: mvn spring-boot:run
Once the application is running, you can access the REST API by sending HTTP requests to the appropriate endpoints.

## API Endpoints
The following endpoints are available in this application:

GET /load - Query params - (shipperId) Retrieve a list of all loads with this shipperId. <br>
GET /load/{id} - Retrieve load by loadId. <br>
POST /load - Create a new load. <br>
PUT /load/{loadId} - Update an existing load by loadId. <br>
DELETE /load/{loadId} - Delete a load by loadId. <br>
All endpoints return JSON data. 

## Contributing
If you would like to contribute to this project, feel free to open an issue or submit a pull request. All contributions are welcome!

## License
This application is licensed under the MIT license. See the LICENSE file for details.

## Contact
If you have any questions or concerns about this application, please male me at abhishek8598kumar@gmail.com
