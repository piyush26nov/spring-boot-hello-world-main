FROM 766091791843.dkr.ecr.eu-west-1.amazonaws.com/openjdk:11
EXPOSE 9080
ADD ./target/spring-boot-docker.jar /spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
