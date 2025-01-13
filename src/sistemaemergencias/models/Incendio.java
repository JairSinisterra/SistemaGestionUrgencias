package sistemaemergencias.models;

public class Incendio extends Emergencia {
    private String tipoFuego; // Categoría del fuego (A, B, C, D, K)
    private int cantidadCamionesNecesarios; // N° de camiones requeridos
    private boolean materialesPeligrosos; // Si hay materiales peligrosos

    public Incendio(String ubicacion, int nivelPrioridad, double tiempoRespuesta, String estado,
                    String tipoFuego, int cantidadCamionesNecesarios, boolean materialesPeligrosos) {
        super("Incendio", ubicacion, nivelPrioridad, tiempoRespuesta, estado);
        this.tipoFuego = tipoFuego;
        this.cantidadCamionesNecesarios = cantidadCamionesNecesarios;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    public String getTipoFuego() {
        return tipoFuego;
    }

    public void setTipoFuego(String tipoFuego) {
        if (!tipoFuego.matches("^[A-EK]$")) {
            throw new IllegalArgumentException("El tipo de fuego debe ser A, B, C, D, o K.");
        }
        this.tipoFuego = tipoFuego;
    }

    public int getCantidadCamionesNecesarios() {
        return cantidadCamionesNecesarios;
    }

    public void setCantidadCamionesNecesarios(int cantidadCamionesNecesarios) {
        if (cantidadCamionesNecesarios <= 0) {
            throw new IllegalArgumentException("Debe haber al menos un camión necesario.");
        }
        this.cantidadCamionesNecesarios = cantidadCamionesNecesarios;
    }

    public boolean isMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    public void setMaterialesPeligrosos(boolean materialesPeligrosos) {
        this.materialesPeligrosos = materialesPeligrosos;
    }

    //Metodo para mostrar las opciones de tipos de fuego
    public static void mostrarTiposFuego() {
        System.out.println("Seleccione el tipo de fuego:");
        System.out.println("A. Fuegos en materiales comunes (madera, papel, tela). Usar agua o espuma.");
        System.out.println("B. Fuegos en liquidos inflamables (gasolina, aceites). Usar Co2 o polvo quimico.");
        System.out.println("C. Fuegos en equipos electronicos energizados. Usar Co2 o polvo quimico (Nunca agua).");
        System.out.println("D.Fuego en metales combustibles (Magnesio, soido). Usar polvo seco especial.");
        System.out.println("K. Fuegos en aceites o grasas de cocina. Usar extingidor de clase K.");
    }

    @Override
    public void gestionarEmergencia() {
        System.out.println("Gestionando incendio tipo " + tipoFuego +
                " en " + getUbicacion() +
                ". Camiones necesarios: " + cantidadCamionesNecesarios +
                ". Materiales peligrosos: " + (materialesPeligrosos ? "Sí" : "No"));
    }
}
