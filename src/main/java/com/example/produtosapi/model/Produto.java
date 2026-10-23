package com.example.produtosapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto") //DIRECIONA PARA A TABELA COM O NOME CORRETO DENTRO DO BANCO DE DADOS
public class Produto {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "nome")
    // "@Column" LIGA PARA A COLUNA CERTA DO BANCO DE DADOS
    // SÓ É NECESSÁRIO USAR SE AS COLNAS DO BANCO DE DADOS TIVEREM NOME DIFERENTE DOS ATRIBUTOS
    // USANDO AGORA PARA DEMONSTRAR COMO FAZER
    private String nome;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "descricao")
    private String descricao;

    private String tipo;

    public Produto(String nome, Double preco, String descicao, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descicao;
        this.tipo = tipo;
    }

    public Produto() {

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descicao) {
        this.descricao = descicao;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
