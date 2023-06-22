package Figuras;

public class Paralelogramo extends Figura{
    // Atributos para calcular el area del Paralelogramo
    private double base;
    private double altura;
    // Atributos para calcular el perimetro del Paralelogramo
    private double lado8;
    private double lado9;
    private double lado10;
    private double lado11;
    // Creamos los getters y setters
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

    public double getLado8() {
        return lado8;
    }

    public void setLado8(double lado8) {
        this.lado8 = lado8;
    }

    public double getLado9() {
        return lado9;
    }

    public void setLado9(double lado9) {
        this.lado9 = lado9;
    }

    public double getLado10() {
        return lado10;
    }

    public void setLado10(double lado10) {
        this.lado10 = lado10;
    }

    public double getLado11() {
        return lado11;
    }

    public void setLado11(double lado11) {
        this.lado11 = lado11;
    }

    
    // Creamos los metodos constructores
    public Paralelogramo() {
    }
    public Paralelogramo(double base, double altura, double lado8, double lado9, double lado10, double lado11) {
        this.base = base;
        this.altura = altura;
        this.lado8 = lado8;
        this.lado9 = lado9;
        this.lado10 = lado10;
        this.lado11 = lado11;
    }
    public Paralelogramo(double lado8, double lado9, double lado10, double lado11){
        this.lado8 = lado8;
        this.lado9 = lado9;
        this.lado10 = lado10;
        this.lado11 = lado11;
    }
    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        double area=0;
        area=base*altura;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro=0;
        perimetro=lado8+lado9+lado10+lado11;
        return perimetro;
    }
}