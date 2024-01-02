package DevBackEnd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DevBackEnd.dev_backend_Model.Usuario;
import DevBackEnd.dev_backend_Repository.UsuarioRepository;

public class dev_backend_Service {

	// UsuarioService.java
	@Service
	public class UsuarioService {

	    @Autowired
	    private UsuarioRepository usuarioRepository;

	    public Usuario salvarUsuario(Usuario usuario) {
	        // Adicione lógica de validação, encriptação de senha, etc., se necessário
	        return usuarioRepository.saveAndFlush(usuario);
	    }

	    public Optional<Usuario> buscarUsuarioPorEmail(String email) {
	        return usuarioRepository.findByEmail(email);
	    }

	    // Adicione outros métodos de serviço conforme necessário
	}

	
	
}
