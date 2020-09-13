package me.whiteship.databindingabstraction.propertyeditor;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    // 컨트롤러에서 사용할 바인더를 등록하는 과정.
    // 물론 전역으로 하는 방법도 있긴함.
    // 이제 이 컨트롤러에 PropertyEditor를 등록해노면, 이 컨트롤러가 요청을 처리하기 전에,
    // 바인더에 등록된 PropertyEditor를 사용하게 된다.

    // 내 생각에, 스프링부트에서 자동으로 PropertyEditor를 찾아서 등록을 해주는 것도 같은데?
    /*
    Standard JavaBeans infrastructure will automatically discover PropertyEditor classes
    if they are in the same package as the class they handle.
    Also, these need to have the same name as that class plus the Editor suffix.

    For example, if we create a CreditCard model class, then we should name the editor class CreditCardEditor.
     */
//    @InitBinder
//    public void init(WebDataBinder webDataBinder) {
//        webDataBinder.registerCustomEditor(Event.class, new EventEditor());
//    }


    /*
    기본적으로 Integer같은 애들은, 기본적으로 등록되어있는 컨버터나 포매터가 자동으로 변환을 해준다.
    스프링이 자동으로 안해주는 애들만 컨버터나 포매터로 등록하면 된다.
     */
    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event) {
        System.out.println(event);
        return event.getId().toString();
    }
}
