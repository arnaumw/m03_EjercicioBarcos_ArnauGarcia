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
public class Yate extends BarcoDePasajeros {
    
    private boolean helipuerto;

    public Yate(boolean helipuerto, Motor motor, double eslora, double manga, int nudos, int peso, int camarotes, int pasajeros) {
        super(motor, eslora, manga, nudos, peso, camarotes, pasajeros);
        this.helipuerto = helipuerto;
        this.nombre = "Mi Yate";
    }
    
    
    
}
