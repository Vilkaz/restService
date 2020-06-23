FROM adoptopenjdk/openjdk11:alpine-slim
COPY build/libs/restService-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
