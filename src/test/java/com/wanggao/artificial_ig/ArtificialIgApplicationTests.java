package com.wanggao.artificial_ig;

import com.wanggao.artificial_ig.bean.PostAdd;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ArtificialIgApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddPost() throws Exception {
        PostAdd postAdd = new PostAdd();
        postAdd.setUsername("exampleUser");
        postAdd.setPassword("examplePassword");
        postAdd.setTitle("Example Title");
        postAdd.setContent("Example content...");
        postAdd.setCategoryId(1L);

        mockMvc.perform(MockMvcRequestBuilders.post("/posts/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"username\":\"exampleUser\",\"password\":\"examplePassword\",\"title\":\"Example Title\",\"content\":\"Example content...\",\"categoryId\":1}"))
                .andExpect(status().isOk());
    }

}
