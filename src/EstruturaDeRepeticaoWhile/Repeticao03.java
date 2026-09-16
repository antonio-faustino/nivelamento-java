package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Repeticao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;

        while (x <= 10) {
            System.out.println(x);
            x = x + 2;
        }
    }
}