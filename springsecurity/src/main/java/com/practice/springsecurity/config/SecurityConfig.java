package com.practice.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests().antMatchers("/").permitAll().antMatchers("/user").hasRole("USER").antMatchers("/admin")
//				.hasRole("ADMIN").anyRequest().authenticated().and().httpBasic();
//	}

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {

		UserDetails user = User.withDefaultPasswordEncoder().username("user").password("pass").roles("USER").build();

		UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("pass").roles("ADMIN").build();

		return new InMemoryUserDetailsManager(user, admin);
	}

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {

		return http.csrf(CsrfConfigurer::disable).authorizeRequests(auth -> {
			auth.antMatchers("/").permitAll();
			auth.antMatchers("/user").hasRole("USER");
			auth.antMatchers("/admin").hasRole("ADMIN");
			auth.anyRequest().authenticated();
		}).httpBasic(Customizer.withDefaults()).build();
	}

}
