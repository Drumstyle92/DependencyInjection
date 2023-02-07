package it.develhope.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Drumstyle92
 * Class that initializes Spring Boot
 */
@SpringBootApplication
public class DependencyInjectionApplication {
	/**
	 * @param args main parameter
	 * Method that starts the program
	 */
	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

}
