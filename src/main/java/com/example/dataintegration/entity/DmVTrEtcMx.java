package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_etc_mx", schema = "dm_tmp")
public class DmVTrEtcMx {
    @Id
    private String uid;
    private String etcAcct;
    private String cardNo;
    private String carNo;
    private String custName;
    private String tranDate;
    private String tranTime;
    private BigDecimal tranAmtFen;
    private BigDecimal realAmt;
    private BigDecimal concesAmt;
    private String tranPlace;
    private String mobPhone;
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
    @Column(name = "etc_acct")
    public String getEtcAcct() {
        return etcAcct;
    }

    public void setEtcAcct(String etcAcct) {
        this.etcAcct = etcAcct;
    }

    @Basic
    @Column(name = "card_no")
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Basic
    @Column(name = "car_no")
    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    @Basic
    @Column(name = "cust_name")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Basic
    @Column(name = "tran_date")
    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    @Basic
    @Column(name = "tran_time")
    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    @Basic
    @Column(name = "tran_amt_fen")
    public BigDecimal getTranAmtFen() {
        return tranAmtFen;
    }

    public void setTranAmtFen(BigDecimal tranAmtFen) {
        this.tranAmtFen = tranAmtFen;
    }

    @Basic
    @Column(name = "real_amt")
    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    @Basic
    @Column(name = "conces_amt")
    public BigDecimal getConcesAmt() {
        return concesAmt;
    }

    public void setConcesAmt(BigDecimal concesAmt) {
        this.concesAmt = concesAmt;
    }

    @Basic
    @Column(name = "tran_place")
    public String getTranPlace() {
        return tranPlace;
    }

    public void setTranPlace(String tranPlace) {
        this.tranPlace = tranPlace;
    }

    @Basic
    @Column(name = "mob_phone")
    public String getMobPhone() {
        return mobPhone;
    }

    public void setMobPhone(String mobPhone) {
        this.mobPhone = mobPhone;
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
        DmVTrEtcMx that = (DmVTrEtcMx) o;
        return Objects.equals(uid, that.uid) && Objects.equals(etcAcct, that.etcAcct) && Objects.equals(cardNo, that.cardNo) && Objects.equals(carNo, that.carNo) && Objects.equals(custName, that.custName) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranTime, that.tranTime) && Objects.equals(tranAmtFen, that.tranAmtFen) && Objects.equals(realAmt, that.realAmt) && Objects.equals(concesAmt, that.concesAmt) && Objects.equals(tranPlace, that.tranPlace) && Objects.equals(mobPhone, that.mobPhone) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, etcAcct, cardNo, carNo, custName, tranDate, tranTime, tranAmtFen, realAmt, concesAmt, tranPlace, mobPhone, etlDt);
    }
}
