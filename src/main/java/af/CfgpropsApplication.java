package af;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("af.props")
public class CfgpropsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfgpropsApplication.class, args);
	}
}
