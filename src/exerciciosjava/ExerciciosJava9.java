package exerciciosjava;

import java.util.Scanner;

public class ExerciciosJava9 {

    /*
     * 
     * 9. Fazer um programa que recebe um número positivo, calcula e mostra:
     * a) O número digitado ao quadrado;
     * b) O número digitado ao cubo;
     * c) A raiz quadrada do número digitado.
     * 
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número positivo inteiro: ");
        int numero = sc.nextInt();

        // o número ao quadrado que multiplica ele por ele mesmo
        double quadrado = numero * numero;
        System.out.println("O número: " + numero + " ao quadrado é: " + quadrado);

        // o número ao cubo é ele multiplicado por ele mesmo 3 vezes
        double cubo = numero * numero * numero;
        System.out.println("O número: " + numero + " ao cubo é: " + cubo);

        // a raiz quadrada do número usando uma função do java que faz o calculo
        double raiz = Math.sqrt(numero);
        System.out.println("A raiz quadrada do número: " + numero + " é: " + raiz);
    }
}
