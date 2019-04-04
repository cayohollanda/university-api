package br.com.iesp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iesp.domain.Client;
import br.com.iesp.services.ClientService;

/**
 * @author Cayo Hollanda
 *
 */
@RestController
@RequestMapping(path = "/clients")
public class ClientResource {

	@Autowired
	private ClientService clientService;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Client client) {
		Client c = clientService.save(client);
		return ResponseEntity.ok().body(c);
	}

	@GetMapping
	public List<Client> findAll() {
		return clientService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable Long id) {
		Client c = clientService.getOne(id);
		return ResponseEntity.ok().body(client);
	}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		clientService.delete(id);
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Client client) {
		clientService.save(client);
		return ResponseEntity.ok().body(client);
	}


}