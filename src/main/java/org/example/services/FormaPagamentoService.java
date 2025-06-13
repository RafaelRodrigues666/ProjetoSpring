package org.example.services;

import org.example.entities.FormaPagamento;
import org.example.repositories.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {

    private final FormaPagamentoRepository formaPagamentoRepository;

    @Autowired
    public FormaPagamentoService(FormaPagamentoRepository formaPagamentoRepository) {
        this.formaPagamentoRepository = formaPagamentoRepository;
    }

    public List<FormaPagamento> listarTodos() {
        return formaPagamentoRepository.findAll();
    }

    public FormaPagamento buscarPorId(Long id) {
        return formaPagamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Forma de Pagamento não Encontrada"));
    }

    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return formaPagamentoRepository.save(formaPagamento);
    }

    public void deletar(Long id) {
        formaPagamentoRepository.deleteById(id);
    }
}
