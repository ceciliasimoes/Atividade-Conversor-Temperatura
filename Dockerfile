FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/atividadeAula-0.0.1-SNAPSHOT.jar /app/atividadeAula.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "atividadeAula.jar"]
