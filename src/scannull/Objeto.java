/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannull;

import java.util.Date;

/**
 *
 * @author Ricardo Laredo
 */
public class Objeto {
    private int numero;
    private boolean  booleano;
    private String cadena;
    private double doble;
    private Date date;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isBooleano() {
        return booleano;
    }

    public void setBooleano(boolean booleano) {
        this.booleano = booleano;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public double getDoble() {
        return doble;
    }

    public void setDoble(double doble) {
        this.doble = doble;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
