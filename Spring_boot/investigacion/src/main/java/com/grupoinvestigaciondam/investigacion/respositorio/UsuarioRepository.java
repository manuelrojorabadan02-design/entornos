package com.grupoinvestigaciondam.investigacion.respositorio;

import com.grupoinvestigaciondam.investigacion.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //Buscar todos los Uusarios
    List<Usuario> findAll();

    //Buscar un usuario en concreto
    Optional<Usuario> findById(Long id);

    //Guardar un usuario
    Usuario save(Usuario usuario);

    //Actualizar un Usuario
    /**Usuario update(Long id, Usuario usuario);*/

    //Borrar un Usuario
    void deleteById(Long id);
}