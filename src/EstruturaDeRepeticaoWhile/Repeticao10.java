package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Repeticao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número positivo:");
        int x = sc.nextInt();

        while (x <= 0){
            System.out.println("Número invalido. Digite novamente");
            x = sc.nextInt();
        }
        System.out.println("Número aceito: " + x);
    }
}
