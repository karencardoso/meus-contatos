package com.contatos.meuscontatos.controller;

import com.contatos.meuscontatos.controller.converter.ContatosResourceToContatosConvert;
import com.contatos.meuscontatos.controller.converter.ContatosToContatosResourceConverter;
import com.contatos.meuscontatos.controller.resource.ContatosResource;
import com.contatos.meuscontatos.repository.ContatosRepository;
import com.contatos.meuscontatos.usecase.DeleteContatoUseCase;
import com.contatos.meuscontatos.usecase.FindAllContatosUseCase;
import com.contatos.meuscontatos.usecase.GetContatoByNameUseCase;
import com.contatos.meuscontatos.usecase.SaveOrUpdateContatosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/meus-contatos")
public class MeusContatosController {


    private final ContatosResourceToContatosConvert contatosResourceToContatosConvert;
    private final SaveOrUpdateContatosUseCase saveOrUpdateContatosUseCase;
    private final ContatosToContatosResourceConverter contatosToContatosResourceConverter;
    private final GetContatoByNameUseCase getContatoByNameUseCase;
    private final DeleteContatoUseCase deleteContatoUseCase;
    private final FindAllContatosUseCase findAllContatosUseCase;



    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ContatosResource save(@RequestBody final ContatosResource request) {
        final var contatos = contatosResourceToContatosConvert.convert(request);
        final var useCase = saveOrUpdateContatosUseCase.saveOrUpdate(contatos);
        return contatosToContatosResourceConverter.convert(useCase);

    }

    @GetMapping("/{id}")
    public ContatosResource getContatoById(@PathVariable final String id) {
        final var useCase = getContatoByNameUseCase.execute(id);
        return contatosToContatosResourceConverter.convert(useCase);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ContatosResource updatedContato(@RequestBody final ContatosResource request) {
        final var contatos = contatosResourceToContatosConvert.convert(request);
        final var useCase = saveOrUpdateContatosUseCase.saveOrUpdate(contatos);
        return contatosToContatosResourceConverter.convert(useCase);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteContato(@PathVariable final String id) {
        deleteContatoUseCase.execute(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteContato(@PathVariable final String id,
                              @RequestParam(required = false) final String addressToDelete,
                              @RequestParam(required = false) final String phoneNumberToDelete) {
        deleteContatoUseCase.execute(id, addressToDelete, phoneNumberToDelete);
    }

    @GetMapping
    Page<ContatosResource> listAllContatos(@RequestParam(required = false, defaultValue = "0") Integer page,
                                           @RequestParam(required = false, defaultValue = "10") Integer size) {
        return findAllContatosUseCase.findAll(page, size)
                .map(contatosToContatosResourceConverter::convert);


    }

}
