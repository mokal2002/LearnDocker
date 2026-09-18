FROM maven:3.9.4-eclipse-temurin-21-alpine

WORKDIR /app

COPY ./target/dockerdemo-0.0.1-SNAPSHOT.jar .

CMD [ "java","-jar","dockerdemo-0.0.1-SNAPSHOT.jar" ]