package com.starseaing.example.logback.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {

    public static final Logger LOGGER = LoggerFactory.getLogger(Foo.class);

    public void doIt() {
        LOGGER.debug("Did it again!");
    }
}
