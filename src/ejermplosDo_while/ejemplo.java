/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejermplosDo_while;

import java.util.Scanner;

/**
 *
 * @author Sergio Ariza
 */
public class ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Ingrese un numero, 0 para terminar: ");
            n=sc.nextInt();
        }while(n!=0);
        
        System.out.println("Sigue el algoritmo");
    }
}
