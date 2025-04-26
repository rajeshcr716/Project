package com.eazbytes.accounts.service.impl;


import com.eazbytes.accounts.constants.AccountsConstants;
import com.eazbytes.accounts.dto.CustomerDto;
import com.eazbytes.accounts.entity.Accounts;
import com.eazbytes.accounts.entity.Customer;
import com.eazbytes.accounts.exception.CustomerAlreadyExistsException;
import com.eazbytes.accounts.mapper.CustomerMapper;
import com.eazbytes.accounts.repository.AccountsRepository;
import com.eazbytes.accounts.repository.CustomerRepository;
import com.eazbytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;


@Service
@AllArgsConstructor
public class AccountsServiceImpl  implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        //updated 5
       Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
        if(optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already registered with given mobileNumber "
                    +customerDto.getMobileNumber());
        }
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer)); // updated 1
    }

    //updated 2
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
}
