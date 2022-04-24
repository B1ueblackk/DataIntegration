package com.example.dataintegration.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pri_cust_contact_info", schema = "bank")
public class PriCustContactInfo {
    @Id
    private String uid;
    private String contactPhone;
    private String contactAddress;

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "contact_phone")
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Basic
    @Column(name = "contact_address")
    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriCustContactInfo that = (PriCustContactInfo) o;
        return Objects.equals(uid, that.uid) && Objects.equals(contactPhone, that.contactPhone) && Objects.equals(contactAddress, that.contactAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, contactPhone, contactAddress);
    }
}
