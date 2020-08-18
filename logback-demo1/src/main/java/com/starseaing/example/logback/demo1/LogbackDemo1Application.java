package com.starseaing.example.logback.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackDemo1Application {

    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackDemo1Application.class);

    public static void main(String[] args) {
        LOGGER.info("Entering application.");
        SpringApplication.run(LogbackDemo1Application.class, args);
        Foo foo = new Foo();
        foo.doIt();
        LOGGER.info("Exiting application.");
    }

}
