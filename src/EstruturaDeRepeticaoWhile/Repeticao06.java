package EstruturaDeRepeticaoWhile;/*
Faça um programa que mostre todos os números inteiros de 5 até 25, pulando de 2 em 2.

O primeiro número mostrado deve ser 5. Depois dele, o programa deve mostrar 7, depois 9, e continuar seguindo esse intervalo até chegar ao último número possível que não ultrapasse 25.

Utilize a estrutura de repetição while.
 */

public class Repeticao06 {
    public static void main(String[] args) {

        int x = 5;

        while (x <= 25) {
            System.out.println(x);
            x = x + 2;
        }
    }
}
