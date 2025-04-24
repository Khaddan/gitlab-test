FROM openjdk:17.0.2-slim
ARG JAR_FILE=target/test1-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
