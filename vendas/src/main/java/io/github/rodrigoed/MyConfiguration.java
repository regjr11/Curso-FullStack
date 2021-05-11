package io.github.rodrigoed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Development
public class MyConfiguration {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Rodando ambiente de DESENVOLVIMENTO");
        };
    }
}
