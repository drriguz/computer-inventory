package com.thoughtworks.computerinventory.repository;

import com.thoughtworks.computerinventory.entity.ComputerEntity;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ComputerRepository {

  public List<ComputerEntity> findAll() {
    return Collections.emptyList();
  }
}
