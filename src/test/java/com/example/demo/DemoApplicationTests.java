package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@AutoConfiguration
@SpringBootTest
class DemoApplicationTests {
@Autowired
private MockMvc mockMvc;


	@Test
	void contextLoads() {
	}
	 void testGetClientById() throws Exception {
        // Replace {id} with an actual ID for testing
        int id = 1;
System.out.println("this is worlnig fine");
        mockMvc.perform(get("/api/users/")
                .param("id", String.valueOf(id))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(id)); // Replace with actual JSON property
    }
    

}
