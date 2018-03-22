package com.isa.workshops.slf4j.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlfDemo {
    Logger logger = LoggerFactory.getLogger(SlfDemo.class.getName());

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "log4j-simple.xml");

        SlfDemo slfDemo = new SlfDemo();

        slfDemo.logger.debug("SLF demo logger");
    }
}
