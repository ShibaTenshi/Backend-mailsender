FROM openjdk:17-jdk-slim
COPY target/Backend-mailsender-0.0.1.jar mail.jar
EXPOSE 5042
ENTRYPOINT ["java","-jar","./mail.jar"]