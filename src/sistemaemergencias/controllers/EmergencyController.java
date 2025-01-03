package sistemaemergencias.controllers;
import sistemaemergencias.models.Emergencia;
import sistemaemergencias.services.Ambulancia;
import sistemaemergencias.services.Bombero;
import sistemaemergencias.services.Policia;
import sistemaemergencias.utils.Metricas;
import sistemaemergencias.utils.PrioridadHandler;

import java.util.List;
import java.util.Map;

public  abstract class EmergencyController {
    List<Emergencia> emergenciaPendientes;
    List<Bombero> bomberosDisponibles;
    List<Ambulancia> ambulanciasDisponibles;
    List<Policia> policiaDisponibles;
    PrioridadHandler prioridadHandler;
    Metricas metricas;
    List<Emergencia> emergenciasAtendidads;
    Map<String, Object> configuracion;

   abstract public void registrarEmergencia(Emergencia emergencia);
   abstract public void asignarRecurso(Emergencia emergencia);
   abstract public void mostrarEstadoRecursos();
    
}
