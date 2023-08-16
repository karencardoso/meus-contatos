package com.contatos.meuscontatos.usecase;

import com.contatos.meuscontatos.domain.Contatos;

public interface SaveOrUpdateContatosUseCase {

    Contatos saveOrUpdate(final Contatos contatos);

}
