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

public class Tema1 {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
       
        System.out.print("Ingrese número de iteraciones: ");        
        String string_itrNumber = sn.next();
        
        //itrNumber.matches("[-+]?[0-9]*\\.?[0-9]+")
        
        while (!string_itrNumber.matches("[+]?[1-9]"))
        {
            System.out.println("Formato incorrecto, debe ingresar un número mayor que 0");
            System.out.print("Ingrese número de iteraciones: ");        
            string_itrNumber = sn.next();
        }
        
        int itrNumber = Integer.parseInt(string_itrNumber);
        int max = 0;
        
        for (int i = 0; i < itrNumber; i++) 
            {
                System.out.print("Ingrese número " + (i + 1) + ":");
                String string_num = sn.next();
                
                while (!string_num.matches("[-+]?[0-9]"))
                {
                    System.out.println("Formato incorrecto, debe ingresar un número entero");
                    System.out.print("Ingrese número: ");        
                    string_num = sn.next();
                }
                
                int num = Integer.parseInt(string_num);
                if (i == 0)
                    max = num;
                else 
                    if (num > max)
                        max = num;
            }
        System.out.println("La cantidad de iteraciones es: " + itrNumber);
        System.out.println("El número mayor ingresado es: " + max);
    }
}
    
