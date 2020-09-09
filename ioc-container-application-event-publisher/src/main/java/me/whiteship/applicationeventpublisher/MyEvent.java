package me.whiteship.applicationeventpublisher;

/*
스프링 4.2 이후로는
ApplicationEvent를 상속받지 않아도 되었다.
이것이 스프링이 추구하는 비침투성, pojo 방식의 프로그래밍이다.
 */

public class MyEvent {

    private int data;

    private Object source;

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }
}
