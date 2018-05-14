FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/springBootExample-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.securidockty.egd=file:/dev/./urandom","-jar","/app.jar"]