package com.grupoinvestigaciondam.investigacion.servicio;

import com.grupoinvestigaciondam.investigacion.entidades.Usuario;
import com.grupoinvestigaciondam.investigacion.respositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        System.out.println("Encontre todos los usuarios");
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        System.out.println("Entontre al Usuario con ID: " + id);
        return usuarioRepository.findById(id);
    }

    public Usuario save(Usuario usuario) {
        System.out.println("Usuario Guardado");
        return usuarioRepository.save(usuario);
    }

   /** public Usuario update(Long id, Usuario usuario) {
        Optional<Usuario> existente = usuarioRepository.findById(id);
        if (existente.isPresent()) {
            Usuario actualizado = existente.get();
            actualizado.setNombre(usuario.getNombre());
            actualizado.setEmail(usuario.getEmail());
            return usuarioRepository.save(actualizado);
        } else {
            throw new RuntimeException("Usuario no encontrado con id " + id);
        }
    }*/

    public void deleteById(Long id) {
        System.out.println("Usuario eliminado");
        usuarioRepository.deleteById(id);
    }
}
