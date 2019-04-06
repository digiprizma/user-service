package com.digiprizma;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.digiprizma.entities.AppRole;
import com.digiprizma.service.AccountService;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(AccountService accountService) {
		return args->{
			accountService.save(new AppRole(null, "ADMIN"));
			accountService.save(new AppRole(null, "USER"));
			
			Stream.of("user1", "user2", "user3","admin").forEach(un->{
				accountService.saveUser(un, "1234", "1234");
			});
			accountService.addRoleToUser("admin", "ADMIN");
		};
	}
	
	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
