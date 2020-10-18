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
public abstract class BarcoDeGuerra extends Barco {
    
    private int cañones;

    public BarcoDeGuerra(Motor motor, double eslora, double manga, int nudos, int peso, int cañones) {
        super(motor, eslora, manga, nudos, peso);
        this.cañones = cañones;
    }
    
    public void arranca() {
        System.out.println("Arrancando BARCO DE GUERRA...");
    }
    
    public void atraca() {
        System.out.println("Atracando BARCO DE GUERRA...");
    }

    @Override
    public void AbandonenElBarco() {
        System.out.println("Abandonen el barco");
    }
    
    @Override
    public void comportamiento() {
        System.out.println("A LUCHAR!");
    }
    
    
}
