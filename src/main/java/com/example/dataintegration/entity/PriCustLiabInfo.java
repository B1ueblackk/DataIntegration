package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "pri_cust_liab_info", schema = "dm_tmp")
public class PriCustLiabInfo {
    @Id
    private String uid;
    private BigDecimal allBal;
    private BigDecimal badBal;
    private BigDecimal dueIntr;
    private BigDecimal normBal;
    private BigDecimal delayBal;
    private String etlDt;

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "all_bal")
    public BigDecimal getAllBal() {
        return allBal;
    }

    public void setAllBal(BigDecimal allBal) {
        this.allBal = allBal;
    }

    @Basic
    @Column(name = "bad_bal")
    public BigDecimal getBadBal() {
        return badBal;
    }

    public void setBadBal(BigDecimal badBal) {
        this.badBal = badBal;
    }

    @Basic
    @Column(name = "due_intr")
    public BigDecimal getDueIntr() {
        return dueIntr;
    }

    public void setDueIntr(BigDecimal dueIntr) {
        this.dueIntr = dueIntr;
    }

    @Basic
    @Column(name = "norm_bal")
    public BigDecimal getNormBal() {
        return normBal;
    }

    public void setNormBal(BigDecimal normBal) {
        this.normBal = normBal;
    }

    @Basic
    @Column(name = "delay_bal")
    public BigDecimal getDelayBal() {
        return delayBal;
    }

    public void setDelayBal(BigDecimal delayBal) {
        this.delayBal = delayBal;
    }

    @Basic
    @Column(name = "etl_dt")
    public String getEtlDt() {
        return etlDt;
    }

    public void setEtlDt(String etlDt) {
        this.etlDt = etlDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriCustLiabInfo that = (PriCustLiabInfo) o;
        return Objects.equals(uid, that.uid) && Objects.equals(allBal, that.allBal) && Objects.equals(badBal, that.badBal) && Objects.equals(dueIntr, that.dueIntr) && Objects.equals(normBal, that.normBal) && Objects.equals(delayBal, that.delayBal) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, allBal, badBal, dueIntr, normBal, delayBal, etlDt);
    }
}
