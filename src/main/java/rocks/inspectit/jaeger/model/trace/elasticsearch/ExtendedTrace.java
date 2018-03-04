package rocks.inspectit.jaeger.model.trace.elasticsearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExtendedTrace extends Trace {
    @JsonProperty("businessTransactionName")
    String businessTransactionName;
}
