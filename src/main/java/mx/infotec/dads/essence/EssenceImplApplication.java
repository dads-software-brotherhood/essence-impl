package mx.infotec.dads.essence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class EssenceImplApplication {

    @Bean
    public LocalValidatorFactoryBean validator() {
        System.out.println("----------------------------------");
        System.out.println("Running the app");
        System.out.println("----------------------------------");
        return null;
    }
    public static void main(String[] args) {
        SpringApplication.run(EssenceImplApplication.class, args);
    }
}