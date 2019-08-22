package com.thoughtworks.computerinventory;

import com.thoughtworks.computerinventory.dto.ComputerDto;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IntegrationTest {

  @Autowired
  private TestRestTemplate testClient;

  @Test
  public void should_get_computer_list_when_call_list_computer_api() {
    ResponseEntity<List<ComputerDto>> response = testClient.exchange(
        "/computers",
        HttpMethod.GET,
        null,
        new ParameterizedTypeReference<List<ComputerDto>>() {
        });
    assertEquals(HttpStatus.OK, response.getStatusCode());
  }
}
