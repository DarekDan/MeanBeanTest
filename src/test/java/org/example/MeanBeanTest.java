package org.example;

import java.sql.Timestamp;
import java.time.Instant;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanVerifier;

public class MeanBeanTest extends TestBase {

    @Test
    public void meanBeanTest() {
        beanTester.testBean(MeanEntity.class);
    }

    @Test
    public void meanBeanVerifierTest() {
        Timestamp timestamp = Timestamp.from(Instant.now());
        BeanVerifier.forClass(MeanEntity.class)
            .withSettings(verifierSettings -> {
                verifierSettings.registerFactory(MeanEntity.class, new MeanEntityFactory());
                verifierSettings.registerFactory(Timestamp.class, new TimestampFactory());
            }).verifyEqualsAndHashCode();
    }

    @Test
    public void meanBeanTimestampConstructorsTest(){
        BeanVerifier.forClass(MeanEntity.class)
            .withSettings(verifierSettings -> {
                verifierSettings.registerFactory(MeanEntity.class, new MeanEntityTimestampFactory());
                verifierSettings.registerFactory(Timestamp.class, new TimestampFactory());
            }).verifyToString();
    }

    @Test
    public void meanBeanUuidConstructorsTest(){
        BeanVerifier.forClass(MeanEntity.class)
            .withSettings(verifierSettings -> {
                verifierSettings.registerFactory(MeanEntity.class, new MeanEntityUuidFactory());
                verifierSettings.registerFactory(Timestamp.class, new TimestampFactory());
            }).verifyToString();
    }
}
