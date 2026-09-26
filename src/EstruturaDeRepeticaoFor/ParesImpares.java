package EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 1; i <= 10; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println("Quantidade de números pares: " + contadorPar);
        System.out.println("Quantidade de números Impares: " + contadorImpar);
    }

}
