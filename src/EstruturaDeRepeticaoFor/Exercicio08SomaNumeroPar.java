package EstruturaDeRepeticaoFor;

public class Exercicio08SomaNumeroPar {
    public static void main(String[] args) {

        int resultado = 0;

        for (int i = 2; i <= 20; i+=2) {
            resultado += i;
            //System.out.println(i);
        }
        System.out.println("A soma dos números pares é: " + resultado);
    }
}
