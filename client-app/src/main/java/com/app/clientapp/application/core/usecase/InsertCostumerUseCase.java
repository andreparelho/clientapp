package com.app.clientapp.application.core.usecase;

import com.app.clientapp.application.core.domain.Address;
import com.app.clientapp.application.core.domain.Customer;
import com.app.clientapp.application.ports.out.FindAddressByZipCodeOutputPort;
import com.app.clientapp.application.ports.out.InsertCustomerOutputPort;

public class InsertCostumerUseCase {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCostumerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        Address address = this.findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        this.insertCustomerOutputPort.insert(customer);
    }
}
