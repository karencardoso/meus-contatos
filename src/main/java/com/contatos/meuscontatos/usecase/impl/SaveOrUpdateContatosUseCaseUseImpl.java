package com.contatos.meuscontatos.usecase.impl;

import com.contatos.meuscontatos.domain.Contatos;
import com.contatos.meuscontatos.gateway.ContatosGateway;
import com.contatos.meuscontatos.usecase.SaveOrUpdateContatosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveOrUpdateContatosUseCaseUseImpl implements SaveOrUpdateContatosUseCase {

    private final ContatosGateway contatosGateway;
    @Override
    public Contatos saveOrUpdate(Contatos contatos) {
        return contatosGateway.saveOrUpdate(contatos);
    }
}
