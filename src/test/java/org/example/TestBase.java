package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.meanbean.test.BeanTester;

public class TestBase {

    final static BeanTester beanTester = new BeanTester();

    @BeforeAll
    public static void setup(){
        beanTester.getFactoryCollection().addFactory(java.sql.Timestamp.class, new TimestampFactory());
    }

}
