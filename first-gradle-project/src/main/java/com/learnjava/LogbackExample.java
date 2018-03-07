package com.learnjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LogbackExample.class);

    public static void main(String[] args) {


        logger.info("My first info Logger");

        logger.warn("My first warning Logger");

        logger.error("My first error logger");
    }
}
