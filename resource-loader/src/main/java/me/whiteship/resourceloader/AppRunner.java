package me.whiteship.resourceloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class AppRunner implements ApplicationRunner {

    @Autowired
//    ResourceLoader resourceLoader;
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(resourceLoader.getClass());

        Resource resource = resourceLoader.getResource("classpath:test.txt");
        System.out.println(resource.getClass());

        System.out.println(resource.exists());
        System.out.println(resource.getFile().getName());
        System.out.println(resource.getDescription());
    }
}
