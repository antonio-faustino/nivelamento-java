package EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exercicio15ContarNumerosPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;

        for (int i = 1; i <= 10; i++){
            int x = sc.nextInt();

            if(x > 0){
                contador++;
            } else if (x < 0){
                contador2++;
            } else {
                contador3++;
            }
        }
        System.out.println("Quantidade de positivos: " + contador);
        System.out.println("Quantidade de negativos: " + contador2);
        System.out.println("Quantidade de zeros: " + contador3);
    }
}
