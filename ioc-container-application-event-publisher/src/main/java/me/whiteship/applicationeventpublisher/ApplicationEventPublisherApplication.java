package me.whiteship.applicationeventpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
// 이러면 쓰렐드풀에 대한 설정이 default로 되어서, async처리가 된다고 한다.
// 원래 쓰레드풀에 대한 설정도 해야되는데, 일단 실습을 위해 default 쓰레드풀 사용.
@EnableAsync
public class ApplicationEventPublisherApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationEventPublisherApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
//        SpringApplication.run(ApplicationEventPublisherApplication.class, args;
    }

}
