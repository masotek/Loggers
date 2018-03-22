package com.isa.workshops.log4j.simple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsoleLoggerExample {

    Logger logger = LogManager.getLogger(ConsoleLoggerExample.class);

    public static void main(String[] args) {

        System.setProperty("log4j.configurationFile", "log4j-simple.xml");

        ConsoleLoggerExample consoleLoggerExample = new ConsoleLoggerExample();

        consoleLoggerExample.logger.info("This is simple log from class {}", ConsoleLoggerExample.class.getName());

        consoleLoggerExample.logger.info("This is simple log from class {} in package {}", ConsoleLoggerExample.class.getName(), ConsoleLoggerExample.class.getPackage().getName());

        consoleLoggerExample.logger.info("This is simple log from class {} in package {}", new Object[]{ConsoleLoggerExample.class.getName(), ConsoleLoggerExample.class.getPackage().getName()});
    }
}
