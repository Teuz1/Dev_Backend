package DevBackEnd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class dev_backend_Model {

	// Usuario.java
	@Entity
	public class Usuario {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private String email;
	    private String senha;

	    // getters and setters
	}

	
}
