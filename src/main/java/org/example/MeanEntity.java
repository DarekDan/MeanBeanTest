package org.example;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class MeanEntity {

    private final java.sql.Timestamp timestamp;
    private final UUID uuid;

    public MeanEntity(Timestamp timestamp, UUID uuid){
        this.timestamp=timestamp;
        this.uuid = uuid;
    }

    public MeanEntity(Timestamp timestamp){
        this(timestamp, UUID.randomUUID());
    }

    public MeanEntity(UUID uuid){
        this(Timestamp.from(Instant.now()), uuid);
    }

    public MeanEntity(){
        this(Timestamp.from(Instant.now()), UUID.randomUUID());
    }

}
