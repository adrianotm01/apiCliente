package br.com.mand.apiCliente.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

	private String name;
	
	private String cpf;
	
	private String address;
	
}
