package sistemaemergencias.controllers;


// Clase base para los recursos
// Define los atributos y comportamientos generales que comparten todos los recursos
public abstract class Recurso {
    private String nombre; // Nombre del recurso
    private boolean disponible; // Indica si el recurso está disponible para atender emergencias

    // Constructor que inicializa el nombre del recurso y lo marca como disponible
    public Recurso(String nombre) {
        this.nombre = nombre;
        this.disponible = true;
    }

    // Getter para obtener el nombre del recurso
    public String getNombre() {
        return nombre;
    }

    // Getter para verificar si el recurso está disponible
    public boolean isDisponible() {
        return disponible;
    }

    // Setter para cambiar el estado de disponibilidad del recurso
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Metodo abstracto que será implementado por las subclases para atender emergencias
    public abstract void atenderEmergencia();
}
