package ista.edu.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import ista.edu.proyecto.modelo.Usuario;



public interface UsuarioInRepositorio extends JpaRepository<Usuario, Long>{

}
