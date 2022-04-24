package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_grwy_mx", schema = "dm_tmp")
public class DmVTrGrwyMx {
    @Id
    private String uid;
    private String mchChannel;
    private String loginType;
    private String ebankCustNo;
    private String tranDate;
    private String tranTime;
    private String tranCode;
    private String tranSts;
    private String returnCode;
    private String returnMsg;
    private String sysType;
    private String payerAcctNo;
    private String payerAcctName;
    private String payeeAcctNo;
    private String payeeAcctName;
    private BigDecimal tranAmt;
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
    @Column(name = "mch_channel")
    public String getMchChannel() {
        return mchChannel;
    }

    public void setMchChannel(String mchChannel) {
        this.mchChannel = mchChannel;
    }

    @Basic
    @Column(name = "login_type")
    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    @Basic
    @Column(name = "ebank_cust_no")
    public String getEbankCustNo() {
        return ebankCustNo;
    }

    public void setEbankCustNo(String ebankCustNo) {
        this.ebankCustNo = ebankCustNo;
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
    @Column(name = "tran_code")
    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    @Basic
    @Column(name = "tran_sts")
    public String getTranSts() {
        return tranSts;
    }

    public void setTranSts(String tranSts) {
        this.tranSts = tranSts;
    }

    @Basic
    @Column(name = "return_code")
    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @Basic
    @Column(name = "return_msg")
    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    @Basic
    @Column(name = "sys_type")
    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

    @Basic
    @Column(name = "payer_acct_no")
    public String getPayerAcctNo() {
        return payerAcctNo;
    }

    public void setPayerAcctNo(String payerAcctNo) {
        this.payerAcctNo = payerAcctNo;
    }

    @Basic
    @Column(name = "payer_acct_name")
    public String getPayerAcctName() {
        return payerAcctName;
    }

    public void setPayerAcctName(String payerAcctName) {
        this.payerAcctName = payerAcctName;
    }

    @Basic
    @Column(name = "payee_acct_no")
    public String getPayeeAcctNo() {
        return payeeAcctNo;
    }

    public void setPayeeAcctNo(String payeeAcctNo) {
        this.payeeAcctNo = payeeAcctNo;
    }

    @Basic
    @Column(name = "payee_acct_name")
    public String getPayeeAcctName() {
        return payeeAcctName;
    }

    public void setPayeeAcctName(String payeeAcctName) {
        this.payeeAcctName = payeeAcctName;
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
        DmVTrGrwyMx that = (DmVTrGrwyMx) o;
        return Objects.equals(uid, that.uid) && Objects.equals(mchChannel, that.mchChannel) && Objects.equals(loginType, that.loginType) && Objects.equals(ebankCustNo, that.ebankCustNo) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranTime, that.tranTime) && Objects.equals(tranCode, that.tranCode) && Objects.equals(tranSts, that.tranSts) && Objects.equals(returnCode, that.returnCode) && Objects.equals(returnMsg, that.returnMsg) && Objects.equals(sysType, that.sysType) && Objects.equals(payerAcctNo, that.payerAcctNo) && Objects.equals(payerAcctName, that.payerAcctName) && Objects.equals(payeeAcctNo, that.payeeAcctNo) && Objects.equals(payeeAcctName, that.payeeAcctName) && Objects.equals(tranAmt, that.tranAmt) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, mchChannel, loginType, ebankCustNo, tranDate, tranTime, tranCode, tranSts, returnCode, returnMsg, sysType, payerAcctNo, payerAcctName, payeeAcctNo, payeeAcctName, tranAmt, etlDt);
    }
}
