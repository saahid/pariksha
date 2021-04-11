package org.codekitchen.pariksha.caching.filecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { WebMvcAutoConfiguration.class })
public class FileCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileCacheApplication.class, args);
	}

}
