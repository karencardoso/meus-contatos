package com.contatos.meuscontatos.usecase;

import com.contatos.meuscontatos.domain.Contatos;
import org.springframework.data.domain.Page;

public interface FindAllContatosUseCase {
    Page<Contatos> findAll(Integer page, Integer size);
}
