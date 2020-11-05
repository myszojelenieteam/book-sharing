package pl.polsl.bookSharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BookSharingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookSharingApplication.class, args);
	}

}
