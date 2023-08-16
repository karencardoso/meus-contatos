package com.contatos.meuscontatos.gateway.impl;

import com.contatos.meuscontatos.domain.Contatos;
import com.contatos.meuscontatos.gateway.ContatosGateway;
import com.contatos.meuscontatos.repository.ContatosRepository;
import com.contatos.meuscontatos.repository.converter.ContatosDBtoContatosConverter;
import com.contatos.meuscontatos.repository.converter.ContatosToContatosDBconverter;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class ContatosGatewayImpl implements ContatosGateway {

    private final ContatosRepository contatosRepository;
    private final ContatosToContatosDBconverter contatosToContatosDBconverter;
    private final ContatosDBtoContatosConverter contatosDBtoContatosConverter;

    @Override
    public Contatos saveOrUpdate(Contatos contatos) {
        final var contatosDB = contatosToContatosDBconverter.convert(contatos);
        final var contatosDbtoContatos = contatosRepository.save(contatosDB);
         return contatosDBtoContatosConverter.convert(contatosDbtoContatos);
    }

    @Override
    public Contatos findyById(String id) {
         return contatosRepository.findById(id)
                 .map(contatosDBtoContatosConverter::convert)
                 .orElseGet(() -> Contatos.builder().build());
    }

    @Override
    public void delete(String id) {
        contatosRepository.deleteById(id);

    }

    @Override
    public Page<Contatos> findAll(Integer page, Integer size) {
        return contatosRepository.findAll(PageRequest.of(page, size))
                .map(contatosDBtoContatosConverter::convert);

    }

}
