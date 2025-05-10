FROM eclipse-temurin:17.0.2_8-jdk AS builder
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17.0.2_8-jre
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

ENV JAVA_TOOL_OPTIONS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75 -Djava.security.egd=file:/dev/./urandom"
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
