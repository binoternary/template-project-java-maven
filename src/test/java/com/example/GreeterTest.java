package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreeterTest {

    private final String name = "Foo";
    private final Greeter greeter = new Greeter(name);
    private final String greeting = greeter.getGreeting();

    @Test
    void testGreetingContainsName() {
        assertThat(greeting).contains(name);
    }

    @Test
    void testGreetingExclaims() {
        assertThat(greeting).endsWith("!");
    }
}