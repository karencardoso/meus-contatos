package com.contatos.meuscontatos.usecase.impl;

import com.contatos.meuscontatos.gateway.ContatosGateway;
import com.contatos.meuscontatos.repository.ContatosRepository;
import com.contatos.meuscontatos.usecase.DeleteContatoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class DeleteContatoUseCaseImpl implements DeleteContatoUseCase {

    private final ContatosGateway contatosGateway;

    private ContatosRepository contatosRepository;

    @Override
    public void execute(String id) {
        contatosGateway.delete(id);

    }

    @Override
    public void execute(String id, String addressToDelete, String phoneNumberToDelete) {
        final var contato = contatosRepository.findById(id).orElse(null);
        if (contato != null) {
            if (addressToDelete != null) {
                contato.getAddress().remove(addressToDelete);
            }
            if (phoneNumberToDelete != null) {
                contato.getPhoneNumber().remove(phoneNumberToDelete);
                System.out.println(phoneNumberToDelete);
            }
        }
        contatosRepository.save(contato);
        System.out.println(contato);
    }
}





