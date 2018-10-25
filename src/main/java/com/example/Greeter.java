package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Greeter {

    private static final Logger log = LoggerFactory.getLogger(Greeter.class);

    private final String name;

    public Greeter(String name) {
        log.info("Create greeter for '{}'", name);
        this.name = Objects.requireNonNull(name);
    }

    public String getGreeting() {
        log.debug("Greeting '{}'", name);
        return String.format("Hello, %s!", name);
    }
}
