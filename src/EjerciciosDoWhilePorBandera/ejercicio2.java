/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDoWhilePorBandera;

import java.util.Scanner;

/**
 * Realizar un programa que lea dos notas (PC1 y PC2) de ciertos alumnos y
 * calcular e imprimir el promedio. El programa debe preguntar si desea
 * continuar con el ingreso de notas (Desea continuar s/n?). Al finalizar debe
 * mostrar el mensaje “Fin de registro de notas”
 *
 * @author Sergio Ariza
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Object a;
        int i = 1;

        do {
            System.out.println("Ingrese la nota PC1 del alumno "+i+" : ");
            int pc1 = sc.nextInt();

            System.out.println("Ingrese la nota PC2 del alumno "+i+" : ");
            int pc2 = sc.nextInt();

            int promedio = (pc1 + pc2) / 2;

            System.out.println("Promedio del alumno "+i+" : " + promedio);

            System.out.println("Desea continuar ingresando notas? (s/n): ");
            a = sc.next();
            i++;
        } while("s".equals(a));

        System.out.println("Fin de registro de notas");
    }
}