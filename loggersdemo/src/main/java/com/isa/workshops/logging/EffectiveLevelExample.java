package com.isa.workshops.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EffectiveLevelExample {

    Logger logger = Logger.getLogger(EffectiveLevelExample.class.getName());

    public static void main(String[] args) {

        EffectiveLevelExample effectiveLevelExample = new EffectiveLevelExample();

//        effectiveLevelExample.logger.setLevel(Level.WARNING);
        effectiveLevelExample.logger.log(Level.INFO, "Effective Level Example Log");
    }
}
