
package ejer2exguia10;

import clase.Edificio;
import clase.EdificioDeOficinas;
import clase.Polideportivo;
import java.util.ArrayList;

public class Ejer2exguia10 {


    public static void main(String[] args) {
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
        
    }
    
}
