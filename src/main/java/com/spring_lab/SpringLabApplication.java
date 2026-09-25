package com.spring_lab;

import com.spring_lab.mat.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLabApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringLabApplication.class, args);
        Operation operation = new Operation();


        System.out.println("reultado de la operacion: "+operation.suma(4,5));

	}

}
