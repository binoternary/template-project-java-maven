package com.example;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public final class HelloWorldApp {

    public static final String GREETEE_NAME_KEY = "app.greetee.name";

    private HelloWorldApp() { }

    public static void main(String[] args) {
        Config conf = ConfigFactory.load();
        Greeter greeter = new Greeter(conf.getString(GREETEE_NAME_KEY));
        System.out.println(greeter.getGreeting());
    }
}
