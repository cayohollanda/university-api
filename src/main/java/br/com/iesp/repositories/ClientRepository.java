package br.com.iesp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.iesp.domain.Client;

/**
 * @author Cayo Hollanda
 *
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
