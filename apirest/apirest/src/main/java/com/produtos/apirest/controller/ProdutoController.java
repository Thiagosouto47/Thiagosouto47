package com.produtos.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.entity.Produto;
import com.produtos.apirest.service.ProdutoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")

public class ProdutoController {
	
	@Autowired
	private ProdutoService  produtoService;
	
	@GetMapping("/produto")
	@ApiOperation(value="Retorna uma lista de produtos")
	public List<Produto> listaProduto(){
		return produtoService.listaProduto();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um produto unico")
	public Optional<Produto> listarProdutoUnico(@PathVariable(value="id") Integer id){
		return produtoService.listarProdutoUnico(id);
	}
	
	@PostMapping("/produto")
	@ApiOperation(value="Salve um produto")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoService.salvarProduto(produto);
	}
	
    @DeleteMapping("/produto")
    @ApiOperation(value="Deleta um produto")
    public void deletarProduto(@RequestBody Produto produto) {
    	produtoService.deletarProduto(produto);
    }
    
    @PutMapping("/produto")
    @ApiOperation(value="Atualiza um produto")
    public Produto atualizarProduto(@RequestBody Produto produto) {
    	return produtoService.atualizarProduto(produto);
    }
    
	
}
