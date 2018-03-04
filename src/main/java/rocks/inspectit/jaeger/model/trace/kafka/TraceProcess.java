package rocks.inspectit.jaeger.model.trace.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TraceProcess {
    @JsonProperty("serviceName")
    String serviceName;
    @JsonProperty("tags")
    List<TraceKeyValue> tags;
}
