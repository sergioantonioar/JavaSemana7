/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.EjerciciosDo_While;

import java.util.Scanner;

/**
 * Crear un programa en Java para convertir un numero de base decimal a binario
 *
 * @author sergio
 */
public class E02sesion14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        
        String rpta;
        do {
            String c = "";
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
            while (n != 0) {
                r = n % 2;
                c = r + c;
                n /= 2;
            }
            System.out.println("El binario es: " + c);

            sc.nextLine();

            System.out.println("Desea continuar (s/n): ");
            rpta = sc.nextLine();
        } while (rpta.equals("s"));

    }
}
