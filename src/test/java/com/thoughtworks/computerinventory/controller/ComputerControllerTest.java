package com.thoughtworks.computerinventory.controller;

import com.thoughtworks.computerinventory.dto.ComputerDto;
import com.thoughtworks.computerinventory.service.ComputerService;
import java.util.Collections;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ComputerController.class)
public class ComputerControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ComputerService computerService;

  @Test
  public void should_get_a_list_when_get_computers() throws Exception {
    given(computerService.getComputers())
        .willReturn(
            Collections.singletonList(
                new ComputerDto(1, "MacBook 2015", "Haifeng Li", "2019-09-10")
            ));
    mockMvc.perform(MockMvcRequestBuilders.get("/computers"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$", hasSize(1)))
        .andExpect(jsonPath("$[0].id").value(1))
        .andExpect(jsonPath("$[0].type").value("MacBook 2015"))
        .andExpect(jsonPath("$[0].owner").value("Haifeng Li"))
        .andExpect(jsonPath("$[0].createTime").value("2019-09-10"))
        .andDo(print());
  }
}
