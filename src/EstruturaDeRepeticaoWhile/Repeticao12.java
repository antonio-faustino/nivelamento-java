package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Repeticao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();
        int contador = 0;

        while (x != 0) {
            contador++;
            x = sc.nextInt();
        }
        //System.out.println("Numero invalido");
        System.out.println("Quantidade de números digitados: " + contador);
        //return;
        sc.close();
    }
}
