/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mowitnow;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author igor
 */
public class App {
    
    public static void main(String[] args) throws IOException, NullPointerException{
        Fichero fitch = new Fichero("/cesped");
        List<MowItNow> lista_cortaCesped = fitch.leeFichero();
        Logica logica = new Logica();
        
        for(MowItNow temp : lista_cortaCesped){
            logica.calculaPosFinal(temp);
            logica.muestraDatos(temp);
            System.out.println("");
        }
                
    }
    
    
}
