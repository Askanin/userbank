package br.com.userbank.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "USUARIO")
@Data
public class User {
	
	@Id
	private Integer id;
	private String name;
	private String email;
	private String password;
	private List<Phone> phone;

}
