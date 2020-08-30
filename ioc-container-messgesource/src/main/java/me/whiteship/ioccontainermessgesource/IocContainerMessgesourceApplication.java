package me.whiteship.ioccontainermessgesource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class IocContainerMessgesourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IocContainerMessgesourceApplication.class, args);
    }

//    @Bean
//    public MessageSource messageSource() {
//        MessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        ((ReloadableResourceBundleMessageSource) messageSource).setBasename("classpath:/messages");
//        ((ReloadableResourceBundleMessageSource) messageSource).setDefaultEncoding("UTF-8");
//        ((ReloadableResourceBundleMessageSource) messageSource).setCacheSeconds(3);
//        return messageSource;
//    }

}
