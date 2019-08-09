package org.kostenko.examples.ee.template.core;

import org.kostenko.examples.ee.template.api.TestService;
import org.kostenko.examples.ee.template.api.SomethingDto;
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

    @Override
    public SomethingDto doSomething() {
        TestEntity entity = entityManager.find(TestEntity.class, Long.MAX_VALUE);
        
        return new SomethingDto("Hello Jakarta EE world!");
    }
}
