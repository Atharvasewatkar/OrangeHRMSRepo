# Simple Maven Project

This is a simple Maven project that demonstrates the basic structure and functionality of a Java application using Maven for build management.

## Project Structure

```
simple-maven-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── App.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── AppTest.java
│       └── resources
├── pom.xml
└── README.md
```

## Description

- **App.java**: This is the main class of the application. It contains the `main` method which serves as the entry point for the application.
- **AppTest.java**: This class contains unit tests for the `App` class to ensure that the application behaves as expected.
- **pom.xml**: This file is used by Maven to manage project dependencies, build settings, and plugins.

## How to Build and Run

1. Ensure you have Maven installed on your machine.
2. Navigate to the project directory.
3. Run the following command to build the project:

   ```
   mvn clean install
   ```

4. To run the application, use the following command:

   ```
   mvn exec:java -Dexec.mainClass="App"
   ```

## Running Tests

To run the tests, execute the following command:

```
mvn test
```

## License

This project is licensed under the MIT License.