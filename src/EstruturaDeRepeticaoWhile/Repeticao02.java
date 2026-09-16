package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Repeticao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para, fazer a contagem regressiva: ");
        int x = sc.nextInt();
        System.out.println("Contando....");
        while (x >= 1) {
            System.out.println(x);

            x = x - 1;
        }
        sc.close();
    }
}
