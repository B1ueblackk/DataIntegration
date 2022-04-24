package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_as_djk_info", schema = "dm_tmp")
public class DmVAsDjkInfo {
    @Id
    private String acctNo;
    private String cardNo;
    private String custName;
    private String prodCode;
    private String prodName;
    private String uid;
    private String entpName;
    private String openDate;
    private String cardSts;
    private String cardStsName;
    private String cardStsDate;
    private String isWithdrw;
    private String isTransfer;
    private String isDeposit;
    private String isPurchse;
    private BigDecimal credLimit;
    private String mobPhone;
    private BigDecimal deposit;
    private BigDecimal overDraft;
    private BigDecimal dlayAmt;
    private String fiveClass;
    private String bankacct;
    private String bankacctDate;
    private BigDecimal bankacctBal;
    private String isMobBank;
    private String mobBankDate;
    private String isEtc;
    private String etcDate;
    private String issueMode;
    private String issueModeName;
    private BigDecimal bal;
    private String activeDate;
    private String clsdDate;
    private int dlayMths;
    private String mgrNo;
    private String mgrName;
    private String recomName;
    private String mgeOrg;
    private String mgeOrgName;
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
    @Column(name = "prod_code")
    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    @Basic
    @Column(name = "prod_name")
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
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
    @Column(name = "entp_name")
    public String getEntpName() {
        return entpName;
    }

    public void setEntpName(String entpName) {
        this.entpName = entpName;
    }

    @Basic
    @Column(name = "open_date")
    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    @Basic
    @Column(name = "card_sts")
    public String getCardSts() {
        return cardSts;
    }

    public void setCardSts(String cardSts) {
        this.cardSts = cardSts;
    }

    @Basic
    @Column(name = "card_sts_name")
    public String getCardStsName() {
        return cardStsName;
    }

    public void setCardStsName(String cardStsName) {
        this.cardStsName = cardStsName;
    }

    @Basic
    @Column(name = "card_sts_date")
    public String getCardStsDate() {
        return cardStsDate;
    }

    public void setCardStsDate(String cardStsDate) {
        this.cardStsDate = cardStsDate;
    }

    @Basic
    @Column(name = "is_withdrw")
    public String getIsWithdrw() {
        return isWithdrw;
    }

    public void setIsWithdrw(String isWithdrw) {
        this.isWithdrw = isWithdrw;
    }

    @Basic
    @Column(name = "is_transfer")
    public String getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(String isTransfer) {
        this.isTransfer = isTransfer;
    }

    @Basic
    @Column(name = "is_deposit")
    public String getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(String isDeposit) {
        this.isDeposit = isDeposit;
    }

    @Basic
    @Column(name = "is_purchse")
    public String getIsPurchse() {
        return isPurchse;
    }

    public void setIsPurchse(String isPurchse) {
        this.isPurchse = isPurchse;
    }

    @Basic
    @Column(name = "cred_limit")
    public BigDecimal getCredLimit() {
        return credLimit;
    }

