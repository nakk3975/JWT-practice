package com.ahn.shop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    // FilterChain : 모든 유저의 요청과 서버의 응답 사이에 자동으로 실행 해주고 싶은 코드를 담는 곳
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // JWT입장권을 직접 fetch()의 headers:{}에 넣어서 보내면 CSRF 문제 해결
        http.csrf((csrf) -> csrf.disable());
        http.authorizeHttpRequests((authorize) ->
                authorize.requestMatchers("/**").permitAll()
        ); // "/**" 에 url을 넣어 특정 url만 검사 가능
        return http.build();
    }
}
