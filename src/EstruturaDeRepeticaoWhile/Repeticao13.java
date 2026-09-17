package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Repeticao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }
        //System.out.println("Numero invalido");
        System.out.println("Soma dos números digitados: " + soma);
        return;
    }
}
