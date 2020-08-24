package me.whiteship.ioccontainerautowireannotation;

import jdk.nashorn.internal.ir.CallNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import out.MyService;

import java.util.function.Supplier;

@SpringBootApplication
public class IocContainerAutowireAnnotationApplication {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
//        SpringApplication.run(IocContainerAutowireAnnotationApplication.class, args);
        SpringApplication application = new SpringApplication(IocContainerAutowireAnnotationApplication.class);
        application.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            ctx.registerBean(MyService.class);
            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition!!"));
        });
        application.run(args);
    }

}
