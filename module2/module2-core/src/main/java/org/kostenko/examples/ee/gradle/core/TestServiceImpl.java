package org.kostenko.examples.ee.gradle.core;

import org.kostenko.examples.ee.gradle.api.TestService;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author kostenko
 */
@Remote(TestService.class)
@Stateless(name = TestService.TOURNAMENT_SERVICE_NAME)
public class TestServiceImpl implements TestService {


  @PersistenceContext
  EntityManager entityManager;

  public void setTournamentStatus() {

    TestEntity entity = entityManager.find(TestEntity.class, 1);
    
  }
}
