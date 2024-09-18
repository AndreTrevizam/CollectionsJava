package exemplosDeTypes;

import java.util.HashMap;
import java.util.Map;

public class GenericsExemploMap {
    public static void main(String[] args) {
        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("Andre", 20);
        mapaGenerics.put("Matuto", 23);

        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
    }
}
