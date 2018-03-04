package rocks.inspectit.jaeger.model.config;

import lombok.Data;

@Data
public class Configuration {
    private String input;
    private String output;
    private String serviceName;
    private long startTime;
    private long endTime;
    private long interval;
    private KafkaConfig kafka;
    private ElasticSearchConfig elasticsearch;
    private CassandraConfig cassandra;
}
