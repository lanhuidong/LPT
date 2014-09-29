package com.nexusy.log.log4j;

import com.nexusy.log.Constants;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author lan
 * @since 2014-09-29
 */
public class Log4jTest {

    @Test
    public void testInfo() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.info("it is log4j test");
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testInfoWithNum() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.info("it is log4j test" + i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testDebug() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.debug("it is log4j test");
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void testDebugWithNum() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.debug("it is log4j test" + i);
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
