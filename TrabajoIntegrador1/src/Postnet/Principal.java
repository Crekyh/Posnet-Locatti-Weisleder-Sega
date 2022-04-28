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
public class Principal {
    
    
    
    public static void main(String [] args){
        Posnet posnet = new Posnet();
        Persona titular = new Persona("234235325","Pepe","Pippe","1561561651","pepepippe@yahoo.com");
        TarjetaDeCredito tarjetadeCredito = new TarjetaDeCredito("BBVA", "5555", 15000, EntidadFinanciera.VISA, titular);
        System.out.println(titular);
        System.out.println(tarjetadeCredito);
        
        Ticket ticket = Posnet.efectuarPago(tarjetadeCredito, 10000, 5);
        
    }
    }

