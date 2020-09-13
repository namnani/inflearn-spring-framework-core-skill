package me.whiteship.databindingabstraction.propertyeditor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

/*
얘는 Thread-Safe함.
bean으로 등록할 수 있음.
=> 그 얘기는 다른 bean들도 주입받을 수 있다는 것을 의미.

Converter와 Formatter는 ConversionService에 등록되는 것이고,
ConversionService를 통해서 실제 변환하는 작업이 이루어지는 것임.

반면, PropertyEditor는 DataBinder에 등록되어서, 변환 작업이 이루어지는 것임.
 */
//@Component
public class EventFormatter implements Formatter<Event> {

    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        System.out.println("Formatter");
        return new Event(Integer.parseInt(text));
    }

    @Override
    public String print(Event object, Locale locale) {
        return null;
    }
}
