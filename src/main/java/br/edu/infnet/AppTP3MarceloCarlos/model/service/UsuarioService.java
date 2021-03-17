package br.edu.infnet.AppTP3MarceloCarlos.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.tools.javac.util.List;

import br.edu.infnet.AppTP3MarceloCarlos.model.negocio.Usuario;
import br.edu.infnet.AppTP3MarceloCarlos.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	public void incluir(Usuario usuario) {		
		usuarioRepository.save(usuario);
	}	
	
	public List<Usuario> obterLista(){
		return (List<Usuario>) usuarioRepository.findAll();
		
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
		
	}
}
