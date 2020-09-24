package me.whiteship.databindingabstraction.propertyeditor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)

/*
컴포넌트 스캔이 가능한 빈이어야지 테스트를 위한 빈으로 등록을 해준다!
밑의 주석과 같은 방식으로, 테스트에 필요한 빈들을 명시적으로 정의하는 것도 좋다고 생각하신다.
 */
/*@WebMvcTest({
        EventConverter.StringToEventConverter.class,
        EventController.class})*/
@WebMvcTest
public class EventControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getTest() throws Exception {
        mockMvc.perform(get("/event/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }
}