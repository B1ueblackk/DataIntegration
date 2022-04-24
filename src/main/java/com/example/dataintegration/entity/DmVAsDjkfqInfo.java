package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_as_djkfq_info", schema = "dm_tmp")
public class DmVAsDjkfqInfo {
    @Id
    private String acctNo;
    private String cardNo;
    private String custName;
    private String uid;
    private String mobPhone;
    private String mgeOrg;
    private String recomNo;
    private String mpNumber;
    private String mpType;
    private String mpStatus;
    private String purchDate;
    private String purchMth;
    private BigDecimal totalAmt;
    private int totalMths;
    private BigDecimal mthInstl;
    private int instlCnt;
    private BigDecimal remPpl;
    private BigDecimal totalFee;
    private BigDecimal remFee;
    private BigDecimal recFee;
    private String etlDt;

    @Basic
    @Column(name = "acct_no")
    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
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
    @Column(name = "cust_name")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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
    @Column(name = "mge_org")
    public String getMgeOrg() {
        return mgeOrg;
    }

    public void setMgeOrg(String mgeOrg) {
        this.mgeOrg = mgeOrg;
    }

    @Basic
    @Column(name = "recom_no")
    public String getRecomNo() {
        return recomNo;
    }

    public void setRecomNo(String recomNo) {
        this.recomNo = recomNo;
    }

    @Basic
    @Column(name = "mp_number")
    public String getMpNumber() {
        return mpNumber;
    }

    public void setMpNumber(String mpNumber) {
        this.mpNumber = mpNumber;
    }

    @Basic
    @Column(name = "mp_type")
    public String getMpType() {
        return mpType;
    }

    public void setMpType(String mpType) {
        this.mpType = mpType;
    }

    @Basic
    @Column(name = "mp_status")
    public String getMpStatus() {
        return mpStatus;
    }

    public void setMpStatus(String mpStatus) {
        this.mpStatus = mpStatus;
    }

    @Basic
    @Column(name = "purch_date")
    public String getPurchDate() {
        return purchDate;
    }

    public void setPurchDate(String purchDate) {
        this.purchDate = purchDate;
    }

    @Basic
    @Column(name = "purch_mth")
    public String getPurchMth() {
        return purchMth;
    }

    public void setPurchMth(String purchMth) {
        this.purchMth = purchMth;
    }

    @Basic
    @Column(name = "total_amt")
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    @Basic
    @Column(name = "total_mths")
    public int getTotalMths() {
        return totalMths;
    }

    public void setTotalMths(int totalMths) {
        this.totalMths = totalMths;
    }

    @Basic
    @Column(name = "mth_instl")
    public BigDecimal getMthInstl() {
        return mthInstl;
    }

    public void setMthInstl(BigDecimal mthInstl) {
        this.mthInstl = mthInstl;
    }

    @Basic
    @Column(name = "instl_cnt")
    public int getInstlCnt() {
        return instlCnt;
    }

    public void setInstlCnt(int instlCnt) {
        this.instlCnt = instlCnt;
    }

    @Basic
    @Column(name = "rem_ppl")
    public BigDecimal getRemPpl() {
        return remPpl;
    }

    public void setRemPpl(BigDecimal remPpl) {
        this.remPpl = remPpl;
    }

    @Basic
    @Column(name = "total_fee")
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    @Basic
    @Column(name = "rem_fee")
    public BigDecimal getRemFee() {
        return remFee;
    }

    public void setRemFee(BigDecimal remFee) {
        this.remFee = remFee;
    }

    @Basic
    @Column(name = "rec_fee")
    public BigDecimal getRecFee() {
        return recFee;
    }

    public void setRecFee(BigDecimal recFee) {
        this.recFee = recFee;
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
        DmVAsDjkfqInfo that = (DmVAsDjkfqInfo) o;
        return totalMths == that.totalMths && instlCnt == that.instlCnt && Objects.equals(acctNo, that.acctNo) && Objects.equals(cardNo, that.cardNo) && Objects.equals(custName, that.custName) && Objects.equals(uid, that.uid) && Objects.equals(mobPhone, that.mobPhone) && Objects.equals(mgeOrg, that.mgeOrg) && Objects.equals(recomNo, that.recomNo) && Objects.equals(mpNumber, that.mpNumber) && Objects.equals(mpType, that.mpType) && Objects.equals(mpStatus, that.mpStatus) && Objects.equals(purchDate, that.purchDate) && Objects.equals(purchMth, that.purchMth) && Objects.equals(totalAmt, that.totalAmt) && Objects.equals(mthInstl, that.mthInstl) && Objects.equals(remPpl, that.remPpl) && Objects.equals(totalFee, that.totalFee) && Objects.equals(remFee, that.remFee) && Objects.equals(recFee, that.recFee) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acctNo, cardNo, custName, uid, mobPhone, mgeOrg, recomNo, mpNumber, mpType, mpStatus, purchDate, purchMth, totalAmt, totalMths, mthInstl, instlCnt, remPpl, totalFee, remFee, recFee, etlDt);
    }
}
