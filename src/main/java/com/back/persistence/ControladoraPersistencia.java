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

    //Devulve una lista
    /*
        Metodo para devolver los datos de la base de datos y asignarlos al vector
    */
    public List<Usuario> traerUsuario() {
         
        return userJpa.findUsuarioEntities();

    }
    
}
