package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}


// docker image build -t docker-spring-hello:latest .
//docker run -p 9090:9080 docker-spring-hello:latest

//https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-aws-troubleshootecstaskfailedtostart.html

// aws ecr get-login-password --region eu-west-1 | docker login --username AWS --password-stdin 766091791843.dkr.ecr.eu-west-1.amazonaws.com


//com.amazonaws.eu-west-1.ecr.dkr
//com.amazonaws.eu-west-1.ecr.api
//com.amazonaws.eu-west-1.s3
//com.amazonaws.eu-west-1.logs
//com.amazonaws.eu-west-1.secretsmanager
//com.amazonaws.eu-west-1.ssm  not mandatory