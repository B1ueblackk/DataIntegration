package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_duebill_mx", schema = "dm_tmp")
public class DmVTrDuebillMx {
    @Id
    private String uid;
    private String acctNo;
    private String receiptNo;
    private String contractNo;
    private String subjectNo;
    private String custNo;
    private String loanCustNo;
    private String custName;
    private String bussType;
    private String currType;
    private BigDecimal bussAmt;
    private String putoutDate;
    private String matuDate;
    private String actuMatuDate;
    private BigDecimal bussRate;
    private BigDecimal actuBussRate;
    private String intrType;
    private String intrCyc;
    private int payTimes;
    private String payCyc;
    private int extendTimes;
    private BigDecimal bal;
    private BigDecimal normBal;
    private BigDecimal dlayAmt;
    private BigDecimal dullAmt;
    private BigDecimal badDebtAmt;
    private BigDecimal owedIntIn;
    private BigDecimal owedIntOut;
    private BigDecimal finePrInt;
    private BigDecimal fineIntrInt;
    private int dlayDays;
    private String payAcct;
    private String putoutAcct;
    private String payBackAcct;
    private int dueIntrDays;
    private String operateOrg;
    private String operator;
    private String regOrg;
    private String register;
    private String occurDate;
    private String loanUse;
    private String payType;
    private String payFreq;
    private String vouchType;
    private String mgrNo;
    private String mgeOrg;
    private String loanChannel;
    private String tenClass;
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
    @Column(name = "acct_no")
    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    @Basic
    @Column(name = "receipt_no")
    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    @Basic
    @Column(name = "contract_no")
    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    @Basic
    @Column(name = "subject_no")
    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    @Basic
    @Column(name = "cust_no")
    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    @Basic
    @Column(name = "loan_cust_no")
    public String getLoanCustNo() {
        return loanCustNo;
    }

