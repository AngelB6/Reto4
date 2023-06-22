package Figuras;

public class Rombo extends Figura{
    // Creamos los atributos necesarios para que el metodo calcularArea se ejecute de manera correcta
    private double diaMayor;
    private double diaMenor;
    // Creamos los atributos necesarios para que el metodo calcularPerimetro se ejecute de manera correcta
    private double lado12;
    // Creamos los metodos constructores
    public Rombo(double diaMayor, double diaMenor) {
        this.diaMayor = diaMayor;
        this.diaMenor = diaMenor;
    }
    public Rombo(double lado12) {
        this.lado12 = lado12;
    }
    // Metodo constructor con parametros
    public Rombo(double diaMayor, double diaMenor, double lado12) {
        this.diaMayor = diaMayor;
        this.diaMenor = diaMenor;
        this.lado12 = lado12;
    }
    // Creamos los getter y setters
    public double getDiaMayor() {
        return diaMayor;
    }
    public void setDiaMayor(Double diaMayor) {
        this.diaMayor = diaMayor;
    }
    public double getDiaMenor() {
        return diaMenor;
    }
    public void setDiaMenor(Double diaMenor) {
        this.diaMenor = diaMenor;
    }
    public double getLado12(){
        return lado12;
    }
    public void setLado12(Double lado12){
        this.lado12 = lado12;
    }
    // Metodos para calcular el area y el perimetro
    public double calcularArea() {
        double area=0.0;
        area=(diaMayor*diaMenor)/2;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro=0;
        perimetro=lado12*4;
        return perimetro;
    }
}