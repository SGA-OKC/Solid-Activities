import java.util.Arrays;
import java.util.List;

public class Mecanismo implements QueryEngine, Indexer, MaintenanceOps{
        @Override
        public List<String> query(String x) {
            return Arrays.asList("resulto 1 for " + x, "resulto 2 for " + x);
        }

        @Override
        public List<String> index(String path) {
            return Arrays.asList("índices " + path);
        }

        @Override
        public void aquecimento() {
            System.out.println("aquecido cache");
        }

        @Override
        public void reconstruindo() {
            System.out.println("reconstrui índices");
        }
    }