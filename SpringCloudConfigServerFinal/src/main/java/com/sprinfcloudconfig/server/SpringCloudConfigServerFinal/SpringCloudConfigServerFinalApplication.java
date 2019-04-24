package com.sprinfcloudconfig.server.SpringCloudConfigServerFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerFinalApplication.class, args);
	}

}
