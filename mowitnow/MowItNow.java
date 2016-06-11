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
public class MowItNow {
    
    private Cesped cesped;
    private CortaCesped cortacesped;

    public MowItNow(Cesped cesped, CortaCesped cortacesped) {
        this.cesped = cesped;
        this.cortacesped = cortacesped;
    }

    public Cesped getCesped() {
        return cesped;
    }

    public void setCesped(Cesped cesped) {
        this.cesped = cesped;
    }

    public CortaCesped getCortacesped() {
        return cortacesped;
    }

    public void setCortacesped(CortaCesped cortacesped) {
        this.cortacesped = cortacesped;
    }
    
}
