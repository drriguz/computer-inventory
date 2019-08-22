package com.thoughtworks.computerinventory.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ComputerController.class)
public class ComputerControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void should_get_a_list_when_get_computers() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/computers"))
        .andExpect(status().isOk());
  }
}
