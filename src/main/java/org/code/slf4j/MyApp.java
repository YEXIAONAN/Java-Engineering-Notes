package org.code.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {
    // 获取 Logger 实例
    private static final Logger logger = LoggerFactory.getLogger(MyApp.class);

    public static void main(String[] args) {
        logger.info("Application started");

        try {
            // 业务逻辑
        } catch (Exception e) {
            logger.error("An error occurred", e);
        }

        logger.info("Application finished");
    }
}