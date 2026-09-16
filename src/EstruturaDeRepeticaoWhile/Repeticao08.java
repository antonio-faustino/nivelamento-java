package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Repeticao08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero, para o programa calcular a soma de todos os números inteiros começando em 1 e terminando no número informado por você.");
        int digiteNumero = sc.nextInt();

        int x = 1;
        int soma = 0;

        while (x <= digiteNumero) {
            soma = soma + x;
            x++;
        }
        System.out.println("A soma é: " + soma);
    }
}
