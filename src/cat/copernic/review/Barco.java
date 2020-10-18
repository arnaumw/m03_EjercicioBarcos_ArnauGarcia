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
public abstract class Barco implements EnCasoDeIncendioInterface, EnCasoDeAbordajeInterface {
    
    // Protected es visible en las subclases. 
    protected String nombre = "Sin Nombre";
    // Composición: Utilizamos una clase en otra
    private Motor motor;
    private double eslora; // El largo del barco.
    private double manga; // El ancho del barco.
    private int nudos; // La velocidad del barco.
    private int peso; // El peso del barco en toneladas.

    public Barco(Motor motor, double eslora, double manga, int nudos, int peso) {
        this.motor = motor;
        this.eslora = eslora;
        this.manga = manga;
        this.nudos = nudos;
        this.peso = peso;
    }

    public Motor getMotor() {
        return motor;
    }

    public double getEslora() {
        return eslora;
    }

    public double getManga() {
        return manga;
    }

    public int getNudos() {
        return nudos;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Barco{" + "motor=" + motor + ", eslora=" + eslora + ", manga=" + manga + ", nudos=" + nudos + ", peso=" + peso + '}';
    }

    
    abstract void arranca();
    
    abstract void atraca();
    
}
