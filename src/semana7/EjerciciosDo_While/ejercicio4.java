/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.EjerciciosDo_While;

import java.util.Scanner;

/**
 *Imprimir y calcular la suma de los números comprendidos
entre N1 y N2, incluyendo N1 y N2 (siendo N1<= N2)
 * @author Sergio Ariza
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int n2 = sc.nextInt();
        
        int suma = 0;
        int i = n1;
        
        if(n1>=0 && n2>=0){
            System.out.print("Los numeros entre "+n1+" y "+n2+" son: ");
        do{
            suma += i;
            System.out.print(i+" ");
            i++;
        }while(i<=n2);
        System.out.println("\nLa suma de numeros entre "+n1+" y "+n2+" es: "+suma);
        }else{
            System.out.println("**ERROR: Los numeros deben ser entero positivo (n>0)");
        }
    }
}
