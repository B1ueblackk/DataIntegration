package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_huanb_mx", schema = "dm_tmp")
public class DmVTrHuanbMx {
    @Id
    private String tranFlag;
    private String uid;
    private String custName;
    private String acctNo;
    private String tranDate;
    private String tranTime;
    private BigDecimal tranAmt;
    private BigDecimal bal;
    private String tranCode;
    private String drCrCode;
    private int payTerm;
    private String tranTellerNo;
    private BigDecimal pprdRfnAmt;
    private BigDecimal pprdAmotzIntr;
    private String tranLogNo;
    private String tranType;
    private String dscrpCode;
    private String remark;
    private String etlDt;

    @Basic
    @Column(name = "tran_flag")
    public String getTranFlag() {
        return tranFlag;
    }

    public void setTranFlag(String tranFlag) {
        this.tranFlag = tranFlag;
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
    @Column(name = "cust_name")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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
    @Column(name = "tran_amt")
    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    @Basic
    @Column(name = "bal")
    public BigDecimal getBal() {
        return bal;
    }

    public void setBal(BigDecimal bal) {
        this.bal = bal;
    }

    @Basic
    @Column(name = "tran_code")
    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    @Basic
    @Column(name = "dr_cr_code")
    public String getDrCrCode() {
        return drCrCode;
    }

    public void setDrCrCode(String drCrCode) {
        this.drCrCode = drCrCode;
    }

    @Basic
    @Column(name = "pay_term")
    public int getPayTerm() {
        return payTerm;
    }

    public void setPayTerm(int payTerm) {
        this.payTerm = payTerm;
    }

    @Basic
    @Column(name = "tran_teller_no")
    public String getTranTellerNo() {
        return tranTellerNo;
    }

    public void setTranTellerNo(String tranTellerNo) {
        this.tranTellerNo = tranTellerNo;
    }

    @Basic
    @Column(name = "pprd_rfn_amt")
    public BigDecimal getPprdRfnAmt() {
        return pprdRfnAmt;
    }

    public void setPprdRfnAmt(BigDecimal pprdRfnAmt) {
        this.pprdRfnAmt = pprdRfnAmt;
    }

    @Basic
    @Column(name = "pprd_amotz_intr")
    public BigDecimal getPprdAmotzIntr() {
        return pprdAmotzIntr;
    }

    public void setPprdAmotzIntr(BigDecimal pprdAmotzIntr) {
        this.pprdAmotzIntr = pprdAmotzIntr;
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
    @Column(name = "tran_type")
    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    @Basic
    @Column(name = "dscrp_code")
    public String getDscrpCode() {
        return dscrpCode;
    }

    public void setDscrpCode(String dscrpCode) {
        this.dscrpCode = dscrpCode;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        DmVTrHuanbMx that = (DmVTrHuanbMx) o;
        return payTerm == that.payTerm && Objects.equals(tranFlag, that.tranFlag) && Objects.equals(uid, that.uid) && Objects.equals(custName, that.custName) && Objects.equals(acctNo, that.acctNo) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranTime, that.tranTime) && Objects.equals(tranAmt, that.tranAmt) && Objects.equals(bal, that.bal) && Objects.equals(tranCode, that.tranCode) && Objects.equals(drCrCode, that.drCrCode) && Objects.equals(tranTellerNo, that.tranTellerNo) && Objects.equals(pprdRfnAmt, that.pprdRfnAmt) && Objects.equals(pprdAmotzIntr, that.pprdAmotzIntr) && Objects.equals(tranLogNo, that.tranLogNo) && Objects.equals(tranType, that.tranType) && Objects.equals(dscrpCode, that.dscrpCode) && Objects.equals(remark, that.remark) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranFlag, uid, custName, acctNo, tranDate, tranTime, tranAmt, bal, tranCode, drCrCode, payTerm, tranTellerNo, pprdRfnAmt, pprdAmotzIntr, tranLogNo, tranType, dscrpCode, remark, etlDt);
    }
}
