package com.contatos.meuscontatos.usecase.impl;

import com.contatos.meuscontatos.domain.Contatos;
import com.contatos.meuscontatos.gateway.ContatosGateway;
import com.contatos.meuscontatos.repository.ContatosRepository;
import com.contatos.meuscontatos.usecase.FindAllContatosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FindAllContatosUseCaseImpl implements FindAllContatosUseCase {

    private final ContatosGateway contatosGateway;
    @Override
    public Page<Contatos> findAll(Integer page, Integer size) {
        return contatosGateway.findAll(page, size);
    }
}
