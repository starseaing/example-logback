package com.starseaing.example.logback.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackDemo2Application {

    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackDemo2Application.class);

    public static void main(String[] args) {
        LOGGER.info("Entering application.");
        SpringApplication.run(LogbackDemo2Application.class, args);
        Foo foo = new Foo();
        foo.doIt();
        LOGGER.info("Exiting application.");
    }
}
