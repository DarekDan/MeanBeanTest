package org.example;

import java.util.UUID;
import org.meanbean.lang.Factory;

public class MeanEntityUuidFactory implements Factory<MeanEntity> {

    @Override
    public MeanEntity create() {
        return new MeanEntity(UUID.randomUUID());
    }
}

