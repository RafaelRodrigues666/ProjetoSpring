package org.example.services;

import org.example.entities.Fornecedor;
import org.example.exceptions.ResourceNotFoundException;
import org.example.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Fornecedor> listarTodos() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor salvar(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor atualizar(Long id, Fornecedor fornecedorDetails) {
        Fornecedor fornecedor = fornecedorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fornecedor não encontrado com id " + id));

        fornecedor.setNomeFornecedor(fornecedorDetails.getNomeFornecedor());
        fornecedor.setCnpj(fornecedorDetails.getCnpj());
        fornecedor.setTelefone(fornecedorDetails.getTelefone());

        return fornecedorRepository.save(fornecedor);
    }

    public void deletar(Long id) {
        Fornecedor fornecedor = fornecedorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fornecedor não encontrado com id " + id));
        fornecedorRepository.delete(fornecedor);
    }
}
