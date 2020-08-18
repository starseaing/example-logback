package com.starseaing.example.logback.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {

    public static final Logger LOGGER = LoggerFactory.getLogger(Foo.class);

    public void doIt() {
        //各级别的排序为：TRACE < DEBUG < INFO < WARN < ERROR
        LOGGER.error("error Did it again!");
        LOGGER.warn("warn Did it again!");
        LOGGER.info("info Did it again!");
        LOGGER.debug("debug Did it again!");
        LOGGER.trace("trace Did it again!");

    }
}
