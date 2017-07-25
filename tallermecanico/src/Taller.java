/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wsleam
 * 
 * 
 * 
 */
import java.util.Scanner;


public class Taller {
    public static void main (String[] args)
    {
        System.out.println("Control de registro de un taller mecanico.");
        Scanner entrada=new Scanner(System.in);
        String marca_v="";
        String color_v="";
        String motor_v="";
        String caja_v="";
        int modelo_v=0;
        
        
        System.out.println("Ingrese la marca del vehiculo: ");
        marca_v=entrada.nextLine();
        
         System.out.println("Ingrese el color del vehiculo: ");
        color_v=entrada.nextLine();
        
         System.out.println("Ingrese el tipo de motor del vehiculo: ");
        motor_v=entrada.nextLine();
        
         System.out.println("Ingrese el tipo de transmision del vehiculo: ");
        caja_v=entrada.nextLine();
        
         System.out.println("Ingrese el modelo del vehiculo: ");
        modelo_v=entrada.nextInt();
       
        Vehiculo carrito1 = new Vehiculo(marca_v,color_v,motor_v,caja_v,modelo_v);
        
        System.out.println("La marca del vehiculo es: "+ carrito1.getMarca());
    }
    
    
}
