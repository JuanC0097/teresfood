package com.back.persistence;

import com.back.model.Horario;
import com.back.model.Usuario;
import com.back.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    /*
        Metodo para borrar un usuario
    */
    public void borrarUsuario(int id_usuario) {
        try {
            userJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id_usuario) {
        return userJpa.findUsuario(id_usuario);
    }
    
}
