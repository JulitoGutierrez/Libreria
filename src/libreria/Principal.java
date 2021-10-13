package libreria;

import libreria.excepcion.MiExcepcion;
import libreria.menu.Menu;

public class Principal {

    public static void main(String[] args) throws MiExcepcion {
        Menu menu = new Menu();

        menu.interfazPrincipal();
    }
}
