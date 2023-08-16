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
public class TelephoneDB {
    @Id
    private String id;
    private String homePhone;
    private String commercialPhone;
    private String phoneForMessage;
}
