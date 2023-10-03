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
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de N: ");
        int N = sc.nextInt();
        
        double resultado = 0;
        int i = 1;
        boolean signo = true;
        
        do{
            if(signo){
                resultado += 1.0/i;
            }else{
                resultado -= 1.0/i;
            }
            
            signo = !signo;
            i++;
        }while(i<=N);
        System.out.println("El valor de la serie con "+N+" terminos es: "+resultado);
    }
}
