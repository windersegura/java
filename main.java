/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author wsleam
 */
public class main {
    public static void main (String [] args){
        Scanner entrada=new Scanner(System.in);
        int monto=0;//monto a pasar
        Monedero dinero=new Monedero(); //objeto monedero con constructor
        System.out.println("Biemvenido a su monedero financiero!!");
        System.out.println("Ingrese un monto");
        
        monto=entrada.nextInt();
        
       dinero.setMonto(monto);
       System.out.println("Su monto total es de " + dinero.getMonedero());
       
    }
    
}
