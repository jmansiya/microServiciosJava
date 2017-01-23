package net.microservice.entorno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class ServidorAdministracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ServidorAdministracion.class, args);
	}

}
