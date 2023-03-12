package exerciciosjava;

import java.util.Scanner;

public class ExerciciosJava3 {

    /*
     * 3. Ler um número e verificar se ele é par ou ímpar.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }

        sc.close();
    }
}
