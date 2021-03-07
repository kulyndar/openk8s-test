FROM openjdk:11-jre-slim

COPY target/random-name-*.jar /app.jar

EXPOSE 8081

CMD ["java", "-jar", "/app.jar"]