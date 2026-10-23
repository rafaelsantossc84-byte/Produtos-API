package com.example.produtosapi.controller;

import com.example.produtosapi.model.Produto;
import com.example.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // FAZENDO UM CRUD EM UMA APIREST

    //CREATER =
    @PostMapping("/salvarproduto")
    public Produto salvarProduto(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);

        String id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    //READER =
    @GetMapping("/{id}")
    public Produto obterProduto(@PathVariable("id") String id){
        Optional<Produto> pruduto = produtoRepository.findById(id);

        return pruduto.isPresent() ? pruduto.get() : null;
        //A SINTAXE FAZ O EQUIVALENTE DE UM IF/ELSE EM UMA ÚNICA LINHA
        // Interrogação fala pro compilado = Se .isPresent() tiver retorno faça isso
        //Os dois pontos falam = Se não, retorne isso.

        //SEGUNDA FORMA DE FAZER AINDA MAIS RÁPIDO A SEGUIR
        // return produtoRepository.findBy(id).orElse(null);
        // (NÃO UTILIZEI POR NÃO TER DOMÍNIO PLENO DO OPTION)

    }

    //UPDATE =
    //1 - ATUALIZAR =
    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }

    //2 - BUSCAR =
    @GetMapping()
    public List<Produto> buscarProdutos (@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }


    //DELETE =
    @DeleteMapping("/{id}")
    public void deletarDado(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }
}
