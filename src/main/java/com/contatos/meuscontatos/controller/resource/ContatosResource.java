package com.contatos.meuscontatos.controller.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContatosResource {
    @Id
    private String id;
    private String name;
    private List<AddressResource> address;
    private List<TelephoneResource> phoneNumber;

}
