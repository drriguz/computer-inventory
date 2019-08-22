package com.thoughtworks.computerinventory.repository;

import com.thoughtworks.computerinventory.entity.ComputerEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ComputerRepositoryTest {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private ComputerRepository computerRepository;

  @Before
  public void prepareData() throws ParseException {
    entityManager.persistAndFlush(new ComputerEntity(1,
        "MacBook 2015",
        "Haifeng Li",
        new SimpleDateFormat("dd/MM/yyyy").parse("01/09/2019"))
    );
    entityManager.persistAndFlush(new ComputerEntity(2,
        "Desktop",
        null,
        new SimpleDateFormat("dd/MM/yyyy").parse("02/09/2019"))
    );
  }

  @Test
  public void should_return_all_records_in_db_when_find_all() {
    List<ComputerEntity> entities = computerRepository.findAll();
    assertEquals(2, entities.size());
  }
}
