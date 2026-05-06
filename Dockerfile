FROM maven:3.9.6-eclipse-temurin-17
WORKDIR /app
COPY . . 
RUN mvn clean install
CMD ["java","-cp","target/docker-maven-jenkins-1.0-SNAPSHOT.jar","com.example.App"]