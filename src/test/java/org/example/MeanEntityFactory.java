package org.example;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;
import org.meanbean.lang.Factory;

public class MeanEntityFactory implements Factory<MeanEntity> {

    static final Timestamp timestamp = Timestamp.from(Instant.now());
    static final UUID uuid = UUID.randomUUID();

    @Override
    public MeanEntity create() {
        return new MeanEntity(timestamp, uuid);
    }
}
