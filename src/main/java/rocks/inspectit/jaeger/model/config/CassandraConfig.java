package rocks.inspectit.jaeger.model.config;

import lombok.Data;

@Data
public class CassandraConfig {
    public static final String CASSANDRA = "cassandra";
    private String host;
    private String keyspace;
}
