package com.thoughtworks.computerinventory.controller;

import com.thoughtworks.computerinventory.dto.ComputerDto;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/computers")
public class ComputerController {

  @GetMapping
  public List<ComputerDto> getComputers() {
    return null;
  }
}
