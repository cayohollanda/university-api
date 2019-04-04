package br.com.iesp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.iesp.domain.Client;
import br.com.iesp.repositories.ClientRepository;

/**
 * @author Cayo Hollanda
 *
 */
@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	public Client getOne(Long id) {
		Optional<Client> c = clientRepository.findById(id);
		return c.orElse(null);
	}
	
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
	
	public void delete(Long id) {
		clientRepository.deleteById(id);
	}
	
	public Client save(Client c) {
		return clientRepository.save(c);
	}
}
