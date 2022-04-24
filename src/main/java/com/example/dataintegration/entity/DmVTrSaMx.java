package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_sa_mx", schema = "dm_tmp")
public class DmVTrSaMx {
    @Id
    private String uid;
    private String cardNo;
    private String custName;
    private String acctNo;
    private int detN;
    private String currType;
    private String tranTellerNo;
    private BigDecimal crAmt;
    private BigDecimal bal;
    private BigDecimal tranAmt;
    private String tranCardNo;
    private String tranType;
    private String tranLogNo;
    private BigDecimal drAmt;
    private String openOrg;
    private String dscrpCode;
    private String remark;
    private String tranTime;
    private String tranDate;
    private Date tranDateDate;
    private String sysDate;
    private String tranCode;
    private String remark1;
    private String oppoCustName;
    private String agtCertType;
    private String agtCertNo;
    private String agtCustName;
    private String channelFlag;
    private String oppoAcctNo;
    private String oppoBankNo;
    private String srcDt;
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
    @Column(name = "det_n")
    public int getDetN() {
        return detN;
    }

    public void setDetN(int detN) {
        this.detN = detN;
    }

    @Basic
    @Column(name = "curr_type")
    public String getCurrType() {
        return currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
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
    @Column(name = "cr_amt")
    public BigDecimal getCrAmt() {
        return crAmt;
    }

    public void setCrAmt(BigDecimal crAmt) {
        this.crAmt = crAmt;
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
    @Column(name = "tran_amt")
    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    @Basic
    @Column(name = "tran_card_no")
    public String getTranCardNo() {
        return tranCardNo;
    }

    public void setTranCardNo(String tranCardNo) {
        this.tranCardNo = tranCardNo;
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
    @Column(name = "tran_log_no")
    public String getTranLogNo() {
        return tranLogNo;
    }

    public void setTranLogNo(String tranLogNo) {
        this.tranLogNo = tranLogNo;
    }

    @Basic
    @Column(name = "dr_amt")
    public BigDecimal getDrAmt() {
        return drAmt;
    }

    public void setDrAmt(BigDecimal drAmt) {
        this.drAmt = drAmt;
    }

    @Basic
    @Column(name = "open_org")
    public String getOpenOrg() {
        return openOrg;
    }

    public void setOpenOrg(String openOrg) {
        this.openOrg = openOrg;
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
    @Column(name = "tran_time")
    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
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
    @Column(name = "tran_date_date")
    public Date getTranDateDate() {
        return tranDateDate;
    }

    public void setTranDateDate(Date tranDateDate) {
        this.tranDateDate = tranDateDate;
    }

    @Basic
    @Column(name = "sys_date")
    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
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
    @Column(name = "remark_1")
    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    @Basic
    @Column(name = "oppo_cust_name")
    public String getOppoCustName() {
        return oppoCustName;
    }

    public void setOppoCustName(String oppoCustName) {
        this.oppoCustName = oppoCustName;
    }

    @Basic
    @Column(name = "agt_cert_type")
    public String getAgtCertType() {
        return agtCertType;
    }

    public void setAgtCertType(String agtCertType) {
        this.agtCertType = agtCertType;
    }

    @Basic
    @Column(name = "agt_cert_no")
    public String getAgtCertNo() {
        return agtCertNo;
    }

    public void setAgtCertNo(String agtCertNo) {
        this.agtCertNo = agtCertNo;
    }

    @Basic
    @Column(name = "agt_cust_name")
    public String getAgtCustName() {
        return agtCustName;
    }

    public void setAgtCustName(String agtCustName) {
        this.agtCustName = agtCustName;
    }

    @Basic
    @Column(name = "channel_flag")
    public String getChannelFlag() {
        return channelFlag;
    }

    public void setChannelFlag(String channelFlag) {
        this.channelFlag = channelFlag;
    }

    @Basic
    @Column(name = "oppo_acct_no")
    public String getOppoAcctNo() {
        return oppoAcctNo;
    }

    public void setOppoAcctNo(String oppoAcctNo) {
        this.oppoAcctNo = oppoAcctNo;
    }

    @Basic
    @Column(name = "oppo_bank_no")
    public String getOppoBankNo() {
        return oppoBankNo;
    }

    public void setOppoBankNo(String oppoBankNo) {
        this.oppoBankNo = oppoBankNo;
    }

    @Basic
    @Column(name = "src_dt")
    public String getSrcDt() {
        return srcDt;
    }

    public void setSrcDt(String srcDt) {
        this.srcDt = srcDt;
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
        DmVTrSaMx dmVTrSaMx = (DmVTrSaMx) o;
        return detN == dmVTrSaMx.detN && Objects.equals(uid, dmVTrSaMx.uid) && Objects.equals(cardNo, dmVTrSaMx.cardNo) && Objects.equals(custName, dmVTrSaMx.custName) && Objects.equals(acctNo, dmVTrSaMx.acctNo) && Objects.equals(currType, dmVTrSaMx.currType) && Objects.equals(tranTellerNo, dmVTrSaMx.tranTellerNo) && Objects.equals(crAmt, dmVTrSaMx.crAmt) && Objects.equals(bal, dmVTrSaMx.bal) && Objects.equals(tranAmt, dmVTrSaMx.tranAmt) && Objects.equals(tranCardNo, dmVTrSaMx.tranCardNo) && Objects.equals(tranType, dmVTrSaMx.tranType) && Objects.equals(tranLogNo, dmVTrSaMx.tranLogNo) && Objects.equals(drAmt, dmVTrSaMx.drAmt) && Objects.equals(openOrg, dmVTrSaMx.openOrg) && Objects.equals(dscrpCode, dmVTrSaMx.dscrpCode) && Objects.equals(remark, dmVTrSaMx.remark) && Objects.equals(tranTime, dmVTrSaMx.tranTime) && Objects.equals(tranDate, dmVTrSaMx.tranDate) && Objects.equals(tranDateDate, dmVTrSaMx.tranDateDate) && Objects.equals(sysDate, dmVTrSaMx.sysDate) && Objects.equals(tranCode, dmVTrSaMx.tranCode) && Objects.equals(remark1, dmVTrSaMx.remark1) && Objects.equals(oppoCustName, dmVTrSaMx.oppoCustName) && Objects.equals(agtCertType, dmVTrSaMx.agtCertType) && Objects.equals(agtCertNo, dmVTrSaMx.agtCertNo) && Objects.equals(agtCustName, dmVTrSaMx.agtCustName) && Objects.equals(channelFlag, dmVTrSaMx.channelFlag) && Objects.equals(oppoAcctNo, dmVTrSaMx.oppoAcctNo) && Objects.equals(oppoBankNo, dmVTrSaMx.oppoBankNo) && Objects.equals(srcDt, dmVTrSaMx.srcDt) && Objects.equals(etlDt, dmVTrSaMx.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, cardNo, custName, acctNo, detN, currType, tranTellerNo, crAmt, bal, tranAmt, tranCardNo, tranType, tranLogNo, drAmt, openOrg, dscrpCode, remark, tranTime, tranDate, tranDateDate, sysDate, tranCode, remark1, oppoCustName, agtCertType, agtCertNo, agtCustName, channelFlag, oppoAcctNo, oppoBankNo, srcDt, etlDt);
    }
}
