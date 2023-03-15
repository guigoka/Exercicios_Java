package exerciciosjava;

import java.util.Scanner;

public class ExerciciosJava10 {
    
    /*
     * 
     * 10. Fazer um programa que recebe o preço de um produto, calcula e mostra o novo preço sabendo-se que este sofreu um desconto de 10%.
     * 
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$");
        double preco = sc.nextDouble();

        double desconto = (preco * 10) / 100;

        double precodesconto = preco - desconto;

        System.out.printf("o valor do produto com desconto é: R$%.2f", precodesconto);
        System.out.println("");
        System.out.printf("O desconto foi de R$"+ desconto);
    }
}
