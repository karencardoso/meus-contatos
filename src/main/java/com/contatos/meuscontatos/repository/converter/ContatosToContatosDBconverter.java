package com.contatos.meuscontatos.repository.converter;

import com.contatos.meuscontatos.domain.Contatos;
import com.contatos.meuscontatos.repository.model.ContatosDB;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ContatosToContatosDBconverter {

    private final ModelMapper modelMapper;

    public ContatosDB convert(Contatos contatos){
        return modelMapper.map(contatos, ContatosDB.class);
    }
}
