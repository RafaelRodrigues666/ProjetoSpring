package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME_FORNECEDOR", nullable = false, length = 100)
    private String nomeFornecedor;

    @Column(name = "CNPJ", nullable = false, length = 14)
    private Long cnpj;

    @Column(name = "TELEFONE", nullable = false, length = 14)
    private Long telefone;

    public Fornecedor() {
    }

    public Fornecedor(Long id, String nomeFornecedor, Long cnpj, Long telefone) {
        this.id = id;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}
