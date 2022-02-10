package co.soy.yo.entity.filter;

import co.soy.yo.entity.filter.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class EntityFilterApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntityFilterApiApplication.class, args);
	}

}
