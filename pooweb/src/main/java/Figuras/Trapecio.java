package Figuras;

public class Trapecio extends Figura{
    // Metodos para calcular el area
    private double base1;
    private double base2;
    private double altura;
    // Metodos para calcular el perimetro
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    // Creamos los metodos constructores
    public Trapecio(){
    };
    public Trapecio(double base1, double base2, double altura, double lado1, double lado2, double lado3, double lado4) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    // Hacemos encapsulamiento
    public double getBase1() {
        return base1;
    }
    public void setBase1(double base1) {
        this.base1 = base1;
    }
    public double getBase2() {
        return base2;
    }
    public void setBase2(double base2) {
        this.base2 = base2;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
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
    public double getLado4() {
        return lado4;
    }
    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }
    // Hacemos los metodos de calcularArea y calcularPerimetro
    public double calcularArea(double base1,double base2, double altura) {
        Double area=0.0;
        area=(double) ((base1+base2)/2)*altura;
        return area;
    }
    public double calcularPerimetro(double lado1, double lado2, double lado3, double lado4){
        Double perimetro=0.0;
        perimetro=lado1+lado2+lado3+lado4;
        return perimetro;
    }
    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }
}