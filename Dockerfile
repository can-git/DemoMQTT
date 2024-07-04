FROM eclipse-temurin:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
CMD ["java", "--add-opens", "java.base/java.net=ALL-UNNAMED", "-jar","/app.jar"]

EXPOSE 8080