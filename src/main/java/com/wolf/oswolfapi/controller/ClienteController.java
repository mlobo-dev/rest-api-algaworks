package com.wolf.oswolfapi.controller;

import com.wolf.oswolfapi.model.Cliente;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Api(tags = "Clientes")
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("João 2");
        cliente.setTelefone("4564465465");
        cliente.setEmail("email@mail.com");
        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("maria");
        cliente2.setTelefone("4564465465");
        cliente2.setEmail("email@mail.com");


        return Arrays.asList(cliente, cliente2);
    }
}
