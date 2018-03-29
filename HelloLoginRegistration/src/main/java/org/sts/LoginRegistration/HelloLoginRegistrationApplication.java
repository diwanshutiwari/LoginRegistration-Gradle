package org.sts.LoginRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloLoginRegistrationApplication extends SpringBootServletInitializer {
    
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloLoginRegistrationApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloLoginRegistrationApplication.class, args);
	}
}
