/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

/**
 *
 * @author Edison Barreiro
 */

import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        String sueldo_string = new String();
        
        if (args.length == 0)
        {
            System.out.print("Sueldo: ");
            sueldo_string = sn.next();
        }
        else 
        {
            sueldo_string = args[0];
        }
        
        while (!sueldo_string.matches("[+]?[0-9]*\\.?[0-9]+"))
        {
            System.out.println("Formato de sueldo incorrecto, debe ingresar un número entero o decimal positivo (decimal con punto)");
            System.out.print("Sueldo: ");        
            sueldo_string = sn.next();
        }
        
        float sueldo = Float.parseFloat(sueldo_string);
        
        String op_string = new String();
        
        do {
            System.out.println("1.- 13er sueldo");
            System.out.println("2.- 14to sueldo");
            System.out.println("3.- Aporte patronal");
            System.out.println("4.- Aporte personal");
            System.out.println("5.- Consultar sueldo");
            System.out.println("6.- Modificar sueldo");
            System.out.println("7.- Salir");
            System.out.print("Seleccionar opcion: ");
            op_string = sn.next();

            while (!op_string.matches("[+]?[1-7]"))
            {
                System.out.println("Opcion incorrecta");
                System.out.println("1.- 13er sueldo");
                System.out.println("2.- 14avo sueldo");
                System.out.println("3.- Aporte patronal");
                System.out.println("4.- Aporte personal");
                System.out.println("5.- Consultar sueldo");
                System.out.println("6.- Modificar sueldo");
                System.out.println("7.- Salir");
                System.out.print("Seleccionar opcion: ");        
                op_string = sn.next();
            }
            
            if (op_string.equals("1"))
            {
                System.out.println("13er sueldo: " + (sueldo / 12));
            }
            else if (op_string.equals("2"))
            {
                System.out.println("14avo sueldo: " + (318 / 12));
            }
            else if (op_string.equals("3"))
            {
                System.out.println("Aporte Personal: " + (sueldo * 0.0935));
            }
            else if (op_string.equals("4"))
            {
                System.out.println("Aporte Patronal: " + (sueldo * 0.1125));
            }
            else if (op_string.equals("5"))
            {
                System.out.println("Sueldo: " + sueldo);
            }
            else if (op_string.equals("6"))
            {
                System.out.print("Ingrese nuevo sueldo: ");
                sueldo_string = sn.next();
                
                while (!sueldo_string.matches("[+]?[0-9]*\\.?[0-9]+"))
                {
                    System.out.println("Formato de sueldo incorrecto, debe ingresar un número entero o decimal positivo (decimal con punto)");
                    System.out.print("Sueldo: ");        
                    sueldo_string = sn.next();
                }
                sueldo = Float.parseFloat(sueldo_string);
            }
                    
        } while (!op_string.equals("7"));
    }
}
