package exerciciosjava;

import java.util.Scanner;

public class ExerciciosJava5 {

    /*
     *
     * 5.Fazer um programa que recebe três números inteiros, calcula e mostra a soma desses números.
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Aqui o sistema vai pedir e armazenar os dados
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        // Calcular a soma dos 3 números
        int calc = num1 + num2 + num3;

        // Imprimir na tela a soma dos números
        System.out.println("A soma dos 3 números é: " + calc);
    }
}
