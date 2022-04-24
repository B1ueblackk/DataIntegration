package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_dsf_mx", schema = "dm_tmp")
public class DmVTrDsfMx {
    @Id
    private String tranDate;
    private String tranLogNo;
    private String tranCode;
    private String channelFlg;
    private String tranOrg;
    private String tranTellerNo;
    private String dcFlag;
    private BigDecimal tranAmt;
    private String sendBank;
    private String payerOpenBank;
    private String payerAcctNo;
    private String payerName;
    private String payeeOpenBank;
    private String payeeAcctNo;
    private String payeeName;
    private String tranSts;
    private String busiType;
    private String busiSubType;
    private String etlDt;
    private String uid;

    @Basic
    @Column(name = "tran_date")
    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
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
    @Column(name = "tran_code")
    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    @Basic
    @Column(name = "channel_flg")
    public String getChannelFlg() {
        return channelFlg;
    }

    public void setChannelFlg(String channelFlg) {
        this.channelFlg = channelFlg;
    }

    @Basic
    @Column(name = "tran_org")
    public String getTranOrg() {
        return tranOrg;
    }

    public void setTranOrg(String tranOrg) {
        this.tranOrg = tranOrg;
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
    @Column(name = "dc_flag")
    public String getDcFlag() {
        return dcFlag;
    }

    public void setDcFlag(String dcFlag) {
        this.dcFlag = dcFlag;
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
    @Column(name = "send_bank")
    public String getSendBank() {
        return sendBank;
    }

    public void setSendBank(String sendBank) {
        this.sendBank = sendBank;
    }

    @Basic
    @Column(name = "payer_open_bank")
    public String getPayerOpenBank() {
        return payerOpenBank;
    }

    public void setPayerOpenBank(String payerOpenBank) {
        this.payerOpenBank = payerOpenBank;
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
    @Column(name = "payer_name")
    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    @Basic
    @Column(name = "payee_open_bank")
    public String getPayeeOpenBank() {
        return payeeOpenBank;
    }

    public void setPayeeOpenBank(String payeeOpenBank) {
        this.payeeOpenBank = payeeOpenBank;
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
    @Column(name = "payee_name")
    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
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
    @Column(name = "busi_type")
    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    @Basic
    @Column(name = "busi_sub_type")
    public String getBusiSubType() {
        return busiSubType;
    }

    public void setBusiSubType(String busiSubType) {
        this.busiSubType = busiSubType;
    }

    @Basic
    @Column(name = "etl_dt")
    public String getEtlDt() {
        return etlDt;
    }

    public void setEtlDt(String etlDt) {
        this.etlDt = etlDt;
    }

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmVTrDsfMx that = (DmVTrDsfMx) o;
        return Objects.equals(tranDate, that.tranDate) && Objects.equals(tranLogNo, that.tranLogNo) && Objects.equals(tranCode, that.tranCode) && Objects.equals(channelFlg, that.channelFlg) && Objects.equals(tranOrg, that.tranOrg) && Objects.equals(tranTellerNo, that.tranTellerNo) && Objects.equals(dcFlag, that.dcFlag) && Objects.equals(tranAmt, that.tranAmt) && Objects.equals(sendBank, that.sendBank) && Objects.equals(payerOpenBank, that.payerOpenBank) && Objects.equals(payerAcctNo, that.payerAcctNo) && Objects.equals(payerName, that.payerName) && Objects.equals(payeeOpenBank, that.payeeOpenBank) && Objects.equals(payeeAcctNo, that.payeeAcctNo) && Objects.equals(payeeName, that.payeeName) && Objects.equals(tranSts, that.tranSts) && Objects.equals(busiType, that.busiType) && Objects.equals(busiSubType, that.busiSubType) && Objects.equals(etlDt, that.etlDt) && Objects.equals(uid, that.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranDate, tranLogNo, tranCode, channelFlg, tranOrg, tranTellerNo, dcFlag, tranAmt, sendBank, payerOpenBank, payerAcctNo, payerName, payeeOpenBank, payeeAcctNo, payeeName, tranSts, busiType, busiSubType, etlDt, uid);
    }
}
