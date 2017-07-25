/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wsleam
 * 19/julio/2017
 */
public class Vehiculo {
    //atributos
    
    static private String marca, color, Tip_motor, caja;
    static private int modelo;
    
    // metodos publicos para atributos
    
    public String getMarca()
    {
        return marca;
    }
    
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
        this.color=color;
    }
    
    public String getTip_Motor()
    {
        return Tip_motor;
        
    }
    
    public void setTip_Motor(String Tip_motor)
    {
        this.Tip_motor=Tip_motor;
    }
    
    public String getCaja()
    {
        return caja;
    }
    
    public void setCaja(String caja)
    {
        this.caja=caja;
    }
    
    public int getModelo()
    {
        return modelo;
    }
    
    public void setModelo(int modelo)
    {
        this.modelo=modelo;
    }
    
    //constructores
    
    public Vehiculo()
    {
        this.marca="";
        this.color="";
        this.Tip_motor="";
        this.caja="";
        this.modelo=0;
        
        
    }
    
    
    public Vehiculo(String marca, String color, String Tip_motor, String caja , int modelo)
    {
        this.marca=marca;
        this.color=color;
        this.Tip_motor=Tip_motor;
        this.caja=caja;
        this.modelo=modelo;
    }
    
}
