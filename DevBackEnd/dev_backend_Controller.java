package DevBackEnd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DevBackEnd.dev_backend_Model.Usuario;
import DevBackEnd.dev_backend_Service.UsuarioService;

public class dev_backend_Controller {

	// UsuarioController.java
	@Controller
	@RequestMapping("/api/usuarios")
	public class UsuarioController {

	    @Autowired
	    private UsuarioService usuarioService;

	    @PostMapping("/criar")
	    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
	        Usuario novoUsuario = usuarioService.salvarUsuario(usuario);
	        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Usuario> obterUsuarioPorId(@PathVariable String id) {
	        Optional<Usuario> usuario = usuarioService.buscarUsuarioPorEmail(id);

	        if (usuario.isPresent()) {
	            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @GetMapping("/buscar-por-email")
	    public ResponseEntity<Usuario> obterUsuarioPorEmail(@RequestParam String email) {
	        Optional<Usuario> usuario = usuarioService.buscarUsuarioPorEmail(email);

	        if (usuario.isPresent()) {
	            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    // Adicione métodos para atualizar e excluir usuários conforme necessário
	}

	
}
