package sistemaemergencias.models;

public class Robo extends Emergencia {
    private boolean armasInvolucradas;
    private int cantidadSospechosos;
    //Constructor
    public Robo(String ubicacion, int nivelPrioridad, double tiempoRespuesta, String estado,
                boolean armasInvolucradas, int cantidadSospechosos) {
        super("Robo", ubicacion, nivelPrioridad, tiempoRespuesta, estado);
        this.armasInvolucradas = armasInvolucradas;
        this.cantidadSospechosos = cantidadSospechosos;
    }

    public boolean isArmasInvolucradas() {
        return armasInvolucradas;
    }

    public void setArmasInvolucradas(boolean armasInvolucradas) {
        this.armasInvolucradas = armasInvolucradas;
    }

    public int getCantidadSospechosos() {
        return cantidadSospechosos;
    }
    // Si la cantidad de sospechosos es menor o igual a cero, informa al usuario y lanza excepcion 
    public void setCantidadSospechosos(int cantidadSospechosos) {
        if (cantidadSospechosos <= 0) {
            throw new IllegalArgumentException("Debe haber al menos un sospechoso involucrado.");
        }
        this.cantidadSospechosos = cantidadSospechosos;
    }

    @Override
    public void gestionarEmergencia() {
        System.out.println("Gestionando robo en " + getUbicacion() +
                ". Armas involucradas: " + (armasInvolucradas ? "Si" : "No") +
                ". Sospechosos: " + cantidadSospechosos);
    }
}

