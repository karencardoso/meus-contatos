package com.contatos.meuscontatos.usecase.impl;

import com.contatos.meuscontatos.domain.Contatos;
import com.contatos.meuscontatos.gateway.ContatosGateway;
import com.contatos.meuscontatos.usecase.GetContatoByNameUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetContatoByNameUseCaseImpl implements GetContatoByNameUseCase {

    private final ContatosGateway contatosGateway;
    @Override
    public Contatos execute(String id) {
        return contatosGateway.findyById(id);
    }
}
