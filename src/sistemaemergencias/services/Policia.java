package sistemaemergencias.services;
import sistemaemergencias.controllers.Recurso;

public class Policia extends Recurso {
    private String rango; // Rango o tipo de policia

    public Policia(String rango, String id) {
        super(id);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString() + ", rango='" + rango + "'\n";
    }
}
