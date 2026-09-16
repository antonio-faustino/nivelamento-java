package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Repeticao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite um numero para exibir sua tabuada: ");
        int x = sc.nextInt();

        int numero = 1;
        int resultado = 0;

        while (numero <= 10) {
            resultado = x * numero;
            System.out.println(x + " X " + numero + " = " + resultado);
            numero = numero + 1;
        }
    }
}
