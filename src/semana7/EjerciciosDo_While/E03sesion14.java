/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.EjerciciosDo_While;

import java.util.Scanner;

/**
 * Escribir un programa que solicite un número “n” y muestre en pantalla los
 * valores 1 y 0 dispuestos como se muestra en el ejemplo.
 *
 * @author sergio
 */
public class E03sesion14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        
        int i = 1;
        do {
            int j = 1;
            do {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                j++;
            } while (j <= i);
            
            System.out.println();
            i++;
        } while (i <= n);
    }
}
