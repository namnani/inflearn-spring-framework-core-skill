package me.whiteship.resourceloader;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty title is now allowed.");
//        Event event = (Event)target;
//        if (event.getTitle() == null) {
//            // 굳이 ValidationUtils를 사용하는게 아니고,
//            // errors에 직접 에러를 담을 수도 있음.
//            errors.reject();
//            errors.rejectValue();
//        }
    }
}
