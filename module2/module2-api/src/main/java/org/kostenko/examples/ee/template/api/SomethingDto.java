package org.kostenko.examples.ee.template.api;

import java.io.Serializable;

/**
 *
 * @author kostenko
 */
public class SomethingDto implements Serializable{
    private final String message;

    public SomethingDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
