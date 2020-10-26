package com.wolf.oswolfapi.service;

import com.wolf.oswolfapi.model.Cliente;
import com.wolf.oswolfapi.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.wolf.oswolfapi.utils.StringValidator.isNullOrEmpty;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;


    public List<Cliente> listarTudo() {
        return repository.findAll();
    }

    public Cliente buscarPeloId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id, "Cliente"));
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente editar(Cliente cliente) {
        Cliente salvo = buscarPeloId(cliente.getId());
        salvo.setEmail(!isNullOrEmpty(cliente.getEmail()) ? cliente.getEmail() : salvo.getEmail());
        salvo.setNome(!isNullOrEmpty(cliente.getNome()) ? cliente.getNome() : salvo.getNome());
        salvo.setTelefone(!isNullOrEmpty(cliente.getTelefone()) ? cliente.getTelefone() : salvo.getTelefone());
        return salvar(cliente);
    }


    public void deletarPeloId(Long id) {
        repository.deleteById(id);
    }
}
