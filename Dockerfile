FROM openjdk:21

WORKDIR /app

COPY target/Week3-TaskManagement-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "Week3-TaskManagement-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]