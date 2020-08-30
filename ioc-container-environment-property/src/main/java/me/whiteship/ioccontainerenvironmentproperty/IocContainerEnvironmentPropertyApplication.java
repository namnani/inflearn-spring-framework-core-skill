package me.whiteship.ioccontainerenvironmentproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class IocContainerEnvironmentPropertyApplication {

    public static void main(String[] args) {
        SpringApplication.run(IocContainerEnvironmentPropertyApplication.class, args);
    }

}
