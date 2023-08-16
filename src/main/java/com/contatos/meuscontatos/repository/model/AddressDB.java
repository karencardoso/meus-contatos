package com.contatos.meuscontatos.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class AddressDB {
    @Id
    private String id;
    private String street;
    private String neighborhood;
    private String houseNumber;
    private String addressType;
}
