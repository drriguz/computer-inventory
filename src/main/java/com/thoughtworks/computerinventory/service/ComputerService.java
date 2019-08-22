package com.thoughtworks.computerinventory.service;

import com.thoughtworks.computerinventory.dto.ComputerDto;
import com.thoughtworks.computerinventory.entity.ComputerEntity;
import com.thoughtworks.computerinventory.repository.ComputerRepository;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {

  @Autowired
  private ComputerRepository computerRepository;

  private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");

  public List<ComputerDto> getComputers() {
    return computerRepository.findAll()
        .stream()
        .map(this::convert)
        .collect(Collectors.toList());
  }

  private ComputerDto convert(ComputerEntity entity) {
    return new ComputerDto(entity.getId(),
        entity.getType(),
        entity.getOwner(),
        simpleDateFormat.format(entity.getCreateTime()));
  }
}
