package example.spring.rest.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"car_api"})
@EnableJpaRepositories( basePackages = {"car_api"})
@EntityScan(basePackages = {"car_api"})
public class SpringRestDataJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataJpaProjectApplication.class, args);
	}

}
