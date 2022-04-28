/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postnet;

/**
 *
 * @author info6
 */
public class Posnet {
    
    public static final double RECARGO_POR_CUOTA = 0.03;
    
    
     public static final int MIN_CANT_CUOTA = 1;
     
     public static final int MAX_CANT_CUOTA = 6;

    public Ticket efectuarPago(TarjetaDeCredito tarjetadeCredito,double montoAbonar, int cantCuotas) {
        
        Ticket ticket = null;
    
   
    if(validarDatos(tarjetadeCredito, montoAbonar, cantCuotas)){
        
        double montoFinal = montoAbonar + recargoPorCuotas(cantCuotas) * montoAbonar;
        if (tarjetadeCredito.tieneSaldoDisponible(montoFinal)){
            tarjetadeCredito.descontar(montoFinal);
            
            
            
            
        }
    }
    
    
     return ticket;
}
    private boolean validarDatos (TarjetaDeCredito tarjetaCredito, double montoAbonar, int cantCuotas){
        boolean isTarjetaValida = false;
        boolean ismontoAbonar = false;
        boolean isCantCuotas = false;
        
        
        if (tarjetaCredito != null ){
            isTarjetaValida=true;
        }
         
        
        if(montoAbonar >= 0){
            ismontoAbonar=true;
        }
        
        if(cantCuotas >= MIN_CANT_CUOTA && cantCuotas <= MAX_CANT_CUOTA){
            isCantCuotas=true;
        }
                
        return  isTarjetaValida && ismontoAbonar && isCantCuotas;
        
        
    }    

    private double recargoPorCuotas(int cantCuotas) {
        
        return (cantCuotas-1)* RECARGO_POR_CUOTA;
    }

    
        
    
    
    
    
}
     
     
     
 
