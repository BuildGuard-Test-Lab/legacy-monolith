FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN ./mvnw package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/legacy-monolith-5.2.1.jar"]


# Security Fix by BuildGuard
USER nonroot
