package com.contatos.meuscontatos.gateway;

import com.contatos.meuscontatos.domain.Contatos;
import org.springframework.data.domain.Page;

public interface ContatosGateway {
    Contatos saveOrUpdate(Contatos contatos);
    Contatos findyById(String id);
    void delete(String id);
    Page<Contatos> findAll(Integer page, Integer size);
}
