package com.logica.programa;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgramaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgramaApplication.class, args);

        Programa programa = new Programa();
        programa.exercicio1();
    }

}