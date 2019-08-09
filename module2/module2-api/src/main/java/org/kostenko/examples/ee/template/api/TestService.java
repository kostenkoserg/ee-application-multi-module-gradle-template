package org.kostenko.examples.ee.template.api;

/**
 * @author kostenko
 */
public interface TestService {

  String TEST_SERVICE_NAME = "test-service";
  String TEST_SERVICE_JNDI ="java:global/module2-core/" + TEST_SERVICE_NAME;
  
  SomethingDto doSomething();
}
