package sistemaemergencias.controllers;

public class Recurso {
    private String id;
    private boolean estaDisponible;

    public Recurso(String id) {
        this.id = id;
        this.estaDisponible = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean EstaDisponible() {
        return estaDisponible;
    }

    public void setDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
    public void asignar(){
        estaDisponible = false;
    }

    public void liberar(){
        estaDisponible = true;
    }

    @Override
    public String toString() {
        return "Recurso{" + "id=" + id + ", estaDisponible=" + estaDisponible + '}';
    }
    
}
