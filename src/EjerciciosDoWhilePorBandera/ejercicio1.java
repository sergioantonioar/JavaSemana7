/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDoWhilePorBandera;

import java.util.Scanner;

/**
 *
 * @author Sergio Ariza
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;
        
        do {
            System.out.println("Ingrese un número, 0 para terminar: ");
            n = sc.nextInt();
            suma += n;
        } while (n != 0);
        
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
