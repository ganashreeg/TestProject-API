package in.ogmatech.SpringRestSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringRestSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestSampleApplication.class, args);
	}

}
