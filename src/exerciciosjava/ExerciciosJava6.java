package exerciciosjava;

import java.util.Scanner;

public class ExerciciosJava6 {

    /*
     * 
     * 6. Fazer um programa que recebe três notas, calcula e mostra a média aritmética dessas notas.
     * 
     */
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Recebendo as 3 notas
        System.out.print("Digite a nota da A1: ");
        double a1 = sc.nextDouble();
        System.out.print("Digite a nota da A2: ");
        double a2 = sc.nextDouble();
        System.out.print("Digite a nota da A3: ");
        double a3 = sc.nextDouble();
        
        // Soma as 3 notas
        double media = (a1 + a2 + a3) / 3;

        // Aqui foi usado um printf para formatar para 2 casas decimais e o calculo da média final que foi dividido por 3 e o status de aprovado ou reprovado
        double status;
        if (media >= 7) {
            System.out.println("APROVADO!");
            System.out.printf("A sua média final é: %.2f", media);
        } 
        else{
            System.out.println("REPROVADO!");
            System.out.printf("A sua média final é: %.2f", media);
        }


        //System.out.printf("A sua média final é: %.2f", media);

     }

}
