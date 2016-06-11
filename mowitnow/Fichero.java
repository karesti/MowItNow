/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mowitnow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igor
 */
public class Fichero {
    
    private String _path;

    public Fichero(String path) {
        this._path = path;
    }
    
    
    public List<MowItNow> leeFichero() throws IOException
    {
        List<MowItNow> lista_cortaCesped = new ArrayList<>();
        MowItNow mowItNow;
        Cesped cesped;
        CortaCesped cortacesped;
        String line;
        String[] dato_pos_tam;
        
        try (BufferedReader fichero = new BufferedReader(new FileReader(_path))) {
            // Primera linea es el cesped, común para todos los cortacesped
            line = fichero.readLine();
            dato_pos_tam = line.split(" ");
            cesped = new Cesped(Integer.parseInt(dato_pos_tam[0]), Integer.parseInt(dato_pos_tam[1]));
            while ((line = fichero.readLine()) != null) {
                // Se lee posicion y orentacion cortacesped
                dato_pos_tam = line.split(" ");
                // Se lee las ordenes
                line = fichero.readLine();
                cortacesped = new CortaCesped(Integer.parseInt(dato_pos_tam[0]), Integer.parseInt(dato_pos_tam[1]), dato_pos_tam[2].charAt(0),line);
                // Secrea el objeto Cesped + CortaCesped
                mowItNow= new MowItNow(cesped,cortacesped);
                // Se añade el objeto a la lista
                lista_cortaCesped.add(mowItNow);
            }       
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        
        return lista_cortaCesped;
    }
  
    
    
    
    
}
