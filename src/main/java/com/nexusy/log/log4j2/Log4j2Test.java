package com.nexusy.log.log4j2;

import com.nexusy.log.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @author lan
 * @since 2014-09-30
 */
public class Log4j2Test {

    @Test
    public void test() {
        Logger logger = LogManager.getLogger(Log4j2Test.class);
        logger.info("it is a test");
    }

    @Test
    public void testInfo() {
        Logger logger = LogManager.getLogger(Log4j2Test.class);
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.info("it is a test");
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testInfoWithNum() {
        Logger logger = LogManager.getLogger(Log4j2Test.class);
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.info("it is a test {}", i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testDebug() {
        Logger logger = LogManager.getLogger(Log4j2Test.class);
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.debug("it is a test");
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testDebugWithNum() {
        Logger logger = LogManager.getLogger(Log4j2Test.class);
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.debug("it is a test {}", i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
