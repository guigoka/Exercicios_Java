/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava;

/**
 *
 * @author guinxB
 */
public class ExerciciosJava2 {

    /*
     * 2. Sabendo que A=5, B=4, C=3 e D=6, informe se as expressões abaixo são
     * verdadeiras ou falsas.
     * a) (A > C) && (C <= D) ( )
     * b) (A+B) > 10 || (A+B) == (C+D) ( )
     * c) (A>=C) && (D >= C) ( )
     */

    public static void main(String[] args) {
        int A = 5;
        int B = 4;
        int C = 3;
        int D = 6;

        // a)
        System.out.println((A > C) && (C <= D));
        // 5 maior que 3? sim e 3 é menor ou igual a 6? sim

        // b)
        System.out.println((A + B) > 10 || (A + B) == (C + D));
        // 5 + 4 = 9, 9 é maior que 10? não e 5 + 4 = 9 é igual a 3 + 6 = 9? sim

        // c)
        System.out.println((A >= C) && (D >= C));
        // 5 maior ou igual a 3? sim e 6 maior ou igual a 3? sim

    }
}
