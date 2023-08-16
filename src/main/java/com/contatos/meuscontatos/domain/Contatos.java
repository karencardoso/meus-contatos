package com.contatos.meuscontatos.domain;

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
public class Contatos {

    private String id;
    private String name;
    private List<Address> address;
    private List<Telephone> phoneNumber;

}
