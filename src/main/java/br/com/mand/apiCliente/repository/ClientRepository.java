package br.com.mand.apiCliente.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mand.apiCliente.dto.ClientDTO;
import br.com.mand.apiCliente.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

	Optional<Client> findByName(String name);

}
