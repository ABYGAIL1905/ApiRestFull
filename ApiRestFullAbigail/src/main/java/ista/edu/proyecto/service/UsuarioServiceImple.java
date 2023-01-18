package ista.edu.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.edu.proyecto.modelo.Usuario;
import ista.edu.proyecto.repositorio.UsuarioInRepositorio;
@Service
public class UsuarioServiceImple implements IUsuarioService {

	@Autowired
	private UsuarioInRepositorio usuariorep;
	@Override
	@Transactional(readOnly=true)
	//listar
	public List<Usuario> findAll() {
	
		return (List<Usuario>) usuariorep.findAll();
	}

	//Buscar
	@Override
	@Transactional(readOnly=true)
	public Usuario findById(Long id) {
		
		return usuariorep.findById(id).orElse(null);
	}

	//Guardar
	@Override
	public Usuario save(Usuario usuario) {
		
		return usuariorep.save(usuario);
	}

	//Eliminar
	@Override
	public void delete(Long id) {
		usuariorep.deleteById(id);
	}

}
