package org.jboss.cdi.tck.tests.implementation.producer.method.broken.parameterAnnotatedObservesAsync;

import javax.enterprise.event.ObservesAsync;
import javax.enterprise.inject.Produces;

public class BrokenProducer {

    @Produces
    public String produce(@ObservesAsync String message) {
        return "test";
    }
}
