package com.isa.workshops.log4j.layouts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.ObjectArrayMessage;

public class JsonLayouts {

    Logger logger = LogManager.getLogger("json-layout");

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "log4j-layouts.xml");

        JsonLayouts jsonLayouts = new JsonLayouts();

        jsonLayouts.logger.info("some json message");
        jsonLayouts.logger.info(new ObjectArrayMessage("Ben", "Jack", "Philip"));
        jsonLayouts.logger.debug("one={}, two={}, three={}", 1, 2, 3);
    }
}
