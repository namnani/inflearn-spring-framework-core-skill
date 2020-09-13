package me.whiteship.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{1 + 1}")
    int value;

    @Value("#{'hello ' + 'world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    @Value("hello")
    String hello;

    /*
    property 안에서는 표현식을 사용할 수 있지만,
    표현식 안에서는, property를 사용하지 못한다.
     */
    @Value("${my.value}")
    int myValue;

    @Value("#{${my.value} eq 100}")
    boolean isMyValue100;

    @Value("#{'spring'}")
    String spring;

    @Value("#{sample.data}")
    int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("============");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println(hello);
        System.out.println(myValue);
        System.out.println(isMyValue100);
        System.out.println(spring);
        System.out.println(sampleData);

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("2 + 100");
        // 여기서, spring expression language도 ConversionService를 사용해서 해당하는 타입으로 변환하는 거다.
        int value = expression.getValue(Integer.class);
        System.out.println(value);
    }
}
