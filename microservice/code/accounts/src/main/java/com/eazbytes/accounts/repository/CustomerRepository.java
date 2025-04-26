package com.eazbytes.accounts.repository;


import com.eazbytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //updated 4
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
