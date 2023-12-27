package com.Gaming.securityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, proxyTargetClass = true)
public class SecurityConfig extends WebSecurityConfiguration {

    @Bean
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    }

    @Bean
    protected void configure(HttpSecurity http) throws Exception {
        http.
                exceptionHandling((exception) -> exception.accessDeniedPage("/403"));
        http.
                authorizeHttpRequests(auth -> auth.requestMatchers("/", "/css/**", "/js/**").permitAll());
        http.
                formLogin(formlogin -> formlogin.loginPage("/login").permitAll() // login, login.html
                        .usernameParameter(("email")) // <input type="email" name="email" />
                        .passwordParameter("password") // <input type="password" name="password" />
                        .loginProcessingUrl("/auth").permitAll() // <form th:action="@{/auth}" method="post">
                        .failureUrl("/login?error=true") // <input type="hidden" th:if="${param.error}" name="error" value="true" />
                        .defaultSuccessUrl("/home", true));

        http.
                logout(logout -> logout.logoutUrl("/logout").permitAll()
                        .logoutSuccessUrl("/login?logout=true"));

        http.
                csrf(AbstractHttpConfigurer::disable);

    }

}