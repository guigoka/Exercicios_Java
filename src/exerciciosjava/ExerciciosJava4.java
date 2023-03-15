package exerciciosjava;

import java.util.Scanner;

public class ExerciciosJava4 {
    
    /*
     * 4. Tendo como dados de entrada a altura (h) e o sexo de uma pessoa (um caracter m ou f),
     * construir um programa que calcula seu peso ideal, utilizando as seguintes fórmulas:
     * Para homens: (72.7*h) - 58
     * Para mulheres: (62.1*h) - 44.7 
     */

    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
    
        // Ler a altura e o sexo da pessoa
        System.out.println("Digite sua altura em metros: ");
        double altura = sc.nextDouble();
        System.out.println("Digite seu sexo (m ou f): ");
        String sexo = sc.next();
    
        // Verificar o sexo da pessoa e calcular o peso ideal
        double pesoIdeal;
        if (sexo.equals("m")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equals("f")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Sexo inválido. Digite m para masculino ou f para feminino.");
            pesoIdeal = 0;
        }
    
        // Imprimir o resultado com printf
        if (pesoIdeal > 0) {
            System.out.printf("Seu peso ideal é %.2f kg.", pesoIdeal);
        }
    }
}
