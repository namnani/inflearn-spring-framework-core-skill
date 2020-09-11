package me.whiteship.resourceloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
@Order(1)
public class ValidateAppRunner implements ApplicationRunner {

    /*
    스프링 부트에서는,
    기본적으로 validator를 이렇게 원시적으로 만들어서 쓰는게 아니고,
    스프링부트에서 제공하는 LocalValidatorFactoryBean을 빈으로 자동 등록 해준다.
    (bean validation annotation을 지원하는 validator다.)
    그래서 우리는 이걸 빈으로 등록안해도, 주입받을 수 있다.
     */
    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(validator.getClass());

        Event event = new Event();
        event.setLimit(-1);
        event.setEmail(("aaa2"));
//        EventValidator eventValidator = new EventValidator();
        Errors errors = new BeanPropertyBindingResult(event, "event");

        validator.validate(event, errors);
//        eventValidator.validate(event, errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(e -> {
            System.out.println("===== error code =====");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
