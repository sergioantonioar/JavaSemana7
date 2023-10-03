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
public class E01sesion14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "", apellido = "";
        double sueldo=0, total=0;
        int opcion = 0;
        boolean validaUsuario = false, validaSueldo = false;
        String menu = """
                       #################################
                       #        MENU DE OPCIONES       #
                       #################################
                       # 1. Ingresar Empleado          #
                       # 2. Ingresar Salario Mensual   #
                       # 3. Emitir Boleta              #
                       # 4. Salir                      #
                       #################################
                """;
        do {
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese nombre: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido");
                    apellido = sc.nextLine();
                    validaUsuario = true;
                }
                case 2 -> {
                    if (validaUsuario) {
                        System.out.println("Ingrese el sueldo: ");
                        sueldo=sc.nextDouble();
                        total=sueldo*12;
                        validaSueldo = true;
                    }else{
                        System.out.println("Antes debe ingresar nombres");
                    }
                }
                case 3 -> {
                    if (validaSueldo == true && validaUsuario == true) {
                        System.out.printf("""
                        *******************************************
                        * RESUMEN DE BOLETAS DE PAGO              *
                        *******************************************
                        * Nombre del Empleado: %s                 
                        * Apellidos del Empleado: %s              
                        * Tipo: Contratado                        
                        * Salario Ene: %s    Salario Feb: %s      
                        * Salario Mar: %s    Salario Abr: %s      
                        * Salario May: %s    Salario Jun: %s      
                        * Salario Jul: %s    Salario Ago: %s      
                        * Salario Set: %s    Salario Oct: %s      
                        * Salario Nov: %s    Salario Dic: %s      
                        *******************************************
                        * Total: %s                               
                        *******************************************
                        """, nombre, apellido, sueldo,sueldo,sueldo,sueldo,sueldo,sueldo,sueldo,sueldo,sueldo,sueldo,sueldo,sueldo, total);
                    } else {
                        System.out.println("Ingrese usuario y sueldo ");
                    }
                }
                default -> {
                    System.out.println("Valor fuera de rango");
                }
            }
        }while(opcion!=4);
        if (opcion==4) {
            System.out.println("Programa finalizado");
        }
    }
}

