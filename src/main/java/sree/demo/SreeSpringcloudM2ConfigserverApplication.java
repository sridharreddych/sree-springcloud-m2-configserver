package sree.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SreeSpringcloudM2ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SreeSpringcloudM2ConfigserverApplication.class, args);
	}

}
