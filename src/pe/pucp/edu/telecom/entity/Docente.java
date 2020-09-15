package pe.pucp.edu.telecom.entity;

public class Docente extends Usuario {

    private String añoDeInicio;
    private String cantidadCursos;


    public String getAñoDeInicio() {
        return añoDeInicio;
    }

    public void setAñoDeInicio(String añoDeInicio) {
        this.añoDeInicio = añoDeInicio;
    }

    public String getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(String cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
    }
}
