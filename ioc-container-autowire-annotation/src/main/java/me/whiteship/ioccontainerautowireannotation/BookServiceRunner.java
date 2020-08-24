package me.whiteship.ioccontainerautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BookServiceRunner implements ApplicationRunner {

    @Autowired
    BookService bookService;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        bookService.printBookRepository();
        AutowiredAnnotationBeanPostProcessor beanPostProcessor = applicationContext.getBean(AutowiredAnnotationBeanPostProcessor.class);
        System.out.println(beanPostProcessor);
        System.out.println(autowiredAnnotationBeanPostProcessor);
    }
}
