FROM java:latest
EXPOSE 8080
ADD /target/springboot.jar springboot.jar
ENTRYPOINT ["java","-jar","springboot.jar"]