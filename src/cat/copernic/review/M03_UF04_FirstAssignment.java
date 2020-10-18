/*
 * FIRST ASSIGNMENT
 */
package cat.copernic.review;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pep
 */
public class M03_UF04_FirstAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Barco barco1 = new Yate(true, new Motor(215), 20.0, 12.5, 23, 7, 4, 6);
        barco1.arranca();
        
        Barco barco2 = new PortaAviones(25, new Motor(660), 250.0, 75.5, 46, 8000, 35);
        
        System.out.println(barco1 instanceof Barco); // Para comprobar que tipo de avion es.
        
//        try {
//            // Prueba to código aquí
//            CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
//            System.out.println(cc1);
//            cc1.ingresa(123.09);
//            System.out.println(cc1);
//            cc1.abona(98.87);
//            System.out.println(cc1);
//            
//            Triangulo tring = new Triangulo(12, 15, 0, 0);
//            System.out.println(tring);
//            tring.area();
//            tring.perimetro();
//            System.out.println(tring);
//        } catch (Exception ex) {
//            Logger.getLogger(M03_UF04_FirstAssignment.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
