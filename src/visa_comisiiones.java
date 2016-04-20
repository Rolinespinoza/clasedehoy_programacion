
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
public class visa_comisiiones {
    public static void main(String[] args) {
        double compra;
        double pagfinal;
        Scanner br =  new Scanner ( System.in);
        System.out.print("ingresa la compra del cliente: ");
        compra=br.nextDouble();
        // proceso 
        while (compra>0)
        {
        if (compra<=1000)
        {
            pagfinal=compra;
            System.out.print("el pago final que debe hacer el cliente es: "+pagfinal);

        }
        else if (compra> 1000 && compra<=5000)
        {
            pagfinal=compra+(compra*0.05);
            System.out.println("");
            System.out.print("el pago final que debe hacer el cliente es: "+pagfinal);

        }
        else if (compra > 5000 )
        {
            pagfinal=compra+(compra*0.10);
            System.out.println("");
            System.out.print("el pago final que debe hacer el cliente es: "+pagfinal);

        }
        System.out.print("ingresa la compra del cliente: ");
        compra=br.nextDouble();
        }
        System.out.println("ingresaste un valor equivocado");
        System.out.print("ingresa la compra del cliente: ");
        compra=br.nextDouble();
    }
}
