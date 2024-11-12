package com.example.api.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // aplica a todos os endpoints
                        .allowedOrigins("http://localhost:63342") // substitua pelo URL da aplicação front-end
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // métodos permitidos
                        .allowedHeaders("*")
                        .allowCredentials(true); // permite envio de cookies se necessário
            }
        };
    }
}
