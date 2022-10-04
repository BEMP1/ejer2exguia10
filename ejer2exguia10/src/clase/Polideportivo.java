package clase;

import java.util.Scanner;

public class Polideportivo extends Edificio {

    public String nombre;
    public boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double largo, double altura) {
        super(ancho, largo, altura);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

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

    @Override
    public double calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public double calcularVolumen() {
        return largo * altura * ancho;
    }

    @Override
    public void crearEdificio() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        char respuesta;
        super.crearEdificio();
        System.out.println("ingrese el nombre");
        this.nombre = leer.next();
        System.out.println("Ingrese si esta techado S/N");
        respuesta = leer.next().toUpperCase().charAt(0);
        if (respuesta == 'S') {
            this.techado = true;
        } else {
            this.techado = false;
        }
        while (respuesta != 'S' && respuesta != 'N') {
            System.out.println("No se ingreso S o N");
            respuesta = leer.next().toUpperCase().charAt(0);
            if (respuesta == 'S') {
                this.techado = true;
            } else {
                this.techado = false;
            }
        }
    }
}
