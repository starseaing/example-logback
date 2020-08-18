package com.starseaing.example.logback.demo2;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackDemo2Application {

    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackDemo2Application.class);

    public static void main(String[] args) {

        //在没有警告或错误的情况下，如果你想查看 logback 内部的状态信息，
        //可以通过 StatusPrinter 类来调用 print() 方法查看具体的信息。
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        LOGGER.info("Entering application.");
        SpringApplication.run(LogbackDemo2Application.class, args);
        Foo foo = new Foo();
        foo.doIt();
        LOGGER.info("Exiting application.");
    }
}
