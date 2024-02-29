package ru.chepikov.springmvcobjectmapper.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("ru.chepikov.springmvcobjectmapper")
@EnableWebMvc
public class SpringConfig {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
