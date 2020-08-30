package me.whiteship.ioccontainermessgesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Locale.setDefault(Locale.ENGLISH);

        System.out.println(messageSource.getClass());


        while (true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"keesun"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"keesun"}, Locale.getDefault()));
            Thread.sleep(1000l);
        }
    }
}
