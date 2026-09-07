FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY target/*.jar /app/myapp.jar
ENTRYPOINT [ "java", "-jar", "myapp.jar" ]
