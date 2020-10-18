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
public abstract class BarcoDePasajeros extends Barco {
    
    private int camarotes;
    private int pasajeros;

    public BarcoDePasajeros(Motor motor, double eslora, double manga, int nudos, int peso, int camarotes, int pasajeros) {
        super(motor, eslora, manga, nudos, peso);
        this.camarotes = camarotes;
        this.pasajeros = pasajeros;
    }
    
    public void arranca() {
        System.out.println("Arrancando BARCO DE PASAJEROS...");
    }
    
    public void atraca() {
        System.out.println("Atracando BARCO DE PASAJEROS...");
    }

    @Override
    public void AbandonenElBarco() {
        System.out.println("Abandonamos el barco corriendo!");
    }

    @Override
    public void comportamiento() {
        System.out.println("A ESCONDERSEEE");
    }
    
    
    
}
