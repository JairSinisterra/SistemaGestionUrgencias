package sistemaemergencias.services;
import sistemaemergencias.controllers.Recurso;

public class Policia extends Recurso {

    // Constructor: Inicializa un nuevo objeto Policia con un nombre especifico.
    public Policia(String nombre) {
        super(nombre); // Llama al constructor de la clase base Recurso para asignar el nombre de la policía.
    }

    // Metodo sobrescrito de la clase base Recurso para atender emergencias con la policía.
    @Override
    public void atenderEmergencia() {
        // Imprime un mensaje indicando que la policía está atendiendo una emergencia (en este caso, controlando un robo).
        System.out.println(getNombre() + " está controlando un robo.");
        setDisponible(false); // Marca a la policía como no disponible después de atender la emergencia.
    }
}
