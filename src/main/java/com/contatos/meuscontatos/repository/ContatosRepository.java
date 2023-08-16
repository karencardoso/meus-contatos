package com.contatos.meuscontatos.repository;

import com.contatos.meuscontatos.domain.Contatos;
import com.contatos.meuscontatos.repository.model.ContatosDB;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends MongoRepository<ContatosDB, String> {



}
