package EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exercicio13ContarNumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 7; i++) {
            int x = sc.nextInt();
            if (x < 0){
                contador++;
            }
        }
        System.out.println("Quantidade de números negtivos: " + contador);
    }
}
