package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.meanbean.factories.FactoryCollection;
import org.meanbean.test.BeanTester;
import org.meanbean.test.EqualsMethodTester;

public class TestBase {

    final static BeanTester beanTester = new BeanTester();
    final static EqualsMethodTester equalsTester = new EqualsMethodTester();

    @BeforeAll
    public static void setup(){
        FactoryCollection factoryCollection = beanTester.getFactoryCollection();
        factoryCollection
            .addFactory(java.sql.Timestamp.class, new TimestampFactory());
    }

}
