package com.security.bankapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//		http.authorizeHttpRequests().antMatchers("/notices").permitAll().antMatchers("/contacts").permitAll()
//				.anyRequest().authenticated();

		/** Deny all requests **/
//		http.authorizeHttpRequests().anyRequest().denyAll().and().httpBasic().and().formLogin();

		/** Permit all requests **/
//		http.authorizeHttpRequests().anyRequest().permitAll().and().httpBasic().and().formLogin();

		http.authorizeHttpRequests().antMatchers("/account", "/balance", "/loans", "/cards").authenticated()
				.antMatchers("/notices", "/contact").permitAll().and().formLogin().and().httpBasic();

		return http.build();
	}

//	@Bean
//	public InMemoryUserDetailsManager userDetailsManager() {
//
//		UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("12345").authorities("admin")
//				.build();
//		UserDetails user = User.withDefaultPasswordEncoder().username("user").password("qwerty").authorities("read")
//				.build();
//
//		return new InMemoryUserDetailsManager(admin, user);
//	}

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {

		UserDetails admin = User.withUsername("admin").password("12345").authorities("admin").build();
		UserDetails user = User.withUsername("user").password("qwerty").authorities("read").build();

		return new InMemoryUserDetailsManager(admin, user);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
