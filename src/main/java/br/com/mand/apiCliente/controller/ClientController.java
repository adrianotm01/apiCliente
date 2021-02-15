package br.com.mand.apiCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mand.apiCliente.dto.ClientDTO;
import br.com.mand.apiCliente.service.ClientService;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll(){
		return ResponseEntity.ok(this.clientService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClientDTO> findById(@PathVariable Integer id){
		return ResponseEntity.ok(this.clientService.findById(id));
	}
}
