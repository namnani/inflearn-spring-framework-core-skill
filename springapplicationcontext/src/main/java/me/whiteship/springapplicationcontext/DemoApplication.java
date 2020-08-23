package me.whiteship.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class DemoApplication {

    public static void main(String[] args) {
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfigComponentScan.class);

//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.bookRepository != null);
        System.out.println(bookService.bookRepository.nani);
    }
}
