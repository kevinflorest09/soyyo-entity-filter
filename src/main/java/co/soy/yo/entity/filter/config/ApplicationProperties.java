package co.soy.yo.entity.filter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "error.entity")
@Getter
@Setter
public class ApplicationProperties {

    private String notFound;
    private String badRequest;
}
