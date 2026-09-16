package EstruturaDeRepeticaoFor;

public class Exercicio06SomaIntervalo {
    public static void main(String[] args) {

        int resultado = 0;

        for (int i = 1; i <= 10; i++) {
            resultado = resultado + i;
            System.out.println(i);
        }
        System.out.println("A soma é: "+ resultado);

    }
}
