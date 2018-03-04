package rocks.inspectit.jaeger.model.trace.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TraceSpanRef {
    @JsonProperty("refType")
    String refType;
    @JsonProperty("traceID")
    String traceId;
    @JsonProperty("spanID")
    Long spanId;
}
