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
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo na Conta: " + saldoConta);
        System.out.println("----------------------------");

        String menu = """
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        System.out.println(menu);
        int opcao = sc.nextInt();

        while (opcao != 4){
            if (opcao == 1) {
                System.out.printf("Saldo atualizado: R$ %.2f\n", saldoConta);
            }
            if (opcao == 2) {
                System.out.println("Digite um valor a depositar: ");
                double valorDepositar = sc.nextDouble();
                saldoConta = valorDepositar + saldoConta;
                System.out.println("Valor depositado.");
            }
            if (opcao == 3) {
                System.out.println("Digite um valor a transferir: ");
                double valorTransferir = sc.nextDouble();
                if (valorTransferir > saldoConta) {
                    System.out.println("Valor insuficiente!");
                    System.out.println("Digite umas das opções novamente");
            } else {
                    saldoConta = saldoConta - valorTransferir;
                    System.out.println("Valor Transferido!!");
                }
            }
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida");
            }
            opcao = sc.nextInt();
            }
        }

    }