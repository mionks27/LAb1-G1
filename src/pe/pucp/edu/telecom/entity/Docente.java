package pe.pucp.edu.telecom.entity;

public class Docente extends Usuario {

    private int añoDeInicio;
    private int cantidadCursos;

    public int getAñoDeInicio() {
        return añoDeInicio;
    }

    public void setAñoDeInicio(int añoDeInicio) {
        this.añoDeInicio = añoDeInicio;
    }

    public int getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(int cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
    }
}
