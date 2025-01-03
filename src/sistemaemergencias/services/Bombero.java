package sistemaemergencias.services;
import sistemaemergencias.controllers.Recurso;  

public class Bombero extends Recurso {
    private String especialidad; // Especialidad del bombero

    public Bombero(String id, String especialidad) {
        super(id);
        this.especialidad = especialidad;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", especialidad='" + especialidad + "'\n";
    }
}
