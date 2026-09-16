package EstruturaDeRepeticaoFor;

public class Exercicio05Tabuada {
    public static void main(String[] args) {

        int numero = 5;
        int resultado = 0;

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
