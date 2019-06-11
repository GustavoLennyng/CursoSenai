package gustavolennyng.senai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.domain.Cliente;
import com.gustavo.repositories.ClienteRepository;

import gustavolennyng.senai.services.exceptions.ObjectNotFoundException;

    @Service
    public class ClienteService {
    	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer idCliente) {
    java.util.Optional<Cliente> obj = repo.findById(idCliente);
    return ((java.util.Optional<Cliente>) obj).orElseThrow(() -> new ObjectNotFoundException(
		"Numero de id não encontrado. Id: " + idCliente + ", tipo: "
		+ Cliente.class.getName()));
	}

}
