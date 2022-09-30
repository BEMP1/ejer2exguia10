package clase;

import java.util.Scanner;

public abstract class Edificio {

    public double ancho;
    public double largo;
    public double altura;

    public Edificio() {
    }
    
    

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Edificio(double ancho, double largo, double altura) {
        this.ancho = ancho;
        this.largo = largo;
        this.altura = altura;
    }
    
    public void crearEdificio(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese ancho");
        this.ancho = leer.nextDouble();
        System.out.println("Ingrese largo");
        this.largo = leer.nextDouble();
        System.out.println("Ingrese altura");
        this.altura = leer.nextDouble();
    }

}
