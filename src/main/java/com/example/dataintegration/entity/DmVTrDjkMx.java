package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_djk_mx", schema = "dm_tmp")
public class DmVTrDjkMx {
    @Id
    private String uid;
    private String cardNo;
    private String tranType;
    private String tranTypeDesc;
    private BigDecimal tranAmt;
    private String tranAmtSign;
    private String merType;
    private String merCode;
    private String revInd;
    private String tranDesc;
    private String tranDate;
    private String valDate;
    private String purDate;
    private String tranTime;
    private String acctNo;
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
    @Column(name = "card_no")
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Basic
    @Column(name = "tran_type")
    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    @Basic
    @Column(name = "tran_type_desc")
    public String getTranTypeDesc() {
        return tranTypeDesc;
    }

    public void setTranTypeDesc(String tranTypeDesc) {
        this.tranTypeDesc = tranTypeDesc;
    }

    @Basic
    @Column(name = "tran_amt")
    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    @Basic
    @Column(name = "tran_amt_sign")
    public String getTranAmtSign() {
        return tranAmtSign;
    }

    public void setTranAmtSign(String tranAmtSign) {
        this.tranAmtSign = tranAmtSign;
    }

    @Basic
    @Column(name = "mer_type")
    public String getMerType() {
        return merType;
    }

    public void setMerType(String merType) {
        this.merType = merType;
    }

    @Basic
    @Column(name = "mer_code")
    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode;
    }

    @Basic
    @Column(name = "rev_ind")
    public String getRevInd() {
        return revInd;
    }

    public void setRevInd(String revInd) {
        this.revInd = revInd;
    }

    @Basic
    @Column(name = "tran_desc")
    public String getTranDesc() {
        return tranDesc;
    }

    public void setTranDesc(String tranDesc) {
        this.tranDesc = tranDesc;
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
    @Column(name = "val_date")
    public String getValDate() {
        return valDate;
    }

    public void setValDate(String valDate) {
        this.valDate = valDate;
    }

    @Basic
    @Column(name = "pur_date")
    public String getPurDate() {
        return purDate;
    }

    public void setPurDate(String purDate) {
        this.purDate = purDate;
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
    @Column(name = "acct_no")
    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
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
        DmVTrDjkMx that = (DmVTrDjkMx) o;
        return Objects.equals(uid, that.uid) && Objects.equals(cardNo, that.cardNo) && Objects.equals(tranType, that.tranType) && Objects.equals(tranTypeDesc, that.tranTypeDesc) && Objects.equals(tranAmt, that.tranAmt) && Objects.equals(tranAmtSign, that.tranAmtSign) && Objects.equals(merType, that.merType) && Objects.equals(merCode, that.merCode) && Objects.equals(revInd, that.revInd) && Objects.equals(tranDesc, that.tranDesc) && Objects.equals(tranDate, that.tranDate) && Objects.equals(valDate, that.valDate) && Objects.equals(purDate, that.purDate) && Objects.equals(tranTime, that.tranTime) && Objects.equals(acctNo, that.acctNo) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, cardNo, tranType, tranTypeDesc, tranAmt, tranAmtSign, merType, merCode, revInd, tranDesc, tranDate, valDate, purDate, tranTime, acctNo, etlDt);
    }
}
