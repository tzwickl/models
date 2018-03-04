package rocks.inspectit.jaeger.model.trace.elasticsearch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Trace {
    @JsonProperty("traceID")
    String traceId;
    @JsonProperty("spanID")
    String spanId;
    @JsonProperty("duration")
    Long duration;
    @JsonProperty("flags")
    Integer flags;
    @JsonProperty("logs")
    List<TraceLog> logs;
    @JsonProperty("operationName")
    String operationName;
    @JsonProperty("parentSpanID")
    String parentId;
    @JsonProperty("process")
    TraceProcess process;
    @JsonProperty("processID")
    String processId;
    @JsonProperty("refs")
    List<TraceSpanRef> refs;
    @JsonProperty("startTime")
    Long startTime;
    @JsonProperty("tags")
    List<TraceKeyValue> tags;
    @JsonProperty("references")
    List<String> references;
    @JsonProperty("warnings")
    String warnings;
    @JsonProperty("startTimeMillis")
    Long startTimeMillis;

    // Kafka properties
    @JsonIgnore
    String UUID;
    @JsonIgnore
    String type;
    @JsonIgnore
    String indexName;
}
