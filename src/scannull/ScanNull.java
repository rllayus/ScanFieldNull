/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannull;

import java.util.List;

/**
 *
 * @author Ricardo Laredo
 */
public class ScanNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Objeto o=new Objeto();
        o.setBooleano(true);
        o.setDoble(1.3);
        System.out.println(""+o.getNumero());
        System.out.println(""+o.isBooleano());
        System.out.println(""+o.getCadena());
        System.out.println(""+o.getDate());
        System.out.println(""+o.getDoble());
        
        List<String> lista=ScanNullField.scanFieldObjet(o);
        for (String str : lista) {
            System.out.println(str);
        }
    }
    
}
