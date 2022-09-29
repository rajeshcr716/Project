package com.eazybytes.eazyschool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class ProjectSecurityConfig  {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

            // Permit All Requests inside the Web Application
            /*http.authorizeRequests().anyRequest().permitAll().
                    and().formLogin()
                    .and().httpBasic();*/
            // Deny All Requests inside the Web Application
            /*http.authorizeRequests().anyRequest().denyAll().
                    and().formLogin()
                    .and().httpBasic();*/
// NOTE: if we not disable then contact save msg will be not submitted.. thhmleaf not used in contact.html
        // CSRF: cross side request forgery
     //   http.authorizeRequests()
        http.csrf().ignoringAntMatchers("/SaveMsg").ignoringAntMatchers("/h2-console/**").and()
                .authorizeRequests()

                .mvcMatchers("/dashboard").authenticated()
                .mvcMatchers("/home").permitAll()
                .mvcMatchers("/holidays/**").permitAll()
                .mvcMatchers("/contact").permitAll()
                .mvcMatchers("/saveMsg").permitAll()
                .mvcMatchers("/courses").permitAll()
                .mvcMatchers("/about").permitAll()
                .mvcMatchers(("/h2-console/**")).permitAll()
                //.and().formLogin().and().httpBasic();  ---> need to create new login page with css style
                .and().formLogin().loginPage("/login")
                .defaultSuccessUrl("/dashboard").failureUrl("/login?error=true").permitAll()
                .and().logout().logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll()
                //.and().authorizeRequests().antMatchers("/h2-console/**").permitAll()
                .and().httpBasic();

            http.headers().frameOptions().disable(); // related to h2-console .


        return http.build();
        }



    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("user")
                .password("12345")
                .roles("USER")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("54321")
                .roles("USER","ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }










}


















