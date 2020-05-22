package xyz.rocard.readconfigfrompropertiesfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		runner();
	}

	public static void runner() {
		System.out.println("Hello from runner! ");
	}

}
