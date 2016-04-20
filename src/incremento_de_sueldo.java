
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
public class incremento_de_sueldo 
{
    public static void main(String[] args)
    {
     double sueldo, sueldo_final=0,incremento;
     int años_trabajo;
     
     Scanner br= new Scanner (System.in);
        System.out.print("ingresa el sueldo del trabajador: ");
        sueldo=br.nextDouble();
        System.out.print("ingresa los años de trabajo: ");
        años_trabajo=br.nextInt();
        
        while(sueldo>0)
        {
            if (sueldo>=10000 || años_trabajo >=10 )
            {
                if(sueldo<10000 && años_trabajo >=10)
                {
                    incremento=sueldo*0.10;
                sueldo_final=sueldo+ incremento;
                System.out.println("el incremento de sueldo es de:"+incremento);
                System.out.println("el sueldo final es: "+ sueldo_final);
                }
                else
                {
                    incremento=sueldo*0.05;
                sueldo_final= sueldo+incremento;
                System.out.println("el incremento de sueldo es de:"+incremento);
                System.out.println("B...el sueldo final es: "+ sueldo_final);
                }
                
                
            }
            else if (sueldo>=5000 || años_trabajo >=5 )
            {
                incremento=sueldo*0.025;
                sueldo_final= sueldo+incremento;
                System.out.println("el incremento de sueldo es de:"+incremento);
                System.out.println("el sueldo final es: "+ sueldo_final);
            }
               else
            {
                sueldo_final= sueldo;
                System.out.println("no hay incremento de sueldo");
                System.out.println("el sueldo final es: "+ sueldo_final);
            }
            System.out.println("-----------------------------------------------");
             System.out.print("ingresa el sueldo del siguiente trabajador: ");
        sueldo=br.nextDouble();
        System.out.print("ingresa los años de trabajo: ");
        años_trabajo=br.nextInt();
        }
     
    }
}
