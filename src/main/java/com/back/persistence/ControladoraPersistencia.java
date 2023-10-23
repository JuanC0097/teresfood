package com.back.persistence;

import com.back.model.Horario;
import com.back.model.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController userJpa = new UsuarioJpaController();
    HorarioJpaController horJpa = new HorarioJpaController();

    public void guardar(Horario registro, Usuario usuario) {
        //creacio en la bd las dos entidades
        horJpa.create(registro);
        userJpa.create(usuario);
    }

    public List<Usuario> traerUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
