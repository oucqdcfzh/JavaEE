package edu.cn;

import edu.cn.controller.HelloController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @program MVCDemo
 * @description:
 * @author:
 * @create:2019-10-07 04:59:33
 **/

public class HelloControllerTest {

    @Test
    public void testHelloPage() throws Exception{
        HelloController helloController = new HelloController();
    //    assertEquals("hello",helloController.hello());
        MockMvc mockMvc = standaloneSetup(helloController).build();
        mockMvc.perform(get("/hello")).andExpect(view().name("world"));
    }
}
