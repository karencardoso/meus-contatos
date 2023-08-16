package com.contatos.meuscontatos.controller.converter;

import com.contatos.meuscontatos.controller.resource.ContatosResource;
import com.contatos.meuscontatos.domain.Contatos;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ContatosResourceToContatosConvert {

    private final ModelMapper modelMapper;

 public Contatos convert(ContatosResource contatosResource) {
     return modelMapper.map(contatosResource, Contatos.class);
 }
}
