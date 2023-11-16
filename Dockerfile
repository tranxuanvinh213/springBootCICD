FROM openjdk:17
EXPOSE 8080
ADD target/springboot-image-cicd.jar springboot-image-cicd.jar
ENTRYPOINT ["java", "-jar", "/springboot-image-cicd.jar"]