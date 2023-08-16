package com.contatos.meuscontatos.controller.converter;

import com.contatos.meuscontatos.controller.resource.AddressResource;
import com.contatos.meuscontatos.controller.resource.ContatosResource;
import com.contatos.meuscontatos.controller.resource.TelephoneResource;
import com.contatos.meuscontatos.domain.Address;
import com.contatos.meuscontatos.domain.Contatos;
import com.contatos.meuscontatos.domain.Telephone;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class ContatosToContatosResourceConverter {

    public ContatosResource convert(Contatos contatos){
        return ContatosResource
                .builder()
                .id(contatos.getId())
                .address(getAddress(contatos.getAddress()))
                .name(contatos.getName())
                .phoneNumber(getPhones(contatos.getPhoneNumber()))
                .build();
    }

    private List<TelephoneResource> getPhones(List<Telephone> phoneNumber) {
        return phoneNumber
                .stream()
                .map(this::mapToPhones)
                .collect(Collectors.toList());
    }

    private TelephoneResource mapToPhones(Telephone telephone) {
        return TelephoneResource
                .builder()
                .commercialPhone(telephone.getCommercialPhone())
                .homePhone(telephone.getHomePhone())
                .phoneForMessage(telephone.getPhoneForMessage())
                .build();
    }

    private List<AddressResource> getAddress(List<Address> address) {
       return address
               .stream()
               .map(this::mapToAddress)
               .collect(Collectors.toList());
    }

    private AddressResource mapToAddress(Address address) {
        return AddressResource
                .builder()
                .addressType(address.getAddressType())
                .houseNumber(address.getHouseNumber())
                .neighborhood(address.getNeighborhood())
                .street(address.getStreet())
                .build();
    }


}
