FROM openjdk:19

WORKDIR /app

COPY target/Project_Microservice_1-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "Project_Microservice_1-0.0.1-SNAPSHOT.jar"]