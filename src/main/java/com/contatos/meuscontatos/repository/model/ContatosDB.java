package com.contatos.meuscontatos.repository.model;

import com.contatos.meuscontatos.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class ContatosDB {
    @Id
    private String id;
    private String name;
    private List<AddressDB> address;
    private List<TelephoneDB> phoneNumber;

}
