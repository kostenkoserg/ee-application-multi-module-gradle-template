package org.kostenko.examples.ee.gradle.api;

/**
 * @author kostenko
 */
public interface TestService {

  String TOURNAMENT_SERVICE_NAME = "test-service";
  String TOURNAMENT_SERVICE_JNDI ="java:global/module2/module2-core/" + TOURNAMENT_SERVICE_NAME;

  
}
