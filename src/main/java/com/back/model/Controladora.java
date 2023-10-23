package com.back.model;

import com.back.persistence.ControladoraPersistencia;

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
    
}
