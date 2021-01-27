package org.example;

import java.sql.Timestamp;
import java.time.Instant;
import org.meanbean.lang.Factory;

public class TimestampFactory implements Factory<Timestamp> {

    @Override
    public Timestamp create() {
        return Timestamp.from(Instant.now());
    }
}
