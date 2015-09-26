/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannull;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta clase escanea en busca de atributos nulls de un objeto cualquiera 
 * y retorna una lista de los campos que nulos con su posicion y nombre
 * esto para validar campos nulos
 * @author Ricardo Laredo
 */
public class ScanNullField {
    public static List<String> scanFieldObjet(Object o){
        Field fields[]=o.getClass().getDeclaredFields();
        List<String> result=new ArrayList<>();
        for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);
            try {
                if(field.get(o)==null){
                     String f=(i+1)+"#"+field.getName();
                    result.add(f);
                }
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(ScanNullField.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    return result;
    }
    
}
