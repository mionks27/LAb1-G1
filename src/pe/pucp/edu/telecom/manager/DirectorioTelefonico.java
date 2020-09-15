package pe.pucp.edu.telecom.manager;

import pe.pucp.edu.telecom.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class DirectorioTelefonico {

    private ArrayList<Usuario> listaUsuarios;

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
