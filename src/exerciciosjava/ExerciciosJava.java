/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava;

/**
 *
 * @author guinxB
 */
public class ExerciciosJava {

    /*
     * 1. Sabendo que A=3, B=7 e C=4, informe se as expressões abaixo são
     * verdadeiras ou falsas.
     * a) (A+C) > B ( )
     * b) B >= (A + 2) ( )
     * c) C == (B –A) ( )
     * d) (B + A) <= C ( )
     * e) (C+A) > B ( )
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int A = 3;
        int B = 7;
        int C = 4;

        // a)
        System.out.println((A + C) > B);
        // 3 + 4 = 7, 7 é maior que 7? não

        // b)
        System.out.println(B >= (A + 2));
        // 3 + 2 = 5, 7 é maior ou igual a 5? sim

        // c)
        System.out.println(C == (B - A));
        // 7 - 3 = 4, 4 é igual a 4? sim

        // d)
        System.out.println((B + A) <= C);
        // 7 + 3 = 10, 10 é menor ou = 4? não

        // e)
        System.out.println((C + A) > B);
        // 4 + 3 = 7, 7 é maior que 7? = não

    }
    
}
