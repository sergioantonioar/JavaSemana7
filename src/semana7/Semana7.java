/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana7;

import java.util.Scanner;

/**
 *Escribir un programa en Java que
halle la suma de los dígitos de un
número ingresado por el usuario.
 * @author Sergio Ariza
 */
public class Semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1000 y 9999:");
        n = sc.nextInt();
//        sc.nextLine();
        
        if(n>= 1000 && n <=9999){
            while(n>0){
                suma += (n%10);
                n /= 10;
            }
            System.out.println("Suma de los digitos: "+suma);
        }else{
            System.out.println("Valor fuera de rango!");
        }
    }
    
}
