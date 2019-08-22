package com.thoughtworks.computerinventory.controller;

import com.thoughtworks.computerinventory.dto.ComputerDto;
import com.thoughtworks.computerinventory.service.ComputerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/computers")
public class ComputerController {

  @Autowired
  private ComputerService computerService;

  @GetMapping
  public List<ComputerDto> getComputers() {
    return computerService.getComputers();
  }
}
