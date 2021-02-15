package br.com.mand.apiCliente.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.mand.apiCliente.dto.ClientDTO;
import br.com.mand.apiCliente.exceptions.ClientNotFoundException;
import br.com.mand.apiCliente.model.Client;
import br.com.mand.apiCliente.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private ObjectMapper map;
	
	public List<ClientDTO> findAll() {
		List<ClientDTO> dtoListClient = clientRepository.findAll().stream().map(client -> {
			return map.convertValue(client, ClientDTO.class);
		}).collect(Collectors.toList());
		return dtoListClient;
	}
	
	public void save(ClientDTO clientDto) {
		this.clientRepository.save(map.convertValue(clientDto, Client.class));
	}
	
	public ClientDTO findById(Integer idClient) {
		Optional<Client> clientOptional = this.clientRepository.findById(idClient);
		Optional<ClientDTO> clienDTOOptional = clientOptional.map(optional -> {
			return map.convertValue(optional, ClientDTO.class);
		});
		return  clienDTOOptional.orElseThrow(() -> new ClientNotFoundException(idClient));
	}
	
	public ClientDTO findByName(String name){
		Optional<Client> clientOptional = this.clientRepository.findByName(name);
		Optional<ClientDTO> clienDTOOptional = clientOptional.map(optional -> {
			return map.convertValue(optional, ClientDTO.class);
		});
		return clienDTOOptional.orElseThrow(() -> new ClientNotFoundException(name));
	}

}
