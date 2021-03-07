package cz.cvut.fel.openk8stest.randomname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cz.cvut.fel.openk8stest.randomname.controller")
public class RandomNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomNameApplication.class, args);
	}

}
