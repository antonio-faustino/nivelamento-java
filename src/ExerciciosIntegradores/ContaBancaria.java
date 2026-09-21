package ExerciciosIntegradores;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = "Antonio Tales";
        String tipoConta = "Corrente";
        double saldoConta = 3000.00;

        System.out.println("----------------------------");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo na Conta: " + saldoConta);
        System.out.println("----------------------------");

        String menu = """
                 
                 **** Operações ****
                
                1- Consultar saldos
                2- Depositar valor
                3- Transferir valor
                4- Sair
               ----------------------------
                """;

        System.out.println(menu);
        int opcao = sc.nextInt();

        while (opcao != 4){
            if (opcao == 1) {
                System.out.printf("Saldo atualizado: R$ %.2f\n", saldoConta);
                System.out.println(menu);
            } else if (opcao == 2) {
                System.out.println("Digite um valor a depositar: ");
                double valorDepositar = sc.nextDouble();
                saldoConta += valorDepositar;
                System.out.printf("Depositado. Valor em conta atualizado: R$ %.2f%n", saldoConta);
                System.out.println(menu);
            } else if (opcao == 3) {
                System.out.println("Digite um valor a transferir: ");
                double valorTransferir = sc.nextDouble();
                if (valorTransferir > saldoConta || valorTransferir <= 0) {
                    System.out.println("Saldo insuficiente para realizar a transferência");
                    System.out.println(menu);
            } else {
                    saldoConta -= saldoConta;
                    System.out.printf("Valor Transferido. Valor em conta atualizado: R$ %.2f%n", saldoConta);
                    System.out.println(menu);
                }
            }
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida");
                System.out.println(menu);
            }
            opcao = sc.nextInt();
            }
        }

    }