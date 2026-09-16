package EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exercicio11SomaNumeroDigitado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int resultado = 0;

        for (int i = 1; i <= x; i++) {
            resultado +=i;
        }
        System.out.println("A soma é: "+resultado);
    }
}
