/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.EjerciciosDo_While;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1, n;
        System.out.println("Ingrese un número entero positivo:");
        n = sc.nextInt();
        System.out.println("Los " + n + " primeros numeros enteros postivos son:");
        if (n > 0) {
            do {
                System.out.println(x);
                x++;
            } while (x >= 1 && x <= n);
        }else{
            System.out.println("***ERROR: Ingrese un numero entero postivo");
        }
    }
}
