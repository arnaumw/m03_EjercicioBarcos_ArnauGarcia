/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author arnaugarciaalvarez
 */
public class Velero extends BarcoDePasajeros {
    
    private int velas;

    public Velero(int velas, Motor motor, double eslora, double manga, int nudos, int peso, int camarotes, int pasajeros) {
        super(motor, eslora, manga, nudos, peso, camarotes, pasajeros);
        this.velas = velas;
    }
    
    
    
}
