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
public class TarjetaDeCredito {
    
    public String nombreCompleto.nombreCompleto(){
        return titular.getNombre()+titular.getApellido();
    }
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaDeCredito(String entidadBancaria, String numeroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numeroTarjeta=" + numeroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

    public boolean tieneSaldoDisponible(double montoFinal) {
        

        return saldo >= montoFinal;
    }

    void descontar(double montoFinal) {
        
        saldo -= montoFinal;
    
    }

    String nombreCompleto = tajetaCredito.getNombreCompleto();
    double montoPorCuotas = .montoFinal/cantCuotas;
    Ticket = new (nombreCompleto, montoFinal,montoPorCuotas);
    return ticket
    }

    
}
