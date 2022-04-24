package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_huanx_mx", schema = "dm_tmp")
public class DmVTrHuanxMx {
    @Id
    private String tranFlag;
    private String uid;
    private String custName;
    private String acctNo;
    private String tranDate;
    private String tranTime;
    private BigDecimal tranAmt;
    private BigDecimal cacIntcPr;
    private String tranCode;
    private String drCrCode;
    private int payTerm;
    private String tranTellerNo;
    private String intcStrtDate;
    private String intcEndDate;
    private BigDecimal intr;
    private String tranLogNo;
    private String tranType;
    private String dscrpCode;
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
    @Column(name = "cac_intc_pr")
    public BigDecimal getCacIntcPr() {
        return cacIntcPr;
    }

    public void setCacIntcPr(BigDecimal cacIntcPr) {
        this.cacIntcPr = cacIntcPr;
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
    @Column(name = "intc_strt_date")
    public String getIntcStrtDate() {
        return intcStrtDate;
    }

    public void setIntcStrtDate(String intcStrtDate) {
        this.intcStrtDate = intcStrtDate;
    }

    @Basic
    @Column(name = "intc_end_date")
    public String getIntcEndDate() {
        return intcEndDate;
    }

    public void setIntcEndDate(String intcEndDate) {
        this.intcEndDate = intcEndDate;
    }

    @Basic
    @Column(name = "intr")
    public BigDecimal getIntr() {
        return intr;
    }

    public void setIntr(BigDecimal intr) {
        this.intr = intr;
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
        DmVTrHuanxMx that = (DmVTrHuanxMx) o;
        return payTerm == that.payTerm && Objects.equals(tranFlag, that.tranFlag) && Objects.equals(uid, that.uid) && Objects.equals(custName, that.custName) && Objects.equals(acctNo, that.acctNo) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranTime, that.tranTime) && Objects.equals(tranAmt, that.tranAmt) && Objects.equals(cacIntcPr, that.cacIntcPr) && Objects.equals(tranCode, that.tranCode) && Objects.equals(drCrCode, that.drCrCode) && Objects.equals(tranTellerNo, that.tranTellerNo) && Objects.equals(intcStrtDate, that.intcStrtDate) && Objects.equals(intcEndDate, that.intcEndDate) && Objects.equals(intr, that.intr) && Objects.equals(tranLogNo, that.tranLogNo) && Objects.equals(tranType, that.tranType) && Objects.equals(dscrpCode, that.dscrpCode) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranFlag, uid, custName, acctNo, tranDate, tranTime, tranAmt, cacIntcPr, tranCode, drCrCode, payTerm, tranTellerNo, intcStrtDate, intcEndDate, intr, tranLogNo, tranType, dscrpCode, etlDt);
    }
}
