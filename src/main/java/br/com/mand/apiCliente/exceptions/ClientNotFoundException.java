package br.com.mand.apiCliente.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClientNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 2740286541588254987L;

	public ClientNotFoundException(String name) {
		super(String.format("Client with name %s not found", name));
	}

	public ClientNotFoundException(Integer idClient) {
		super(String.format("Client with name %s not found", idClient));
	}

	
	
}
