package com.app.clientapp.application.ports.out;

import com.app.clientapp.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
