package me.whiteship.applicationeventpublisher;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/*
Event는 빈이 아니어도되지만,
이벤트 핸들러는 빈으로 등록되어야지만 스프링이 누가 처리하는 건지 알 수 있다.

또한, 스프링 4.2 이후로는, 역시 ApplicationListener<이벤트>를 구현하지 않아도 되었다.
비침투성의 컨셉 실현.

대신, 처리 메소드에 @EventListener를 사용해서 handler의 메소드를 지정해줄 수 있다. (이렇게 함으로써, 메소드 명도 자유롭게 명명이 가능해짐.)
 */

@Component
public class MyEventHandler {

    @EventListener
    @Async
    public void handle(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받았다. 데이터는 " + myEvent.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
    }
}
