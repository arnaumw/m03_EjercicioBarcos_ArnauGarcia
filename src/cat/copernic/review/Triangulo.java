/*
 * Acaba la clase Triangulo con el/los constructores, accesores (get/set)
 * método toString().
 * fecha limite: 15/10/2010 19:00
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class Triangulo {
    
    // propiedades
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Triangulo(double base, double altura, double area, double perimetro ) throws Exception {
        if (base <= 0) throw new Exception("El valor de la base no puede ser negativo."); // Excepction1 para que no se introduzca un valor negativo.
        if (altura <= 0) throw new Exception("El valor de la altura no puede ser negativo."); // Excepction2 para que no se introduzca un valor negativo.
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

    
    /* Calcula el área de este triangulo */
    public double area() {
        area = (base * altura) / 2;
        return area;
    }
    
    /* Calcula el perímetro de este triangulo conocida su base y altura */
    public double perimetro() {
        double hipotenusa = Math.sqrt((base/2 * base/2) + (altura * altura)); // Calculamos la hipotenusa con una raíz cuadrada.
        perimetro = (hipotenusa * 2) + base; // Multiplicamos la hipotenusa * 2 y le sumamos la base.
        return perimetro;
    }
    
    
    
}
