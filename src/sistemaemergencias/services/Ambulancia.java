package sistemaemergencias.services;

import sistemaemergencias.controllers.Recurso;

public class Ambulancia extends Recurso {
    private String equipoEspecial; //Equipo especial de la ambulancia

    public Ambulancia(String id, String equipoEspecial) {
        super(id);
        this.equipoEspecial = equipoEspecial;
    }

    public String getEquipoEspecial() {
        return equipoEspecial;
    }

    public void setEquipoEspecial(String equipoEspecial) {
        this.equipoEspecial = equipoEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + ", equipoEspecial='" + equipoEspecial + "'";
               
    }
}
