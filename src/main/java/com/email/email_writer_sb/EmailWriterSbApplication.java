package com.email.email_writer_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app")
public class EmailWriterSbApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmailWriterSbApplication.class, args);
	}

}
