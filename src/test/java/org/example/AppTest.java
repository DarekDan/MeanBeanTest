package org.example;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestBase {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void meanBeanTest() {
        beanTester.testBean(MeanEntity.class);
    }
}
