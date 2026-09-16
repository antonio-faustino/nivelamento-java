package EstruturaDeRepeticaoWhile;/*
Exercício 05 —

Um programa deve mostrar na tela os números inteiros de 20
até 5, começando pelo maior valor.

Utilize while.
 */

public class Repeticao05 {
    public static void main(String[] args) {

        int x = 20;

        while (x >= 5) {
            System.out.println(x);
            x = x - 1;
        }
    }
}
