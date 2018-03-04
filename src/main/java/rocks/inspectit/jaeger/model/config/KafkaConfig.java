package rocks.inspectit.jaeger.model.config;

import lombok.Data;

@Data
public class KafkaConfig {
    public static final String KAFKA = "kafka";
    private String bootstrapServers;
    private String groupId;
    private String inputTopic;
    private String outputTopic;
}
