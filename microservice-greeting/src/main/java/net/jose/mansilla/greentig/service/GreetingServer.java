package net.jose.mansilla.greentig.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="net.jose.*")
@EnableDiscoveryClient
@SpringBootApplication
public class GreetingServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(GreetingServer.class, args);		
	}

}
