package Exercicio.SomaDeNumeros;

public class Numero {
    //atributo
    private int numero;

    //construtor
    public Numero(int numero) {
        this.numero = numero;
    }

    //getter
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }
}
