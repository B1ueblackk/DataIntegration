package com.example.dataintegration.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pri_credit_info", schema = "dm_tmp")
public class PriCreditInfo {
    @Id
    private String uid;
    private String creditLevel;

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "credit_level")
    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriCreditInfo that = (PriCreditInfo) o;
        return Objects.equals(uid, that.uid) && Objects.equals(creditLevel, that.creditLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, creditLevel);
    }
}
