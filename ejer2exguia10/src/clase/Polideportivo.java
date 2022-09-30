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

    @Override
    public double calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public double calcularVolumen() {
        return largo * altura * ancho;
    }

    @Override
    public void crearEdificio(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        super.crearEdificio();
        System.out.println("ingrese el nombre");
        this.nombre = leer.next();
        System.out.println("Ingrese si esta techado S/N");
        if (leer.next().charAt(0) == 'S' || leer.next().charAt(0) == 's') {
            this.techado = true;
        } else {
            this.techado = false;
        }
    }
}
