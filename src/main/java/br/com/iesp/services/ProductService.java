package br.com.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.server.domain.Produto;
import br.com.server.repositories.ProdutoRepository;

/**
 * @author murilio
 * 
 */
@Service
public class ProdutoService{

    @Autowired
   private ProdutoRepository repository;

    public Produto find(Integer id){
        Optional<Produto> produto = repository.findById(id);
        return produto.orElse(null);
    }

    public List<Produto> all(){
        return repository.findAll();
    }

    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }

    public Produto save(@RequestBody Produto produto){
        return repository.save(produto);
    }

    public Produto update(@RequestBody Produto produto){
        return repository.save(produto);
    }

}