package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Repeticao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digiteSenha = sc.nextInt();

        while (digiteSenha != 1243){
            System.out.println("Senha incorreta. Tente novamente:");
            digiteSenha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");
        sc.close();
    }
}
