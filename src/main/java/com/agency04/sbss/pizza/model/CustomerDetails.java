package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CustomerDetails {

    @Id
    @GeneratedValue
    private Long custumerDetailsId;

    private String firstName;

    private String lastName;

    private String phone;

    public CustomerDetails(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public CustomerDetails() {

    }

    public Long getCustumerDetailsId() {
        return custumerDetailsId;
    }

    public void setCustumerDetailsId(Long custumerDetailsId) {
        this.custumerDetailsId = custumerDetailsId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDetails that = (CustomerDetails) o;
        return Objects.equals(custumerDetailsId, that.custumerDetailsId) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custumerDetailsId, firstName, lastName, phone);
    }
}
