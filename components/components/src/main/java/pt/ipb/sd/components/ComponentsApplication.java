package pt.ipb.sd.components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class ComponentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentsApplication.class, args);
	}

	@Bean
    RestClient restClient() {
		return RestClient.builder()
				.baseUrl("https://restcountries.com/v3.1/")
				.build();
	}
}
