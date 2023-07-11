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
// docker image build -t springbootdocker:latest .
//docker run -p 9090:9080 docker-spring-hello:latest


//https://docs.aws.amazon.com/systems-manager-automation-runbooks/latest/userguide/automation-aws-troubleshootecstaskfailedtostart.html

// aws ecr get-login-password --region eu-west-1 | docker login --username AWS --password-stdin 766091791843.dkr.ecr.eu-west-1.amazonaws.com


//com.amazonaws.eu-west-1.ecr.dkr
//com.amazonaws.eu-west-1.ecr.api
//com.amazonaws.eu-west-1.s3
//com.amazonaws.eu-west-1.logs
//com.amazonaws.eu-west-1.secretsmanager
//com.amazonaws.eu-west-1.ssm  not mandatory


// https://www.youtube.com/watch?v=aa3gGwJpCro
// https://www.youtube.com/watch?v=HQTsCXLvWj8
// https://www.youtube.com/watch?v=yCAlJv6zfn4

//myvpc-10.0.0.0/16
//myvpc-pubsub1-10.0.1.0/24
//myvpc-pubsub2-10.0.2.0/24
//myvpc-pvtsub1-10.0.3.0/24
//myvpc-pvtsub2-10.0.4.0/24
//create igw and attach to above vpc
//create rt and add route to igw, and name this rt as public rt and further attach pub subnet to this rt
//create rt and add pvt subnet to it
/// till now network is created
//create cluster, task definition and service
// create alb n tg
//vpc endpoint creation in pvt subnet and pvt rt and sg source is vpc range
//Enabling private DNS requires both enableDnsSupport and enableDnsHostnames VPC attributes set to true for vpc-059db27d08cb7279c



//Codebuild manageimage Ubuntu Standard aws/codebuild/standard:7.0 always use the latest Linux checkPrivileged

//https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-vs-rest.html
