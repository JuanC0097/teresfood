package com.back.model;

import com.back.persistence.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardar(String nombreUsuario, String apellidoUsuario, String documentoUsuario, String cargoUsuario, String password, String jornada, String horario) {
        
        Horario registro = new Horario();
        registro.setJornada(jornada);
        registro.setHorario(horario);
        
        Usuario usuario = new Usuario();
        usuario.setNombre(nombreUsuario);
        usuario.setApellido(apellidoUsuario);
        usuario.setDocumento(documentoUsuario);
        usuario.setCargo(cargoUsuario);
        usuario.setPassword(password);
        
        usuario.setHorario(registro);
        
        controlPersis.guardar(registro,usuario);
    }

    /*
        Metodo para obtener lista de usuarios de la base de datos
    */
    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuario();
    }

    public void borrarUsuario(int id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
    }

    public Usuario traerUsuario(int id_usuario) {

        return controlPersis.traerUsuario(id_usuario);
    }
    
}
