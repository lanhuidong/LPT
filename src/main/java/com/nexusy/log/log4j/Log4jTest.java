package com.nexusy.log.log4j;

import com.nexusy.log.Constants;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * @author lan
 * @since 2014-09-29
 */
public class Log4jTest {

    private static long[] times = new long[4];

    @Test
    public void test() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        logger.info("it is a test");
    }

    @Test
    public void testInfo() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.info("it is a test");
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;
    }

    @Test
    public void testInfoWithNum() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.info("it is a test " + i);
        }
        long endTime = System.nanoTime();
        times[1] = endTime - startTime;
    }

    @Test
    public void testDebug() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.debug("it is a test");
        }
        long endTime = System.nanoTime();
        times[2] = endTime - startTime;
    }

    @Test
    public void testDebugWithNum() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        long startTime = System.nanoTime();
        for (int i = 0; i < Constants.repeatTimes; i++) {
            logger.debug("it is a test " + i);
        }
        long endTime = System.nanoTime();
        times[3] = endTime - startTime;
    }


    @AfterClass
    public static void tearDown() {
        for (long time : times) {
            System.out.println(time);
        }
    }
}
