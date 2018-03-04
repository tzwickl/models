package rocks.inspectit.jaeger.model.trace.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TraceKeyValue {
    @JsonProperty("key")
    String key;
    @JsonProperty("type")
    String type;
    @JsonProperty("value")
    String value;
}
