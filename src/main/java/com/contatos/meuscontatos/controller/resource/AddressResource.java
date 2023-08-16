package com.contatos.meuscontatos.controller.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressResource {
    private String id;
    private String street;
    private String neighborhood;
    private String houseNumber;
    private String addressType;
}
