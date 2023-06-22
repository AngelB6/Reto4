package Figuras;

public class Triangulo extends Figura{
    // Atributos para calcular el area del triangulo
    private double base3;
    private double altura2;
    // Atributos para calcular el perimetro del triangulo
    private double lado5;
    private double lado6;
    private double lado7;
    // Creamos los metodos contructores vacios y con parametros
    public Triangulo() {
    }

    public Triangulo(double base3, double altura2, double lado5, double lado6, double lado7) {
        this.base3 = base3;
        this.altura2 = altura2;
        this.lado5 = lado5;
        this.lado6 = lado6;
        this.lado7 = lado7;
    }

    public Triangulo(double base3, double altura2) {
        this.base3 = base3;
        this.altura2 = altura2;
    }
    public Triangulo(double lado5, double lado6, double lado7) {
        this.lado5 = lado5;
        this.lado6 = lado6;
        this.lado7 = lado7;
    }
    // Hacemos el encapsulamiento con los getters y setters
     public double getBase3() {
        return base3;
    }

    public void setBase3(double base3) {
        this.base3 = base3;
    }

    public double getAltura2() {
        return altura2;
    }

    public void setAltura2(double altura2) {
        this.altura2 = altura2;
    }

    public double getLado5() {
        return lado5;
    }

    public void setLado5(double lado5) {
        this.lado5 = lado5;
    }

    public double getLado6() {
        return lado6;
    }

    public void setLado6(double lado6) {
        this.lado6 = lado6;
    }

    public double getLado7() {
        return lado7;
    }

    public void setLado7(double lado7) {
        this.lado7 = lado7;
    }    
    // Creamos los metodos para calcular el area y el perimetro
    public double calcularArea() {
        double area=0.0;
        area=(Double) (base3*altura2)/2;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro=0.0;
        perimetro=lado5+lado6+lado7;
        return perimetro;
    }
}