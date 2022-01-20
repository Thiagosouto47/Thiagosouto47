package com.produtos.apirest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "QUANTIDADE")
	private Integer quantidade;
	@Column(name = "VALOR")
	private Float valor; 
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public Float getValor() {
		return valor;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	

}
