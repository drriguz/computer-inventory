package com.thoughtworks.computerinventory.repository;

import com.thoughtworks.computerinventory.entity.ComputerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<ComputerEntity, Integer> {

}
