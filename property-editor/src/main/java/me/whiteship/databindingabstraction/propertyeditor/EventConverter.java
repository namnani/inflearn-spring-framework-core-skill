package me.whiteship.databindingabstraction.propertyeditor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class EventConverter {

    /*
    Converter는 상태정보가 없기 때문에,
    얼마든지 bean으로 등록 가능하다.
    ConverterRegistry에 등록해서 사용해야 한다.
     */

    @Component
    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String source) {
            System.out.println("Converter");
            return new Event(Integer.parseInt(source));
        }
    }

//    @Component
    public static class EventToStringConverter implements Converter<Event, String> {
        @Override
        public String convert(Event source) {
            return source.getId().toString();
        }
    }
}
