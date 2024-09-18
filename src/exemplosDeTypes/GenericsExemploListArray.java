package exemplosDeTypes;

import java.util.ArrayList;
import java.util.List;

public class GenericsExemploListArray {
    public static void main(String[] args) {
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("elemento 1");
        listaGenerics.add("elemento 2");
        System.out.println(listaGenerics);

        for (String elementos : listaGenerics) {
            System.out.println(elementos);
        }
    }
}