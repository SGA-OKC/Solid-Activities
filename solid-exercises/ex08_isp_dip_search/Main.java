
import java.util.List;

public class Main {

        public static void main(String[] args) {
            QueryEngine engine = new Mecanismo();
            AutocompleteService autocomplete = new AutocompleteService(engine);

            List<String> sugerindo = autocomplete.sugerir("VT");
            System.out.println("Sugestoes: " + sugerindo);
        }
    }
