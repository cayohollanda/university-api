package br.com.iesp.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Cayo Hollanda
 *
 */
@Entity
@Table(name="tb_client")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String cpf;
	
	@Column
	private String gener;
	
	public Client() {}
	
	public Client(Long id, String name, String cpf, String gener) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.gener = gener;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf(){
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public String getGener(){
		return gener;
	}

	public void setGener(String gener){
		this.gener = gener;
	}
	
}
