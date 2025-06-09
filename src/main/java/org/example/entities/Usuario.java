package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Usuario {


    // define que id é um codigo identificador
    @Id
    // começa a gerar números com uma estratégia de identidade
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // define o atributo id como "ID" na tabela
    @Column(name = "ID")
    private Long id;

    // define o atributo nome como "NOME" na tabela
    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    // define o atributo email como "EMAIL" na tabela
    @Column(name = "EMAIL", nullable = false, length = 150)
    private String email;

    // define o atributo senha como "SENHA" na tabela
    @Column(name = "SENHA", nullable = false, length = 100)
    private String senha;

    // cria um construtor sem argumentos
    public Usuario() {
    }

    // cria um construtor com argumentos, para que os atributos tenham valores
    public Usuario(Long id,String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // cria um get para quando precisar desse valor ele retorna
    public Long getId() {
        return id;
    }

    // cria um set para quando um atributo não tiver valor, o utilizador coloque um valor a ele
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
