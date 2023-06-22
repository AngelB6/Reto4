package Figuras;

public class Triangulo extends Figura{
    // Atributos para calcular el area del triangulo
    private double base3;
    private double altura2;
    // Atributos para calcular el perimetro del triangulo
    private double lado1;
    private double lado2;
    private double lado3;
    // Creamos los metodos contructores vacios y con parametros
    public Triangulo() {
    }
    public Triangulo(double base3, double altura2, double lado1, double lado2, double lado3) {
        this.base3 = base3;
        this.altura2 = altura2;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    // Creamos los metodos para calcular el area y el perimetro
    public double calcularArea(double base3, double altura2) {
        double area=0.0;
        area=(Double) (base3*altura2)/2;
        return area;
    }
    public double calcularPerimetro(double lado1, double lado2, double lado3){
        double perimetro=0.0;
        perimetro=lado1+lado2+lado3;
        return perimetro;
    }
    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }
}