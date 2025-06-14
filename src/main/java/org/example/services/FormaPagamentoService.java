package org.example.services;

import org.example.entities.FormaPagamento;
import org.example.exceptions.ResourceNotFoundException;
import org.example.repositories.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaPagamentoService {

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public List<FormaPagamento> listarTodos() {
        return formaPagamentoRepository.findAll();
    }

    public Optional<FormaPagamento> buscarPorId(Long id) {
        return formaPagamentoRepository.findById(id);
    }

    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return formaPagamentoRepository.save(formaPagamento);
    }

    public FormaPagamento atualizar(Long id, FormaPagamento formaPagamentoDetails) {
        FormaPagamento formaPagamento = formaPagamentoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Forma de Pagamento não encontrada com id " + id));

        formaPagamento.setFormaPagamento(formaPagamentoDetails.getFormaPagamento());
        formaPagamento.setCodigoFP(formaPagamentoDetails.getCodigoFP());
        formaPagamento.setTipoPagamento(formaPagamentoDetails.getTipoPagamento());
        formaPagamento.setCategoriaPagamento(formaPagamentoDetails.getCategoriaPagamento());

        return formaPagamentoRepository.save(formaPagamento);
    }

    public void deletar(Long id) {
        FormaPagamento formaPagamento = formaPagamentoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Forma de Pagamento não encontrada com id " + id));
        formaPagamentoRepository.delete(formaPagamento);
    }
}
