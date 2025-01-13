package sistemaemergencias.models;

public class AccidenteVehicular extends Emergencia {
    //Atributos especificos del accidente vehicular.
    private int cantidadHeridos;
    private boolean bloqueoDeCarretera;
    //Constructor: inicializa los atributos del accidente vehicular y pasa los parametros comunes a la clase Emergencia
    public AccidenteVehicular(String ubicacion, int nivelPrioridad, double tiempoRespuesta, String estado,
                              int cantidadHeridos, boolean bloqueoDeCarretera) {
        super("AccidenteVehicular", ubicacion, nivelPrioridad, tiempoRespuesta, estado);
        this.cantidadHeridos = cantidadHeridos;
        this.bloqueoDeCarretera = bloqueoDeCarretera;
    }

    public int getCantidadHeridos() {
        return cantidadHeridos;
    }
    //Si la cantidad es negativa, lanza una excepcion 
    public void setCantidadHeridos(int cantidadHeridos) {
        if (cantidadHeridos < 0) {
            throw new IllegalArgumentException("La cantidad de heridos no puede ser negativa.");
        }
        this.cantidadHeridos = cantidadHeridos;
    }

    public boolean isBloqueoDeCarretera() {
        return bloqueoDeCarretera;
    }

    public void setBloqueoDeCarretera(boolean bloqueoDeCarretera) {
        this.bloqueoDeCarretera = bloqueoDeCarretera;
    }

    @Override
    public void gestionarEmergencia() {
        System.out.println("Gestionando accidente vehicular en " + getUbicacion() +
                ". Heridos: " + cantidadHeridos +
                ". Bloqueo de carretera: " + (bloqueoDeCarretera ? "Si" : "No"));
    }
}
