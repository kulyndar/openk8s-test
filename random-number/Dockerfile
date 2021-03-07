FROM openjdk:11-jre-slim

COPY target/random-number-*.jar /app.jar

EXPOSE 8082

CMD ["java", "-jar", "/app.jar"]