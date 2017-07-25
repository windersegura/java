/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wsleam
 * fecha: 20/julio/2017
 */
public class Monedero {
    
    static private int monto;
    //metodo que devuelve el monto en la cuenta
    public int getMonedero()
    {
        return monto;
    }
    
    //metodo que realiza un deposito
    public void setMonto(int monto)
    {
        
        this.monto+=monto;
    }
    //metodo que realiza un retiro
    public void setRetiro()
    {
        if (this.monto>0){
        this.monto-=monto;
        }
        
        else{
            System.out.println("No dispone de efectivo.");
        }
    }
    
    //constructor del monedero inicia con una cantidad
    public Monedero()
    {
        this.monto=1000;
    }
    
    
    
    
    
}
