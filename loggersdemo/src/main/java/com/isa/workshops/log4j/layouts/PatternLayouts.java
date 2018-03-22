package com.isa.workshops.log4j.layouts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.ObjectArrayMessage;

public class PatternLayouts {

    Logger logger = LogManager.getLogger("pattern-layout");


    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "log4j-layouts.xml");

        PatternLayouts patternLayouts = new PatternLayouts();

        patternLayouts.logger.info("some text message");
        patternLayouts.logger.info(new ObjectArrayMessage("Ben", "Jack", "Philip"));
        patternLayouts.logger.debug("one={}, two={}, three={}", 1, 2, 3);
        patternLayouts.logger.error("this is ERROR!!!");
    }
}
