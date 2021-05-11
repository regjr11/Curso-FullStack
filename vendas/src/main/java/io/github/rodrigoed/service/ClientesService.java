package io.github.rodrigoed.service;

import io.github.rodrigoed.model.Cliente;
import io.github.rodrigoed.repository.ClientesReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesReporsitory reporsitory;

    @Autowired
    public ClientesService(ClientesReporsitory reporsitory) {
        this.reporsitory = reporsitory;
    }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
    }
    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
