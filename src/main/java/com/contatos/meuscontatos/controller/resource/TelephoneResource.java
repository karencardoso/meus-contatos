package com.contatos.meuscontatos.controller.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TelephoneResource {
    private String homePhone;
    private String commercialPhone;
    private String phoneForMessage;
}
