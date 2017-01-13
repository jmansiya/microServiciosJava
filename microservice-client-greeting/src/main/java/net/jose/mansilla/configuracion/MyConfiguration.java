package net.jose.mansilla.configuracion;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import net.jose.mansilla.service.ClientGreetingService;
import net.jose.mansilla.service.controller.ClientGreetingController;
import net.jose.mansilla.service.controller.ClientGreetingHomeController;

@Configuration
public class MyConfiguration {
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
	        return new RestTemplate();
	}
	
 
    //Create the controller, passing it the ClientGreetingService to use.
//    @Bean
//    public ClientGreetingController helloWorldController() {
//        return new ClientGreetingController(helloWorldService());
//    }
// 
//    @Bean
//    public ClientGreetingHomeController homeController() {
//        return new ClientGreetingHomeController();
//    }
}
