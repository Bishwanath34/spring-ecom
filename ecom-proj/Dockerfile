# Use Java 21 base image
FROM eclipse-temurin:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project into the container
COPY . .

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# Expose the port (for local Docker use — optional for Render)
EXPOSE 8080

# Run the JAR file (replace JAR name as needed)
CMD ["java", "-jar", "target/ecom-proj-0.0.1-SNAPSHOT.jar"]
