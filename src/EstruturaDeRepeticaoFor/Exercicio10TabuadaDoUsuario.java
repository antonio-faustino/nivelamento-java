package EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exercicio10TabuadaDoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int resultado = 0;

        for (int i = 1; i <= 10; i++) {
            resultado = x * i;
            System.out.println(x + " X " + i + " = " + resultado);
        }
    }
}
