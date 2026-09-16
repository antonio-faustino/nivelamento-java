package EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exercicio12ContarNumerosParesDoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int contadorPares = 0;

        for(int i = 1; i <= 10; i++) {
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                contadorPares = contadorPares + 1;
            }
        }
        System.out.println("Quantidade de números pares: " + contadorPares);
    }
}
