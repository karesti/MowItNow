/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mowitnow;

/**
 *
 * @author igor
 */
public class Logica {
    
    
    public void muestraDatos(MowItNow cortaCesped)
    {
        System.out.println("Tam: "+cortaCesped.getCesped().getX()+" "
                + cortaCesped.getCesped().getY());
        System.out.println("Pos y orientacion: "+cortaCesped.getCortacesped().getX()+" "
                + cortaCesped.getCortacesped().getY() +" "+ cortaCesped.getCortacesped().getOrientation());
        System.out.println("Ordenes: "+cortaCesped.getCortacesped().getOrdenes());
    }
    
    public void calculaPosFinal(MowItNow cortaCesped){
        
        char[] ordenes = cortaCesped.getCortacesped().getOrdenes().toUpperCase().toCharArray();
        
        for(char temp: ordenes){
            switch (temp){
                case('A'):
                    if(cortaCesped.getCortacesped().getOrientation() == 'E'
                            && cortaCesped.getCortacesped().getX()+1 <= cortaCesped.getCesped().getX())
                        cortaCesped.getCortacesped().setX(cortaCesped.getCortacesped().getX()+1);
                    else if(cortaCesped.getCortacesped().getOrientation() == 'W'
                            && cortaCesped.getCortacesped().getX()-1 >= 0)
                        cortaCesped.getCortacesped().setX(cortaCesped.getCortacesped().getX()-1);
                    else if(cortaCesped.getCortacesped().getOrientation() == 'N'
                            && cortaCesped.getCortacesped().getY()+1 <= cortaCesped.getCesped().getY())
                        cortaCesped.getCortacesped().setY(cortaCesped.getCortacesped().getY()+1);
                    else if(cortaCesped.getCortacesped().getOrientation() == 'S'
                            && cortaCesped.getCortacesped().getY()-1 >= 0)
                        cortaCesped.getCortacesped().setY(cortaCesped.getCortacesped().getY()-1);
                    break;
                                      
                case('R'):
                    if(cortaCesped.getCortacesped().getOrientation()=='W')
                        cortaCesped.getCortacesped().setOrientation('N');
                    else if(cortaCesped.getCortacesped().getOrientation()=='N')
                        cortaCesped.getCortacesped().setOrientation('E');
                    else if(cortaCesped.getCortacesped().getOrientation()=='E')
                        cortaCesped.getCortacesped().setOrientation('S');
                    else if(cortaCesped.getCortacesped().getOrientation()=='S')
                        cortaCesped.getCortacesped().setOrientation('W');
                    break;
                    
                case('L'):
                    if(cortaCesped.getCortacesped().getOrientation()=='W')
                        cortaCesped.getCortacesped().setOrientation('S');
                    else if(cortaCesped.getCortacesped().getOrientation()=='S')
                        cortaCesped.getCortacesped().setOrientation('E');
                    else if(cortaCesped.getCortacesped().getOrientation()=='E')
                        cortaCesped.getCortacesped().setOrientation('N');
                    else if(cortaCesped.getCortacesped().getOrientation()=='N')
                        cortaCesped.getCortacesped().setOrientation('W');
                    break;
                default:
                    break;
            }
           
        }
        
    }
    
}
