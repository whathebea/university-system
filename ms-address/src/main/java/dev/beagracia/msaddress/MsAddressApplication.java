package dev.beagracia.msaddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.beagracia.msaddress"})
public class MsAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAddressApplication.class, args);
	}

}
