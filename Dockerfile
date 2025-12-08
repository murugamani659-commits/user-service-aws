# Use Amazon Corretto 21 as base image
FROM amazoncorretto:21-alpine

# Set working directory
WORKDIR /app

# Copy Maven build output (JAR file) into container
COPY target/user-service-0.0.1-SNAPSHOT.jar /app/user-service-0.0.1-SNAPSHOT.jar

# Expose application port (adjust if needed)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/user-service-0.0.1-SNAPSHOT.jar"]