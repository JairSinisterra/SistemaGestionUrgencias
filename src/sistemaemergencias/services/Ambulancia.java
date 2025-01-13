package sistemaemergencias.services;

import sistemaemergencias.controllers.Recurso;


public class Ambulancia extends Recurso {

    // Constructor: Inicializa una nueva ambulancia con un nombre especifico.
    public Ambulancia(String nombre) {
        super(nombre); // Llama al constructor de la clase base Recurso con el nombre de la ambulancia.
    }

    // Metodo sobrescrito de la clase base Recurso para atender emergencias con la ambulancia.
    @Override
    public void atenderEmergencia() {
        // Imprime un mensaje indicando que la ambulancia está atendiendo la emergencia.
        System.out.println(getNombre() + " está atendiendo a heridos");
        setDisponible(false); // Marca la ambulancia como no disponible.
    }
}

