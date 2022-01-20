package com.produtos.apirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.produtos.apirest.entity.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository  produtoRepository;

	public List<Produto> listaProduto() {
		return produtoRepository.findAll();
	}
	
	public Optional<Produto> listarProdutoUnico(Integer id){
		return produtoRepository.findById(id);
	}
	
	public Produto salvarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public void deletarProduto(Produto produto) {
	    produtoRepository.delete(produto);
	}
	
    public Produto atualizarProduto(Produto produto) {
  	return produtoRepository.save(produto);
    }

}
