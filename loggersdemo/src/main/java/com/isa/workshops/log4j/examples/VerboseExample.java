package com.isa.workshops.log4j.examples;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerboseExample {

    Logger logger = LogManager.getLogger(VerboseExample.class.getName());

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "log4j-examples.xml");

        VerboseExample verboseExample = new VerboseExample();

        Level VERBOSE = Level.forName("VERBOSE", 350);

        verboseExample.logger.log(VERBOSE, "This is VERBOSE log.");
    }
}
