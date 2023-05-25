package com.pessoa.desaparecida.PessoaDesaparecida1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pessoa.desaparecida.PessoaDesaparecida1")
public class PessoaDesaparecida1Application {

    public static void main(String[] args) {
        SpringApplication.run(PessoaDesaparecida1Application.class, args);
    }
}
