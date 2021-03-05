package com.rafsoft;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        logger.info("Singleton Object: ");
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();

        logger.info(singletonObject1.toString());
        logger.info(singletonObject2.toString());

    }
}
