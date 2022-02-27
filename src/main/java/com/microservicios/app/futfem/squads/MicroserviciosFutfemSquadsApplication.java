package com.microservicios.app.futfem.squads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosFutfemSquadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosFutfemSquadsApplication.class, args);
	}

}
