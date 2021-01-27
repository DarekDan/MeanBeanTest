package org.example;

import java.sql.Timestamp;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanVerifier;

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

    @Test
    public void meanBeanVerifierTest() {
        BeanVerifier.forClass(MeanEntity.class)
            .withSettings(verifierSettings -> {
                verifierSettings.getFactoryCollection()
                    .addFactory(Timestamp.class, new TimestampFactory());
            });
    }
}
