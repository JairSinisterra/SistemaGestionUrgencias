package sistemaemergencias.models;

public abstract class Emergencia {
    private String tipo;
    private String ubicacion;
    private int nivelPrioridad;
    private double tiempoRespuesta;
    private String estado;

    //Constructor
    public Emergencia(String tipo, String ubicacion, int nivelPrioridad, double tiempoRespuesta, String estado) {
        setTipo(tipo);
        setUbicacion(ubicacion);
        setNivelPrioridad(nivelPrioridad);
        setTiempoRespuesta(tiempoRespuesta);
        setEstado(estado);
    }

    // Metodos abstractos para forzar la implementacion en subclases
    public abstract void gestionarEmergencia();

    // Getters y Setters 'tipo'
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            System.out.println("El tipo de emergencia no puede ser nulo o vacio.");
        }
        this.tipo = tipo;
    }

    // Getters y Setters 'ubicacion'
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        // Validar que la ubicación no sea nula o vacía
        if (ubicacion == null || ubicacion.trim().isEmpty()) {
            System.out.println("La ubicación no puede ser nula o vacia.");
        }

        // Validar que la ubicación sea un formato permitido (ejemplo: solo letras y numeros)
        if (!ubicacion.matches("^[a-zA-Z0-9\\s]+$")) {
            System.out.println("La ubicacion debe contener solo letras y numeros.");;
        }

        this.ubicacion = ubicacion;
    }

    // Getters y Setters 'nivelPrioridad'
    public int getNivelPrioridad() {
        return nivelPrioridad;
    }
    public void setNivelPrioridad(int nivelPrioridad) {
        if (nivelPrioridad < 1 || nivelPrioridad > 3) {
            System.out.println("El nivel de prioridad debe ser entre 1 y 3.");
        }
        this.nivelPrioridad = nivelPrioridad;
    }
    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }
    public void setTiempoRespuesta(double tiempoRespuesta) {
        if (tiempoRespuesta < 0) {
            System.out.println("El tiempo de respuesta no puede ser negativo.");
        }
        this.tiempoRespuesta = tiempoRespuesta;
    }

    // Getters y Setters 'estado'
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        if (estado == null || !estado.equals("Pendiente") && !estado.equals("Resuelta")) {
            System.out.println("El estado debe ser 'Pendiente' o 'Resuelta'.");
        }
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Emergencia [tipo=" + tipo + ", ubicacion=" + ubicacion + ", nivelPrioridad=" + nivelPrioridad
                + ", tiempoRespuesta=" + tiempoRespuesta + ", estado=" + estado + "]";
    }
    
}
