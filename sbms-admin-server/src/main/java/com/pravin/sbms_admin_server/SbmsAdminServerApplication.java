package com.pravin.sbms_admin_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SbmsAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsAdminServerApplication.class, args);
	}

}
