package com.contatos.meuscontatos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Telephone {
    private String homePhone;
    private String commercialPhone;
    private String phoneForMessage;
}
