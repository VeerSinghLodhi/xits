# Use official OpenJDK image
FROM eclipse-temurin:17-jdk-jammy

# Set working directory
WORKDIR /app

# Copy pom.xml and mvnw files
COPY SamvaadProject/mvnw .
COPY SamvaadProject/.mvn .mvn
COPY SamvaadProject/pom.xml .

# Make mvnw executable
RUN chmod +x mvnw

# Copy source code
COPY SamvaadProject/src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port 8081
EXPOSE 8081

# Run the application
CMD ["java", "-jar", "target/SamvaadProject-0.0.1-SNAPSHOT.jar"]
