FROM amazoncorretto:17-alpine
COPY target/security-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]