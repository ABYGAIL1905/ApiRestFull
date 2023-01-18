package ista.edu.proyecto.service;

import java.util.List;

import ista.edu.proyecto.modelo.Usuario;



public interface IUsuarioService {
public List<Usuario>findAll();
	
	public Usuario findById(Long id);
	
    public Usuario save(Usuario usuario);

    public void delete(Long id);

}
