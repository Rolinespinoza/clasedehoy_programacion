
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
public class herencia_del_padre {
    public static void main(String[] args) {
        double fortuna;
        int h1, h2;
        double fh1=0, fh2;
        Scanner br =  new Scanner ( System.in);
         System.out.print("ingresa la fortuna del padre: ");
        fortuna=br.nextDouble();
         System.out.print("ingresa la cantidad de hijos del primer hijo: ");
        h1=br.nextInt();
         System.out.print("ingresa la cantidad de hijos del segundo hijo: ");
        h2=br.nextInt();        
       // proceso 
        if(h1>h2)
        {
            fh1= fortuna*0.70;
            fh2=fortuna*0.30;
            System.out.println("la herencia del primer hijo es :"+fh1);
            System.out.println("la herencia del primer hijo es :"+fh2);

        }
        else
        {
            fh1= fortuna*0.30;
            fh2=fortuna*0.70;
            System.out.println("la herencia del primer hijo es :"+fh1);
            System.out.println("la herencia del primer hijo es :"+fh2);

        }
    }
}
