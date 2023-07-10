FROM openjdk:11
ADD target/springbootnew-mongo-docker.jar springbootnew-mongo-docker.jar
ENTRYPOINT ["java","-jar","springbootnew-mongo-docker.jar"]
