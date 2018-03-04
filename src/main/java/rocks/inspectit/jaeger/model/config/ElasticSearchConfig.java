package rocks.inspectit.jaeger.model.config;

import lombok.Data;

@Data
public class ElasticSearchConfig {
    public static final String ELASTICSEARCH = "elasticsearch";
    private String host;
    private String doc;
    private int port;
    private String scheme;
}