    public void setLoanCustNo(String loanCustNo) {
        this.loanCustNo = loanCustNo;
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
    @Column(name = "buss_type")
    public String getBussType() {
        return bussType;
    }

    public void setBussType(String bussType) {
        this.bussType = bussType;
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
    @Column(name = "buss_amt")
    public BigDecimal getBussAmt() {
        return bussAmt;
    }

    public void setBussAmt(BigDecimal bussAmt) {
        this.bussAmt = bussAmt;
    }

    @Basic
    @Column(name = "putout_date")
    public String getPutoutDate() {
        return putoutDate;
    }

    public void setPutoutDate(String putoutDate) {
        this.putoutDate = putoutDate;
    }

    @Basic
    @Column(name = "matu_date")
    public String getMatuDate() {
        return matuDate;
    }

    public void setMatuDate(String matuDate) {
        this.matuDate = matuDate;
    }

    @Basic
    @Column(name = "actu_matu_date")
    public String getActuMatuDate() {
        return actuMatuDate;
    }

    public void setActuMatuDate(String actuMatuDate) {
        this.actuMatuDate = actuMatuDate;
    }

    @Basic
    @Column(name = "buss_rate")
    public BigDecimal getBussRate() {
        return bussRate;
    }

    public void setBussRate(BigDecimal bussRate) {
        this.bussRate = bussRate;
    }

    @Basic
    @Column(name = "actu_buss_rate")
    public BigDecimal getActuBussRate() {
        return actuBussRate;
    }

    public void setActuBussRate(BigDecimal actuBussRate) {
        this.actuBussRate = actuBussRate;
    }

    @Basic
    @Column(name = "intr_type")
    public String getIntrType() {
        return intrType;
    }

    public void setIntrType(String intrType) {
        this.intrType = intrType;
    }

    @Basic
    @Column(name = "intr_cyc")
    public String getIntrCyc() {
        return intrCyc;
    }

    public void setIntrCyc(String intrCyc) {
        this.intrCyc = intrCyc;
    }

    @Basic
    @Column(name = "pay_times")
    public int getPayTimes() {
        return payTimes;
    }

    public void setPayTimes(int payTimes) {
        this.payTimes = payTimes;
    }

    @Basic
    @Column(name = "pay_cyc")
    public String getPayCyc() {
        return payCyc;
    }

    public void setPayCyc(String payCyc) {
        this.payCyc = payCyc;
    }

    @Basic
    @Column(name = "extend_times")
    public int getExtendTimes() {
        return extendTimes;
    }

    public void setExtendTimes(int extendTimes) {
        this.extendTimes = extendTimes;
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
    @Column(name = "norm_bal")
    public BigDecimal getNormBal() {
        return normBal;
    }

    public void setNormBal(BigDecimal normBal) {
        this.normBal = normBal;
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
    @Column(name = "dull_amt")
    public BigDecimal getDullAmt() {
        return dullAmt;
    }

    public void setDullAmt(BigDecimal dullAmt) {
        this.dullAmt = dullAmt;
    }

    @Basic
    @Column(name = "bad_debt_amt")
    public BigDecimal getBadDebtAmt() {
        return badDebtAmt;
    }

    public void setBadDebtAmt(BigDecimal badDebtAmt) {
        this.badDebtAmt = badDebtAmt;
    }

    @Basic
    @Column(name = "owed_int_in")
    public BigDecimal getOwedIntIn() {
        return owedIntIn;
    }

    public void setOwedIntIn(BigDecimal owedIntIn) {
        this.owedIntIn = owedIntIn;
    }

    @Basic
    @Column(name = "owed_int_out")
    public BigDecimal getOwedIntOut() {
        return owedIntOut;
    }

    public void setOwedIntOut(BigDecimal owedIntOut) {
        this.owedIntOut = owedIntOut;
    }

    @Basic
    @Column(name = "fine_pr_int")
    public BigDecimal getFinePrInt() {
        return finePrInt;
    }

    public void setFinePrInt(BigDecimal finePrInt) {
        this.finePrInt = finePrInt;
    }

    @Basic
    @Column(name = "fine_intr_int")
    public BigDecimal getFineIntrInt() {
        return fineIntrInt;
    }

    public void setFineIntrInt(BigDecimal fineIntrInt) {
        this.fineIntrInt = fineIntrInt;
    }

    @Basic
    @Column(name = "dlay_days")
    public int getDlayDays() {
        return dlayDays;
    }

    public void setDlayDays(int dlayDays) {
        this.dlayDays = dlayDays;
    }

    @Basic
    @Column(name = "pay_acct")
    public String getPayAcct() {
        return payAcct;
    }

    public void setPayAcct(String payAcct) {
        this.payAcct = payAcct;
    }

    @Basic
    @Column(name = "putout_acct")
    public String getPutoutAcct() {
        return putoutAcct;
    }

    public void setPutoutAcct(String putoutAcct) {
        this.putoutAcct = putoutAcct;
    }

    @Basic
    @Column(name = "pay_back_acct")
    public String getPayBackAcct() {
        return payBackAcct;
    }

    public void setPayBackAcct(String payBackAcct) {
        this.payBackAcct = payBackAcct;
    }

    @Basic
    @Column(name = "due_intr_days")
    public int getDueIntrDays() {
        return dueIntrDays;
    }

    public void setDueIntrDays(int dueIntrDays) {
        this.dueIntrDays = dueIntrDays;
    }

    @Basic
    @Column(name = "operate_org")
    public String getOperateOrg() {
        return operateOrg;
    }

    public void setOperateOrg(String operateOrg) {
        this.operateOrg = operateOrg;
    }

    @Basic
    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "reg_org")
    public String getRegOrg() {
        return regOrg;
    }

    public void setRegOrg(String regOrg) {
        this.regOrg = regOrg;
    }

    @Basic
    @Column(name = "register")
    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    @Basic
    @Column(name = "occur_date")
    public String getOccurDate() {
        return occurDate;
    }

    public void setOccurDate(String occurDate) {
        this.occurDate = occurDate;
    }

    @Basic
    @Column(name = "loan_use")
    public String getLoanUse() {
        return loanUse;
    }

    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse;
    }

    @Basic
    @Column(name = "pay_type")
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "pay_freq")
    public String getPayFreq() {
        return payFreq;
    }

    public void setPayFreq(String payFreq) {
        this.payFreq = payFreq;
    }

    @Basic
    @Column(name = "vouch_type")
    public String getVouchType() {
        return vouchType;
    }

    public void setVouchType(String vouchType) {
        this.vouchType = vouchType;
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
    @Column(name = "mge_org")
    public String getMgeOrg() {
        return mgeOrg;
    }

    public void setMgeOrg(String mgeOrg) {
        this.mgeOrg = mgeOrg;
    }

    @Basic
    @Column(name = "loan_channel")
    public String getLoanChannel() {
        return loanChannel;
    }

    public void setLoanChannel(String loanChannel) {
        this.loanChannel = loanChannel;
    }

    @Basic
    @Column(name = "ten_class")
    public String getTenClass() {
        return tenClass;
    }

    public void setTenClass(String tenClass) {
        this.tenClass = tenClass;
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
        DmVTrDuebillMx that = (DmVTrDuebillMx) o;
        return payTimes == that.payTimes && extendTimes == that.extendTimes && dlayDays == that.dlayDays && dueIntrDays == that.dueIntrDays && Objects.equals(uid, that.uid) && Objects.equals(acctNo, that.acctNo) && Objects.equals(receiptNo, that.receiptNo) && Objects.equals(contractNo, that.contractNo) && Objects.equals(subjectNo, that.subjectNo) && Objects.equals(custNo, that.custNo) && Objects.equals(loanCustNo, that.loanCustNo) && Objects.equals(custName, that.custName) && Objects.equals(bussType, that.bussType) && Objects.equals(currType, that.currType) && Objects.equals(bussAmt, that.bussAmt) && Objects.equals(putoutDate, that.putoutDate) && Objects.equals(matuDate, that.matuDate) && Objects.equals(actuMatuDate, that.actuMatuDate) && Objects.equals(bussRate, that.bussRate) && Objects.equals(actuBussRate, that.actuBussRate) && Objects.equals(intrType, that.intrType) && Objects.equals(intrCyc, that.intrCyc) && Objects.equals(payCyc, that.payCyc) && Objects.equals(bal, that.bal) && Objects.equals(normBal, that.normBal) && Objects.equals(dlayAmt, that.dlayAmt) && Objects.equals(dullAmt, that.dullAmt) && Objects.equals(badDebtAmt, that.badDebtAmt) && Objects.equals(owedIntIn, that.owedIntIn) && Objects.equals(owedIntOut, that.owedIntOut) && Objects.equals(finePrInt, that.finePrInt) && Objects.equals(fineIntrInt, that.fineIntrInt) && Objects.equals(payAcct, that.payAcct) && Objects.equals(putoutAcct, that.putoutAcct) && Objects.equals(payBackAcct, that.payBackAcct) && Objects.equals(operateOrg, that.operateOrg) && Objects.equals(operator, that.operator) && Objects.equals(regOrg, that.regOrg) && Objects.equals(register, that.register) && Objects.equals(occurDate, that.occurDate) && Objects.equals(loanUse, that.loanUse) && Objects.equals(payType, that.payType) && Objects.equals(payFreq, that.payFreq) && Objects.equals(vouchType, that.vouchType) && Objects.equals(mgrNo, that.mgrNo) && Objects.equals(mgeOrg, that.mgeOrg) && Objects.equals(loanChannel, that.loanChannel) && Objects.equals(tenClass, that.tenClass) && Objects.equals(srcDt, that.srcDt) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, acctNo, receiptNo, contractNo, subjectNo, custNo, loanCustNo, custName, bussType, currType, bussAmt, putoutDate, matuDate, actuMatuDate, bussRate, actuBussRate, intrType, intrCyc, payTimes, payCyc, extendTimes, bal, normBal, dlayAmt, dullAmt, badDebtAmt, owedIntIn, owedIntOut, finePrInt, fineIntrInt, dlayDays, payAcct, putoutAcct, payBackAcct, dueIntrDays, operateOrg, operator, regOrg, register, occurDate, loanUse, payType, payFreq, vouchType, mgrNo, mgeOrg, loanChannel, tenClass, srcDt, etlDt);
    }
}
