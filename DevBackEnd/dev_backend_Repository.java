\package DevBackEnd;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import DevBackEnd.dev_backend_Model.Usuario;


public class dev_backend_Repository {

	// UsuarioRepository.java
	public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	    Optional<Usuario> findByEmail(String email);
	    // Adicione métodos de consulta específicos, se necessário
	}

	
}
