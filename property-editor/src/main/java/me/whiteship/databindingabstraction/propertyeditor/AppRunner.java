package me.whiteship.databindingabstraction.propertyeditor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // 이렇게 ConversionService를 toString으로 찍어보면, 등록된 Converter 목록을 볼 수 있다.
        System.out.println(conversionService);

        /*
        이렇게하면 WebConversionService가 나오는데,
        이는 Spring Boot에서
        웹 애플리케이션인 경우에는 DefaultFormattingConversionService를 상속해서,
        더 많은 기능을 제공해주려고 등록해준 빈이다.
         */
        System.out.println(conversionService.getClass().toString());
    }
}
