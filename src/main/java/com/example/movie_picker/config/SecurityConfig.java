package com.example.movie_picker.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    // WebSecurityConfiguration is different/updated from the configureradapter
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .securityMatcher("/**")
//                .authorizeHttpRequests((authz) -> authz
//                        .dispatcherTypeMatchers(DispatcherType.FORWARD, DispatcherType.ERROR).permitAll()
//                        .requestMatchers("/api/**").permitAll()
//                        .anyRequest().permitAll()
//
//                )
//                .headers(headers -> headers.disable())
//                .csrf(csrf -> csrf.disable())
//                .httpBasic();
//        return http.build();
//    }
//}
