package pl.akademiakodu.kwejk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KwejkApplication {

	public static void main(String[] args) {
		System.out.println("HelloController world");
		SpringApplication.run(KwejkApplication.class, args);
	}
}
