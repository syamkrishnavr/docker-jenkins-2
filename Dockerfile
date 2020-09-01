FROM openjdk:8
EXPOSE 8080
ADD target/docker-new.jar docker-new.jar
ENTRYPOINT ["java","-jar","docker-new.jar"]