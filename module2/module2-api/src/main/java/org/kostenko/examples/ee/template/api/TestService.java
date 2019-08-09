package org.kostenko.examples.ee.template.api;

/**
 * @author kostenko
 */
public interface TestService {

  String TOURNAMENT_SERVICE_NAME = "test-service";
  String TOURNAMENT_SERVICE_JNDI ="java:global/module2-core/" + TOURNAMENT_SERVICE_NAME;
  
  SomethingDto doSomething();
}
