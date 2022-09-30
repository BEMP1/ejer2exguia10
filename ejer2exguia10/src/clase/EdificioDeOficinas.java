package clase;

import java.util.Scanner;

public class EdificioDeOficinas extends Edificio {

    public int pisos;
    public int oficinas;
    public int personas;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int pisos, int oficinas, int personas, double ancho, double largo, double altura) {
        super(ancho, largo, altura);
        this.pisos = pisos;
        this.oficinas = oficinas;
        this.personas = personas;
    }

    public int cantPersonas() {
        return pisos * oficinas * personas;
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
        System.out.println("Ingrese cantidad de pisos");
        this.pisos = leer.nextInt();
        System.out.println("Ingrese oficinas por piso");
        this.oficinas = leer.nextInt();
        System.out.println("Ingrese personas por oficina");
        this.personas = leer.nextInt();
    }
}
