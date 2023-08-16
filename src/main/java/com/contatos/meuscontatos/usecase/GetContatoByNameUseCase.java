package com.contatos.meuscontatos.usecase;

import com.contatos.meuscontatos.domain.Contatos;

public interface GetContatoByNameUseCase {
    Contatos execute(String id);
}
