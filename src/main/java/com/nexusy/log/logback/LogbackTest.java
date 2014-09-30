package com.nexusy.log.logback;

import com.nexusy.log.Constants;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lan
 * @since 2014-09-30
 */
public class LogbackTest {

    @Test
    public void test() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        logger.info("it is a test");
    }

    @Test
    public void testInfo() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.info("it is a test");
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testInfoWithNum() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.info("it is a test {}", i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testDebug() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.debug("it is a test");
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testDebugWithNum() {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.debug("it is a test {}", i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
