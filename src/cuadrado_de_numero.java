

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alum.fial7
 */
public class cuadrado_de_numero {
    public static void main(String[] args) {
        int num, cuadrado;
        // num guarda el valor ingresado por teclado
        // cuadrado guarda el valor de potencia del numero
        
       Scanner teclado= new Scanner ( System.in);
        System.out.print("ingresa un numero: ");
        num=teclado.nextInt();
        
        // proceso 
        while(num>=0)
        {
        cuadrado= num*num;
            System.out.println(num+"  al cuadrado es igual a "+ cuadrado);
            System.out.println("--------------------------------------------");
            System.out.print("introduzca otro numero: ");
            num=teclado.nextInt();

        }
    }
    
}
