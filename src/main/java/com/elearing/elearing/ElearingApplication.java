package com.elearing.elearing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({
		com.elearing.elearing.config.FileStorageProperties.class
})
public class ElearingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElearingApplication.class, args);
	}

}
