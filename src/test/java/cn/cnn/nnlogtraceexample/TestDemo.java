package cn.cnn.nnlogtraceexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author stxyg
 * @since 2022/12/29
 **/
@SpringBootTest
public class TestDemo {

    MockMvc mockMvc;

    @BeforeEach
    void before(WebApplicationContext wac){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    void TestController() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/"));
    }
}
