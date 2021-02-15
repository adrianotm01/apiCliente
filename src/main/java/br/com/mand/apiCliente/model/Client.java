package br.com.mand.apiCliente.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String cpf;
	
	private String address;
	
}
