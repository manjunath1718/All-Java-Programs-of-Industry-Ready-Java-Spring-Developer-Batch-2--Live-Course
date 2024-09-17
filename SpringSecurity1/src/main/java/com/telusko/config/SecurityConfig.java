package com.telusko.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrfCustomizer -> csrfCustomizer.disable());
		http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
		http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(
				sessMngmtCstmzr -> sessMngmtCstmzr.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		return http.build();
	}
	
	@Bean
	public AuthenticationProvider authProvider(){

		DaoAuthenticationProvider daoProvider=new DaoAuthenticationProvider();
		daoProvider.setUserDetailsService(userDetailsService);
//		daoProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		daoProvider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		
		return daoProvider;
	}
	
	

//	@Bean
//	public UserDetailsService userDetailsService() {
//		
//		UserDetails user = User.withDefaultPasswordEncoder()
//				.username("abd")
//				.password("Mr360")
//				.roles("USER")
//				.build();
//		
//		UserDetails admin = User.withDefaultPasswordEncoder()
//				.username("virat")
//				.password("king")
//				.roles("ADMIN")
//				.build();
//		
//		return new InMemoryUserDetailsManager(user,admin);
//	} 
	  
	
	 
}
