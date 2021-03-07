package cz.cvut.fel.openk8stest.randomnumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {
		"cz.cvut.fel.openk8stest.randomnumber.controller",
		"cz.cvut.fel.openk8stest.randomnumber.service"
})
public class RandomNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomNumberApplication.class, args);
	}

	@Bean(name = "restTemplate")
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
