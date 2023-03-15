package exerciciosjava;

import java.util.Scanner;

public class ExerciciosJava7 {
    
    /*
     * 
     * 7. Fazer um programa que calcula e mostra a área de um triângulo, sabendo que:
     * área = (base * altura) / 2.
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é: %.2f", area);
    }
}
