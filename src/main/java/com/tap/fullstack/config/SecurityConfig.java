package com.tap.fullstack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors(withDefaults()) // ✅ enable CORS for React
            .csrf(csrf -> csrf.disable()) // ✅ disable CSRF for simplicity (esp. for APIs)
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/name", "/api/hello").permitAll() // ✅ allow these without login
                .anyRequest().authenticated()
            );

        return http.build();
    }
}
