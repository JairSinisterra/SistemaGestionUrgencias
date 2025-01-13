package sistemaemergencias.services;
import sistemaemergencias.controllers.Recurso;
  

// Representa un recurso del tipo Bomberos con su comportamiento único
public class Bomberos extends Recurso {
    public Bomberos(String nombre) {
        super(nombre);
    }

    // Implementación del método para atender emergencias relacionadas con incendios
    @Override
    public void atenderEmergencia() {
        System.out.println(getNombre() + " está atendiendo un incendio.");
        setDisponible(false); // Marca el recurso como no disponible
    }
}
