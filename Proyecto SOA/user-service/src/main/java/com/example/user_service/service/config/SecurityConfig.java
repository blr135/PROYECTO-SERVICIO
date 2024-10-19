package com.example.user_service.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Deshabilita CSRF ya que no se usa en APIs REST
                .csrf(csrf -> csrf.disable())

                // Permite todas las solicitudes sin autenticación
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()
                )

                // Deshabilita la autenticación básica
                .httpBasic(httpBasic -> httpBasic.disable());

        return http.build();
    }
}
