package com.lekwacious.todo.todosimplesecurity.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ToDoSecurityConfig  extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(AuthenticationManagerBuilder authenticationManager) throws Exception {
        authenticationManager.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder())
                .withUser("apress")
                .password(passwordEncoder().encode("springboot2"))
                .roles("ADMIN", "USER");
    }

    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



}
