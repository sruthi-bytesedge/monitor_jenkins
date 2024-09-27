package com.bytesedge.wayfinder.monitor_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;


@SpringBootApplication
@EnableAdminServer
public class MonitorManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorManagementApplication.class, args);
	}

}

