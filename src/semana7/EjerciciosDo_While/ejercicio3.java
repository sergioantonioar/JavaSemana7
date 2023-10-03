/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.EjerciciosDo_While;

import java.util.Scanner;

/**
 * 
 *
 * @author Sergio
 */
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spar = 0;
        int simpar = 0;
        int i = 1;
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.print("Los primeros " + n + " números enteros positivos son: ");
        if (n > 0) {
            do {
                System.out.print(i + " ");

                if (i % 2 == 0) {
                    spar += i;
                } else {
                    simpar += i;
                }
                i++;
            } while (i <= n);

            System.out.println("\nLa suma de los números pares es: " + spar);
            System.out.println("La suma de los números impares es: " + simpar);
        } else {
            System.out.println("**ERROR: Ingresar un número entero positivo.");
        }
    }
}
