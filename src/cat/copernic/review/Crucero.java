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
public class Crucero extends BarcoDePasajeros {
    
    // 0-100...
    private double lujo;

    public Crucero(double lujo, Motor motor, double eslora, double manga, int nudos, int peso, int camarotes, int pasajeros) {
        super(motor, eslora, manga, nudos, peso, camarotes, pasajeros);
        this.lujo = lujo;
    }
    
    
    
}
