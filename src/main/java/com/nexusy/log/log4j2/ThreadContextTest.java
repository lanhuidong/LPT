package com.nexusy.log.log4j2;

import org.apache.logging.log4j.CloseableThreadContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import java.util.UUID;

/**
 * @author lanhuidong
 * @since 2017-01-05
 */
public class ThreadContextTest {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws Exception {
        new Thread(new SubThread()).start();
        testMDC();
        testNDC();
        testCloseableThreadContext();
    }

    /**
     * PatternLayout中使用%X或%X{key}
     */
    public static void testMDC() throws Exception {
        ThreadContext.put("id", UUID.randomUUID().toString());
        LOGGER.info("MDC test.");
        Thread.sleep(2000);
        LOGGER.info("before clear map");
        ThreadContext.clearMap();
    }

    /**
     * PatternLayout中使用%x
     */
    public static void testNDC() {
        ThreadContext.push(UUID.randomUUID().toString());
        LOGGER.info("NDC test");
        ThreadContext.clearStack();
    }

    public static void testCloseableThreadContext() {
        try (CloseableThreadContext.Instance ctc = CloseableThreadContext.put("id", UUID.randomUUID().toString())) {
            LOGGER.info("Message 1");
            LOGGER.info("Message 2");
        }
    }

    /**
     * 需要设置系统属性-DisThreadContextMapInheritable=true
     *
     * 注：测试时无法加载log4j2.component.properties，为找到具体原因
     */
    public static class SubThread implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LOGGER.info("sub thread test");
        }
    }

}
