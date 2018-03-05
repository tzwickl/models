package rocks.inspectit.jaeger.model.trace.elasticsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class IndexMapping {
    public static String getExtendedTraceMapping() {
        ClassLoader classLoader = IndexMapping.class.getClassLoader();
        URL fileURL = classLoader.getResource("mappings/elasticsearch/extendedTrace.json");
        try {
            return new BufferedReader(new InputStreamReader(fileURL.openStream())).lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            return null;
        }
    }
}
