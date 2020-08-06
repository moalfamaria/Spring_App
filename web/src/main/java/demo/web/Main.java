package demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"demo.persistence"})
@EntityScan(basePackages = {"demo.domain"})
@ComponentScan(basePackages = {"demo.persistence","demo.web","demo.domain"})
public class Main{
        public static void main(String[] args) {

                SpringApplication.run(Main.class);
        }
}

