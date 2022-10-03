package ejer2exguia10;

import clase.Edificio;
import clase.EdificioDeOficinas;
import clase.Polideportivo;
import java.util.ArrayList;

public class Ejer2exguia10 {

    public static void main(String[] args) {
        int techados = 0;
        int cont = 1;
        ArrayList<Edificio> edificios = new ArrayList();
        Polideportivo poli1 = new Polideportivo();
        poli1.crearEdificio();
        edificios.add(poli1);
        Polideportivo poli2 = new Polideportivo();
        poli2.crearEdificio();
        edificios.add(poli2);
        EdificioDeOficinas ofi1 = new EdificioDeOficinas();
        ofi1.crearEdificio();
        edificios.add(ofi1);
        EdificioDeOficinas ofi2 = new EdificioDeOficinas();
        ofi2.crearEdificio();
        edificios.add(ofi2);
        for (Edificio edificio : edificios) {
            System.out.println("Datos del edificio " + cont);
            cont++;
            System.out.println("La superficie es " + edificio.calcularSuperficie() + "m^2");
            System.out.println("El volumen es "+edificio.calcularVolumen()+ "m^3");
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).isTechado()) {
                    techados++;
                }     
            }
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println("Pueden haber " + ((EdificioDeOficinas) edificio).cantPersonas() + " personas en el edificio de oficinas");
            }
        }
        System.out.println("Hay " + techados + " polideportivos techados");
    }
}
