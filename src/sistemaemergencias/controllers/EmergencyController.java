package sistemaemergencias.controllers;


public  abstract class EmergencyController {
    //Administrador de recusros que gestiona los recusos disponibles.
    private ResourceManager resourceManager;

    // Constructor: inicializa el administrador de recursos. 
    public EmergencyController(){
        this.resourceManager = new ResourceManager();
    }
    // Metodo para registrar un recurso en el administrador de recursos.
    public void registrarRecurso(Recurso recurso){
        resourceManager.agregarRecurso(recurso);
    }
    // Metodo para manejar una emergencia. de un tipo especifico
    // Busca un recurso disponible que pueda atender la emergencia y lo asigna 
    public void manjearEmergencia(String tipoEmergencia){
        Recurso recursoAsignado = resourceManager.asignarRecurso(tipoEmergencia);
        if (recursoAsignado != null) {
            System.out.println("Emegencia de tipo " + tipoEmergencia + " atendida por " + recursoAsignado.getNombre() + ".");
        }
    }


    // Metodo para finalizar una emergencia, Liberando el recurso que atendia la emergencia
    public void finalizarEmergencia(Recurso recurso){
        resourceManager.liberarRecurso(recurso);
    }


    // Metodo para mostrar el estado actual de los recursos
    public void mostrarEstadoRecursos(){
        resourceManager.mostrarRecursos();
    }
}
