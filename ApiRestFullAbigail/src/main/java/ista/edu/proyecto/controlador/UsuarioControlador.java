package ista.edu.proyecto.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



import ista.edu.proyecto.modelo.Usuario;
import ista.edu.proyecto.service.IUsuarioService;
@CrossOrigin (origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class UsuarioControlador {
	
	@Autowired
	private IUsuarioService usuarioser;
	
	//retorna todos
	@GetMapping("/usuario")
	public List<Usuario>index(){
		return usuarioser.findAll();	
	}
	
	//retorna uno
	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Long id){
		return usuarioser.findById(id);
	}
	
	//inserta un usuario
	@PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario saves(@RequestBody Usuario usuario) {
        return usuarioser.save(usuario);
    }
	
	//elimina un usuario
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioser.delete(id);
	}
	
	//actualiza un usuario
	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id){
		Usuario usuarioactual = usuarioser.findById(id);
		usuarioactual.setNombre(usuario.getNombre());
		usuarioactual.setClave(usuario.getClave());
		usuarioactual.setEmail(usuario.getEmail());
		usuarioactual.setEstado(usuario.getEstado());
		return usuarioser.save(usuarioactual);
	}
	
}