    public void setCredLimit(BigDecimal credLimit) {
        this.credLimit = credLimit;
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
    @Column(name = "deposit")
    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    @Basic
    @Column(name = "over_draft")
    public BigDecimal getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(BigDecimal overDraft) {
        this.overDraft = overDraft;
    }

    @Basic
    @Column(name = "dlay_amt")
    public BigDecimal getDlayAmt() {
        return dlayAmt;
    }

    public void setDlayAmt(BigDecimal dlayAmt) {
        this.dlayAmt = dlayAmt;
    }

    @Basic
    @Column(name = "five_class")
    public String getFiveClass() {
        return fiveClass;
    }

    public void setFiveClass(String fiveClass) {
        this.fiveClass = fiveClass;
    }

    @Basic
    @Column(name = "bankacct")
    public String getBankacct() {
        return bankacct;
    }

    public void setBankacct(String bankacct) {
        this.bankacct = bankacct;
    }

    @Basic
    @Column(name = "bankacct_date")
    public String getBankacctDate() {
        return bankacctDate;
    }

    public void setBankacctDate(String bankacctDate) {
        this.bankacctDate = bankacctDate;
    }

    @Basic
    @Column(name = "bankacct_bal")
    public BigDecimal getBankacctBal() {
        return bankacctBal;
    }

    public void setBankacctBal(BigDecimal bankacctBal) {
        this.bankacctBal = bankacctBal;
    }

    @Basic
    @Column(name = "is_mob_bank")
    public String getIsMobBank() {
        return isMobBank;
    }

    public void setIsMobBank(String isMobBank) {
        this.isMobBank = isMobBank;
    }

    @Basic
    @Column(name = "mob_bank_date")
    public String getMobBankDate() {
        return mobBankDate;
    }

    public void setMobBankDate(String mobBankDate) {
        this.mobBankDate = mobBankDate;
    }

    @Basic
    @Column(name = "is_etc")
    public String getIsEtc() {
        return isEtc;
    }

    public void setIsEtc(String isEtc) {
        this.isEtc = isEtc;
    }

    @Basic
    @Column(name = "etc_date")
    public String getEtcDate() {
        return etcDate;
    }

    public void setEtcDate(String etcDate) {
        this.etcDate = etcDate;
    }

    @Basic
    @Column(name = "issue_mode")
    public String getIssueMode() {
        return issueMode;
    }

    public void setIssueMode(String issueMode) {
        this.issueMode = issueMode;
    }

    @Basic
    @Column(name = "issue_mode_name")
    public String getIssueModeName() {
        return issueModeName;
    }

    public void setIssueModeName(String issueModeName) {
        this.issueModeName = issueModeName;
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
    @Column(name = "active_date")
    public String getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    @Basic
    @Column(name = "clsd_date")
    public String getClsdDate() {
        return clsdDate;
    }

    public void setClsdDate(String clsdDate) {
        this.clsdDate = clsdDate;
    }

    @Basic
    @Column(name = "dlay_mths")
    public int getDlayMths() {
        return dlayMths;
    }

    public void setDlayMths(int dlayMths) {
        this.dlayMths = dlayMths;
    }

    @Basic
    @Column(name = "mgr_no")
    public String getMgrNo() {
        return mgrNo;
    }

    public void setMgrNo(String mgrNo) {
        this.mgrNo = mgrNo;
    }

    @Basic
    @Column(name = "mgr_name")
    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    @Basic
    @Column(name = "recom_name")
    public String getRecomName() {
        return recomName;
    }

    public void setRecomName(String recomName) {
        this.recomName = recomName;
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
    @Column(name = "mge_org_name")
    public String getMgeOrgName() {
        return mgeOrgName;
    }

    public void setMgeOrgName(String mgeOrgName) {
        this.mgeOrgName = mgeOrgName;
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
        DmVAsDjkInfo that = (DmVAsDjkInfo) o;
        return dlayMths == that.dlayMths && Objects.equals(acctNo, that.acctNo) && Objects.equals(cardNo, that.cardNo) && Objects.equals(custName, that.custName) && Objects.equals(prodCode, that.prodCode) && Objects.equals(prodName, that.prodName) && Objects.equals(uid, that.uid) && Objects.equals(entpName, that.entpName) && Objects.equals(openDate, that.openDate) && Objects.equals(cardSts, that.cardSts) && Objects.equals(cardStsName, that.cardStsName) && Objects.equals(cardStsDate, that.cardStsDate) && Objects.equals(isWithdrw, that.isWithdrw) && Objects.equals(isTransfer, that.isTransfer) && Objects.equals(isDeposit, that.isDeposit) && Objects.equals(isPurchse, that.isPurchse) && Objects.equals(credLimit, that.credLimit) && Objects.equals(mobPhone, that.mobPhone) && Objects.equals(deposit, that.deposit) && Objects.equals(overDraft, that.overDraft) && Objects.equals(dlayAmt, that.dlayAmt) && Objects.equals(fiveClass, that.fiveClass) && Objects.equals(bankacct, that.bankacct) && Objects.equals(bankacctDate, that.bankacctDate) && Objects.equals(bankacctBal, that.bankacctBal) && Objects.equals(isMobBank, that.isMobBank) && Objects.equals(mobBankDate, that.mobBankDate) && Objects.equals(isEtc, that.isEtc) && Objects.equals(etcDate, that.etcDate) && Objects.equals(issueMode, that.issueMode) && Objects.equals(issueModeName, that.issueModeName) && Objects.equals(bal, that.bal) && Objects.equals(activeDate, that.activeDate) && Objects.equals(clsdDate, that.clsdDate) && Objects.equals(mgrNo, that.mgrNo) && Objects.equals(mgrName, that.mgrName) && Objects.equals(recomName, that.recomName) && Objects.equals(mgeOrg, that.mgeOrg) && Objects.equals(mgeOrgName, that.mgeOrgName) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acctNo, cardNo, custName, prodCode, prodName, uid, entpName, openDate, cardSts, cardStsName, cardStsDate, isWithdrw, isTransfer, isDeposit, isPurchse, credLimit, mobPhone, deposit, overDraft, dlayAmt, fiveClass, bankacct, bankacctDate, bankacctBal, isMobBank, mobBankDate, isEtc, etcDate, issueMode, issueModeName, bal, activeDate, clsdDate, dlayMths, mgrNo, mgrName, recomName, mgeOrg, mgeOrgName, etlDt);
    }
}
