package me.whiteship.databindingabstraction.propertyeditor;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
사실, Spring Boot에서는 Formatter와 Converter 빈을 찾아 자동으로 등록해준다.
이렇게 등록할 필요가 없다는 거임.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /*
    이렇게 등록을 해주면,
    스프링 mvc 설정에 우리가 넣어준 Converter가
    모든 컨트롤러에서 동작한다.
     */
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
////        registry.addConverter(new EventConverter.StringToEventConverter());
//        registry.addFormatter(new EventFormatter());
//    }
}
