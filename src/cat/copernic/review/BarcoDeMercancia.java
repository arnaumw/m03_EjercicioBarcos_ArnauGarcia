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
public abstract class BarcoDeMercancia extends Barco {
    
    private int cargamento;

    public BarcoDeMercancia(Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.cargamento = cargamento;
    }
    
    public void arranca() {
        System.out.println("Arrancando BARCO DE MERCANCIA...");
    }
    
    public void atraca() {
        System.out.println("Atracando BARCO DE MERCANCIA...");
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

