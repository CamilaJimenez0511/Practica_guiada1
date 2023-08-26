package co.edu.uespring.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.euspring.second.controller"})
public class MySecondProyect2Application {

	public static void main(String[] args) {
		SpringApplication.run(MySecondProyect2Application.class, args);
	}

}
