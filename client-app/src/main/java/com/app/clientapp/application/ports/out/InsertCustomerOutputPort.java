package com.app.clientapp.application.ports.out;

import com.app.clientapp.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
