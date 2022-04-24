package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_gzdf_mx", schema = "dm_tmp")
public class DmVTrGzdfMx {
    @Id
    private String belongOrg;
    private String entAcct;
    private String entName;
    private String engCertNo;
    private String acctNo;
    private String custName;
    private String uid;
    private String tranDate;
    private BigDecimal tranAmt;
    private String tranLogNo;
    private String isSecuCard;
    private String trnaChannel;
    private String batchNo;
    private String etlDt;

    @Basic
    @Column(name = "belong_org")
    public String getBelongOrg() {
        return belongOrg;
    }

    public void setBelongOrg(String belongOrg) {
        this.belongOrg = belongOrg;
    }

    @Basic
    @Column(name = "ent_acct")
    public String getEntAcct() {
        return entAcct;
    }

    public void setEntAcct(String entAcct) {
        this.entAcct = entAcct;
    }

    @Basic
    @Column(name = "ent_name")
    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    @Basic
    @Column(name = "eng_cert_no")
    public String getEngCertNo() {
        return engCertNo;
    }

    public void setEngCertNo(String engCertNo) {
        this.engCertNo = engCertNo;
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
    @Column(name = "tran_date")
    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
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
    @Column(name = "tran_log_no")
    public String getTranLogNo() {
        return tranLogNo;
    }

    public void setTranLogNo(String tranLogNo) {
        this.tranLogNo = tranLogNo;
    }

    @Basic
    @Column(name = "is_secu_card")
    public String getIsSecuCard() {
        return isSecuCard;
    }

    public void setIsSecuCard(String isSecuCard) {
        this.isSecuCard = isSecuCard;
    }

    @Basic
    @Column(name = "trna_channel")
    public String getTrnaChannel() {
        return trnaChannel;
    }

    public void setTrnaChannel(String trnaChannel) {
        this.trnaChannel = trnaChannel;
    }

    @Basic
    @Column(name = "batch_no")
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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
        DmVTrGzdfMx that = (DmVTrGzdfMx) o;
        return Objects.equals(belongOrg, that.belongOrg) && Objects.equals(entAcct, that.entAcct) && Objects.equals(entName, that.entName) && Objects.equals(engCertNo, that.engCertNo) && Objects.equals(acctNo, that.acctNo) && Objects.equals(custName, that.custName) && Objects.equals(uid, that.uid) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranAmt, that.tranAmt) && Objects.equals(tranLogNo, that.tranLogNo) && Objects.equals(isSecuCard, that.isSecuCard) && Objects.equals(trnaChannel, that.trnaChannel) && Objects.equals(batchNo, that.batchNo) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(belongOrg, entAcct, entName, engCertNo, acctNo, custName, uid, tranDate, tranAmt, tranLogNo, isSecuCard, trnaChannel, batchNo, etlDt);
    }
}
