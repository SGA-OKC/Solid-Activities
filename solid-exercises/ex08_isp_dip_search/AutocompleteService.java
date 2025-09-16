import java.util.List;

public class AutocompleteService {
        private final QueryEngine engine;

        AutocompleteService(QueryEngine engine) {
            this.engine = engine;
        }

        List<String> sugerir(String prefix) {
            return engine.query(prefix + "-");
        }
    }