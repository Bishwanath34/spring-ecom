# Use official Java 21 JDK base image
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy everything into the container
COPY . .

# 🔧 Make Maven wrapper executable
RUN chmod +x mvnw

# 🛠 Build the Spring Boot app (skip tests)
RUN ./mvnw clean package -DskipTests

# Expose port (not strictly needed on Render)
EXPOSE 8080

# 🚀 Start the application
CMD ["java", "-jar", "target/ecom-proj-0.0.1-SNAPSHOT.jar"]
