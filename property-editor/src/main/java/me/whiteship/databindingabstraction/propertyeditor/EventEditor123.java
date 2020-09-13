package me.whiteship.databindingabstraction.propertyeditor;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

// PropertyEditor를 구현하는 건 메소드가 너무 많아서 비효율적임.
// PropertyEditor는 상태를 가지고 있어서, thread-safe 하지않다.
// 그래서 얘는 빈으로 등록해서 쓰면 안된다. 쓰레드 스코프의 빈으로 만들어서 쓰면 상관없지만,, 전혀 빈으로 등록안하는걸 추천한다 ㅎㅎ.

/*
하지만 이 방법은 구현도 편리하지않고,
쓰레드 세이프하지않아 빈으로 등록해서 쓰기도 너무 위험하구!

그래서 스프링 3부터는, 또 다른 DataBinding과 관련된
interface와 기능들이 추가되었는데,
다음 시간에 Converter와 Formatter에 대해서 살펴 보겠다!
 */
public class EventEditor123 extends PropertyEditorSupport /* implements PropertyEditor */ {

    /*
    getAsText()와 setAsText()를 보면 알겠지만,
    Object와 String간의 변환만 되고 있다는 것이 PropertyEditor의 단정중에 하나임.
     */

    // PropertyEditorSupport를 구현하면, 구현해야할 메소드를 선택할 수 있고,
    // 보통 getAsText()랑, setAsText()만 구현하면 된다.
    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return event.getId().toString();
    }

    // 지금 우리는, 문자열로 들어오는 값을 이벤트로 변환해주는 것이기 때문에 이것만 일단은 구현해도 된다.
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("PropertyEditor");
        setValue(new Event(Integer.parseInt(text)));
    }
}
