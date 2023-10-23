package com.back.persistence;

import com.back.model.Horario;
import com.back.model.Usuario;

public class ControladoraPersistencia {
    
    UsuarioJpaController userJpa = new UsuarioJpaController();
    HorarioJpaController horJpa = new HorarioJpaController();

    public void guardar(Horario registro, Usuario usuario) {
        //creacio en la bd las dos entidades
        horJpa.create(registro);
        userJpa.create(usuario);
    }
    
}
