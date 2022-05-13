package gr.upatras.rest.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Running...");
		SpringApplication.run(Application.class, args);
		System.out.println("Connection established");
	}

}
