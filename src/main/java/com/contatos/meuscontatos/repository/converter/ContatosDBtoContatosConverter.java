package com.contatos.meuscontatos.repository.converter;

import com.contatos.meuscontatos.domain.Address;
import com.contatos.meuscontatos.domain.Contatos;
import com.contatos.meuscontatos.domain.Telephone;
import com.contatos.meuscontatos.repository.model.AddressDB;
import com.contatos.meuscontatos.repository.model.ContatosDB;
import com.contatos.meuscontatos.repository.model.TelephoneDB;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
@Document
public class ContatosDBtoContatosConverter {

    public Contatos convert(ContatosDB contatosDB) {
        return Contatos
                .builder()
                .name(contatosDB.getName())
                .address(getAddress(contatosDB.getAddress()))
                .id(contatosDB.getId())
                .phoneNumber(getPhones(contatosDB.getPhoneNumber()))
                .build();
    }

    private List<Telephone> getPhones(List<TelephoneDB> phoneNumber) {
        return phoneNumber
                .stream()
                .map(this::mapToProne)
                .collect(Collectors.toList());
    }

    private Telephone mapToProne(TelephoneDB telephoneDB) {
        return Telephone
                .builder()
                .commercialPhone(telephoneDB.getCommercialPhone())
                .homePhone(telephoneDB.getHomePhone())
                .phoneForMessage(telephoneDB.getPhoneForMessage())
                .build();
    }

    private List<Address> getAddress(List<AddressDB> addresses) {
        return addresses
                .stream()
                .map(this::mapToAddress)
                .collect(Collectors.toList());
    }

    private Address mapToAddress(AddressDB addressDB) {
        return Address.builder()
                .street(addressDB.getStreet())
                .id(addressDB.getId())
                .neighborhood(addressDB.getNeighborhood())
                .houseNumber(addressDB.getHouseNumber())
                .addressType(addressDB.getAddressType())
                .build();
    }
}
