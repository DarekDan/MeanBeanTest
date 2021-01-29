package org.example;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;
import org.meanbean.lang.Factory;

public class MeanEntityTimestampFactory implements Factory<MeanEntity> {

    @Override
    public MeanEntity create() {
        return new MeanEntity(Timestamp.from(Instant.now()));
    }
}

