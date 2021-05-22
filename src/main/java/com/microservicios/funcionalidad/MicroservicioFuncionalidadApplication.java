package com.microservicios.funcionalidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@SpringBootApplication
@EnableJpaRepositories("com.microservicios.funcionalidad.model.repository")
@EntityScan("com.microservicios.funcionalidad.model.entity")
public class MicroservicioFuncionalidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioFuncionalidadApplication.class, args);
	}

}
