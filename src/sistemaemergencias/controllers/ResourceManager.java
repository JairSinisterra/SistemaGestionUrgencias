package sistemaemergencias.controllers;

import java.util.ArrayList;
import java.util.List;

public class ResourceManager {

    // lista de recursos gestionados por el administrador.
    private List<Recurso> recursos;

    // Constructor: inicializa la lista de recursos como una lista vacia
    public ResourceManager() {
        this.recursos = new ArrayList<>();   
    }


    // Metodo para agregar un nuevo recurso a la lista de recursos disponibles
    public void agregarRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }


    // Metodo para asignar un recurso disponible a una emergencia
    public Recurso asignarRecurso(String tipoEmergencia){
        //Itera por todos los recursos buscando uno disponible que coincida con el tipo de emergencia
        for (Recurso recurso : recursos) {
            if (recurso.isDisponible() && recurso.getClass().getSimpleName().equalsIgnoreCase(tipoEmergencia)) {
              // Marca el recurso como ocupado para atender la emergencia  
             recurso.atenderEmergencia();
             return recurso;   
            }
        
        }
        // Si no hay recursos disponibles para el tipo de emergencia, Informa al usuario
        System.out.println("No hay recursos disponibles para:" + tipoEmergencia);
        return null;
    }


    // Metodo para liberar un recurso despues de atender una emergencia
    public void liberarRecurso(Recurso recurso) {
        recurso.setDisponible(true);
        System.out.println(recurso.getNombre() +" esta ahora disponible.");
    }

    // Metodo para mostrar los recursos disponibles
    public void mostrarRecursos() {
        System.out.println("Recursos disponibles: ");
        for (Recurso recurso : recursos) {
            System.out.println(recurso.getNombre() + " - Disponible: " + recurso.isDisponible());
        }
    }
}
