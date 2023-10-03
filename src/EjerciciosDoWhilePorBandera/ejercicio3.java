/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDoWhilePorBandera;

import java.util.Scanner;

/**
 * En el ejercicio anterior, calcule el número de alumnos cuyas notas fueron
 * ingresadas; calcule también el promedio del aula.
 *
 * @author Sergio Ariza
 */
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Object a;
        int i = 0;
        float suma = 0;

        do {
            i++;
            System.out.println("Ingrese la nota PC1 del alumno "+i+" : ");
            int pc1 = sc.nextInt();

            System.out.println("Ingrese la nota PC2 del alumno "+i+" : ");
            int pc2 = sc.nextInt();

            float promedio = (pc1 + pc2) / 2;
            suma += promedio;

            System.out.println("Promedio del alumno "+i+" : " + promedio);

            System.out.println("Desea continuar ingresando notas? (s/n): ");
            a = sc.next();
        } while("s".equals(a));
        
        System.out.println("El número de alumnos cuyas notas fueron ingresadas: "+i);
        
        float promediofinal = suma/i;
        System.out.println("El promedio total del salón es: " + promediofinal);
        System.out.println("------ Fin de registro de notas ------");
    }

}
