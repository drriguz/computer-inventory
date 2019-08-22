package com.thoughtworks.computerinventory.service;

import com.thoughtworks.computerinventory.dto.ComputerDto;
import com.thoughtworks.computerinventory.entity.ComputerEntity;
import com.thoughtworks.computerinventory.repository.ComputerRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class ComputerServiceTest {

  @Mock
  private ComputerRepository computerRepository;

  @InjectMocks
  private ComputerService computerService;

  @Test
  public void should_return_computer_list_when_get_all_computers() throws ParseException {
    ComputerEntity stored = new ComputerEntity(1,
        "MacBook 2015",
        "Haifeng Li",
        new SimpleDateFormat("dd/MM/yyyy").parse("01/09/2019"));
    given(computerRepository.findAll()).willReturn(Collections.singletonList(stored));

    List<ComputerDto> computers = computerService.getComputers();

    assertEquals(1, computers.size());
    assertEquals(1, computers.get(0).getId());
    assertEquals("MacBook 2015", computers.get(0).getType());
    assertEquals("Haifeng Li", computers.get(0).getOwner());
    assertEquals("2019-09-01", computers.get(0).getCreateTime());
  }
}
