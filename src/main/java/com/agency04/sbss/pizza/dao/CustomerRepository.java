package com.agency04.sbss.pizza.dao;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    Customer findByUsername(String username);

    @Modifying
    @Transactional
    @Query("UPDATE Customer c SET c.customerDetails = :updatedCustomerDetails WHERE c.username = :username")
    void updateCustomer(@Param("username") String username,@Param("updatedCustomerDetails") CustomerDetails updatedCustomerDetails);
}
