package org.example.entities;

import jakarta.persistence.*;

@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FORMA_PAGAMENTO", nullable = false, length = 50)
    private String formaPagamento;

    @Column(name = "CODIGOFP", nullable = false, length = 100)
    private String codigoFP;

    @Column(name = "TIPO_PAGAMENTO", nullable = false, length = 50)
    private String tipoPagamento;

    @Column(name = "CATEGORIA_PAGAMENTO", nullable = false, length = 50)
    private String categoriaPagamento;

    public FormaPagamento() {
    }

    public FormaPagamento(Long id, String formaPagamento, String codigoFP, String tipoPagamento, String categoriaPagamento) {
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.codigoFP = codigoFP;
        this.tipoPagamento = tipoPagamento;
        this.categoriaPagamento = categoriaPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getCodigoFP() {
        return codigoFP;
    }

    public void setCodigoFP(String codigoFP) {
        this.codigoFP = codigoFP;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getCategoriaPagamento() {
        return categoriaPagamento;
    }

    public void setCategoriaPagamento(String categoriaPagamento) {
        this.categoriaPagamento = categoriaPagamento;
    }
}
