package org.fai.study.demo_spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfiguration {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);
        userDetailsManager.setUsersByUsernameQuery("select user_id,password,is_active from members where user_id=?");
        userDetailsManager.setAuthoritiesByUsernameQuery("select user_id,role from roles where user_id=?");
        return userDetailsManager;
    }
//    @Bean
//    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
//        UserDetails user = User.builder()
//                .username("user")
//                .password("{noop}123")
//                .roles("USER").build();
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("{noop}123")
//                .roles("ADMIN").build();
//        UserDetails cs = User.builder()
//                .username("customer_service")
//                .password("{noop}123")
//                .roles("CUSTOMER").build();
//        return new InMemoryUserDetailsManager(user, admin, cs);
//    }
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(
//                config-> config
//                        .requestMatchers("/**").hasAnyRole("ADMIN","USER")
//                        .anyRequest()).formLogin(
//                        formLogin -> formLogin
//                                .loginPage("/login")
////                                .loginProcessingUrl("/login")
//
//        );
//        return http.build();
//    }
@Bean
public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
    httpSecurity.authorizeHttpRequests(
            config-> config
                    .anyRequest().authenticated())
            .formLogin(
                    form->form
                            .loginPage("/login")
                            .loginProcessingUrl("/authenticateUser")
                            .permitAll()
            )
            .logout(logout -> logout
                    .permitAll());

    return httpSecurity.build();
}
}
