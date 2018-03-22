package com.isa.workshops.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingHierarchy {

    private Logger parentLogger = Logger.getLogger(LoggingHierarchy.class.getPackage().getName());
    private Logger logger = Logger.getLogger(LoggingHierarchy.class.getName());

    public static void main(String[] args) {

        LoggingHierarchy loggingHierarchy = new LoggingHierarchy();

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                loggingHierarchy.logger.log(Level.WARNING, "EVEN number: {0} with logger name {1}",
                        new Object[]{String.valueOf(i), loggingHierarchy.logger.getName()});

            } else {
                loggingHierarchy.logger.getParent().log(Level.SEVERE, "ODD number: {0} with logger name {1}",
                        new Object[]{String.valueOf(i), loggingHierarchy.logger.getParent().getName()});
            }
        }
    }
}
