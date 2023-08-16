package com.contatos.meuscontatos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String id;
    private String street;
    private String neighborhood;
    private String houseNumber;
    private String addressType;

}
