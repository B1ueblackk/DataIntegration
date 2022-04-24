package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_contract_mx", schema = "dm_tmp")
public class DmVTrContractMx {
    @Id
    private String uid;
    private String contractNo;
    private String applyNo;
    private String artificialNo;
    private String occurDate;
    private String loanCustNo;
    private String custName;
    private String bussType;
    private String occurType;
    private String isCreditCyc;
    private String currType;
    private BigDecimal bussAmt;
    private BigDecimal loanPert;
    private int termYear;
    private int termMth;
    private int termDay;
    private String baseRateType;
    private BigDecimal baseRate;
    private String floatType;
    private BigDecimal rateFloat;
    private BigDecimal rate;
    private int payTimes;
    private String payType;
    private String direction;
    private String loanUse;
    private String paySource;
    private String putoutDate;
    private String matuDate;
    private String vouchType;
    private String applyType;
    private int extendTimes;
    private BigDecimal actuOutAmt;
    private BigDecimal bal;
    private BigDecimal normBal;
    private BigDecimal dlayBal;
    private BigDecimal dullBal;
    private BigDecimal owedIntIn;
    private BigDecimal owedIntOut;
    private BigDecimal finePrInt;
    private BigDecimal fineIntrInt;
    private int dlayDays;
    private String fiveClass;
    private String classDate;
    private String mgeOrg;
    private String mgrNo;
    private String operateOrg;
    private String operator;
    private String operateDate;
    private String regOrg;
    private String register;
    private String regDate;
    private String inteSettleType;
    private String isBad;
    private int frzAmt;
    private String conCrlType;
    private String shiftType;
    private int dueIntrDays;
    private String resonType;
    private int shiftBal;
    private String isVcVouch;
    private String loanUseAdd;
    private String finshType;
    private String finshDate;
    private String stsFlag;
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
    @Column(name = "contract_no")
    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    @Basic
    @Column(name = "apply_no")
    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    @Basic
    @Column(name = "artificial_no")
    public String getArtificialNo() {
        return artificialNo;
    }

    public void setArtificialNo(String artificialNo) {
        this.artificialNo = artificialNo;
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
    @Column(name = "occur_type")
    public String getOccurType() {
        return occurType;
    }

    public void setOccurType(String occurType) {
        this.occurType = occurType;
    }

    @Basic
    @Column(name = "is_credit_cyc")
    public String getIsCreditCyc() {
        return isCreditCyc;
    }

    public void setIsCreditCyc(String isCreditCyc) {
        this.isCreditCyc = isCreditCyc;
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
    @Column(name = "loan_pert")
    public BigDecimal getLoanPert() {
        return loanPert;
    }

    public void setLoanPert(BigDecimal loanPert) {
        this.loanPert = loanPert;
    }

    @Basic
    @Column(name = "term_year")
    public int getTermYear() {
        return termYear;
    }

    public void setTermYear(int termYear) {
        this.termYear = termYear;
    }

    @Basic
    @Column(name = "term_mth")
    public int getTermMth() {
        return termMth;
    }

    public void setTermMth(int termMth) {
        this.termMth = termMth;
    }

    @Basic
    @Column(name = "term_day")
    public int getTermDay() {
        return termDay;
    }

    public void setTermDay(int termDay) {
        this.termDay = termDay;
    }

    @Basic
    @Column(name = "base_rate_type")
    public String getBaseRateType() {
        return baseRateType;
    }

    public void setBaseRateType(String baseRateType) {
        this.baseRateType = baseRateType;
    }

    @Basic
    @Column(name = "base_rate")
    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    @Basic
    @Column(name = "float_type")
    public String getFloatType() {
        return floatType;
    }

    public void setFloatType(String floatType) {
        this.floatType = floatType;
    }

    @Basic
    @Column(name = "rate_float")
    public BigDecimal getRateFloat() {
        return rateFloat;
    }

    public void setRateFloat(BigDecimal rateFloat) {
        this.rateFloat = rateFloat;
    }

    @Basic
    @Column(name = "rate")
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
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
    @Column(name = "pay_type")
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "direction")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
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
    @Column(name = "pay_source")
    public String getPaySource() {
        return paySource;
    }

    public void setPaySource(String paySource) {
        this.paySource = paySource;
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
    @Column(name = "vouch_type")
    public String getVouchType() {
        return vouchType;
    }

    public void setVouchType(String vouchType) {
        this.vouchType = vouchType;
    }

    @Basic
    @Column(name = "apply_type")
    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
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
    @Column(name = "actu_out_amt")
    public BigDecimal getActuOutAmt() {
        return actuOutAmt;
    }

    public void setActuOutAmt(BigDecimal actuOutAmt) {
        this.actuOutAmt = actuOutAmt;
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
    @Column(name = "dlay_bal")
    public BigDecimal getDlayBal() {
        return dlayBal;
    }

    public void setDlayBal(BigDecimal dlayBal) {
        this.dlayBal = dlayBal;
    }

    @Basic
    @Column(name = "dull_bal")
    public BigDecimal getDullBal() {
        return dullBal;
    }

    public void setDullBal(BigDecimal dullBal) {
        this.dullBal = dullBal;
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
    @Column(name = "five_class")
    public String getFiveClass() {
        return fiveClass;
    }

    public void setFiveClass(String fiveClass) {
        this.fiveClass = fiveClass;
    }

    @Basic
    @Column(name = "class_date")
    public String getClassDate() {
        return classDate;
    }

    public void setClassDate(String classDate) {
        this.classDate = classDate;
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
    @Column(name = "mgr_no")
    public String getMgrNo() {
        return mgrNo;
    }

    public void setMgrNo(String mgrNo) {
        this.mgrNo = mgrNo;
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
    @Column(name = "operate_date")
    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
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
    @Column(name = "reg_date")
    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "inte_settle_type")
    public String getInteSettleType() {
        return inteSettleType;
    }

    public void setInteSettleType(String inteSettleType) {
        this.inteSettleType = inteSettleType;
    }

    @Basic
    @Column(name = "is_bad")
    public String getIsBad() {
        return isBad;
    }

    public void setIsBad(String isBad) {
        this.isBad = isBad;
    }

    @Basic
    @Column(name = "frz_amt")
    public int getFrzAmt() {
        return frzAmt;
    }

    public void setFrzAmt(int frzAmt) {
        this.frzAmt = frzAmt;
    }

    @Basic
    @Column(name = "con_crl_type")
    public String getConCrlType() {
        return conCrlType;
    }

    public void setConCrlType(String conCrlType) {
        this.conCrlType = conCrlType;
    }

    @Basic
    @Column(name = "shift_type")
    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
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
    @Column(name = "reson_type")
    public String getResonType() {
        return resonType;
    }

    public void setResonType(String resonType) {
        this.resonType = resonType;
    }

    @Basic
    @Column(name = "shift_bal")
    public int getShiftBal() {
        return shiftBal;
    }

    public void setShiftBal(int shiftBal) {
        this.shiftBal = shiftBal;
    }

    @Basic
    @Column(name = "is_vc_vouch")
    public String getIsVcVouch() {
        return isVcVouch;
    }

    public void setIsVcVouch(String isVcVouch) {
        this.isVcVouch = isVcVouch;
    }

    @Basic
    @Column(name = "loan_use_add")
    public String getLoanUseAdd() {
        return loanUseAdd;
    }

    public void setLoanUseAdd(String loanUseAdd) {
        this.loanUseAdd = loanUseAdd;
    }

    @Basic
    @Column(name = "finsh_type")
    public String getFinshType() {
        return finshType;
    }

    public void setFinshType(String finshType) {
        this.finshType = finshType;
    }

    @Basic
    @Column(name = "finsh_date")
    public String getFinshDate() {
        return finshDate;
    }

    public void setFinshDate(String finshDate) {
        this.finshDate = finshDate;
    }

    @Basic
    @Column(name = "sts_flag")
    public String getStsFlag() {
        return stsFlag;
    }

    public void setStsFlag(String stsFlag) {
        this.stsFlag = stsFlag;
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
        DmVTrContractMx that = (DmVTrContractMx) o;
        return termYear == that.termYear && termMth == that.termMth && termDay == that.termDay && payTimes == that.payTimes && extendTimes == that.extendTimes && dlayDays == that.dlayDays && frzAmt == that.frzAmt && dueIntrDays == that.dueIntrDays && shiftBal == that.shiftBal && Objects.equals(uid, that.uid) && Objects.equals(contractNo, that.contractNo) && Objects.equals(applyNo, that.applyNo) && Objects.equals(artificialNo, that.artificialNo) && Objects.equals(occurDate, that.occurDate) && Objects.equals(loanCustNo, that.loanCustNo) && Objects.equals(custName, that.custName) && Objects.equals(bussType, that.bussType) && Objects.equals(occurType, that.occurType) && Objects.equals(isCreditCyc, that.isCreditCyc) && Objects.equals(currType, that.currType) && Objects.equals(bussAmt, that.bussAmt) && Objects.equals(loanPert, that.loanPert) && Objects.equals(baseRateType, that.baseRateType) && Objects.equals(baseRate, that.baseRate) && Objects.equals(floatType, that.floatType) && Objects.equals(rateFloat, that.rateFloat) && Objects.equals(rate, that.rate) && Objects.equals(payType, that.payType) && Objects.equals(direction, that.direction) && Objects.equals(loanUse, that.loanUse) && Objects.equals(paySource, that.paySource) && Objects.equals(putoutDate, that.putoutDate) && Objects.equals(matuDate, that.matuDate) && Objects.equals(vouchType, that.vouchType) && Objects.equals(applyType, that.applyType) && Objects.equals(actuOutAmt, that.actuOutAmt) && Objects.equals(bal, that.bal) && Objects.equals(normBal, that.normBal) && Objects.equals(dlayBal, that.dlayBal) && Objects.equals(dullBal, that.dullBal) && Objects.equals(owedIntIn, that.owedIntIn) && Objects.equals(owedIntOut, that.owedIntOut) && Objects.equals(finePrInt, that.finePrInt) && Objects.equals(fineIntrInt, that.fineIntrInt) && Objects.equals(fiveClass, that.fiveClass) && Objects.equals(classDate, that.classDate) && Objects.equals(mgeOrg, that.mgeOrg) && Objects.equals(mgrNo, that.mgrNo) && Objects.equals(operateOrg, that.operateOrg) && Objects.equals(operator, that.operator) && Objects.equals(operateDate, that.operateDate) && Objects.equals(regOrg, that.regOrg) && Objects.equals(register, that.register) && Objects.equals(regDate, that.regDate) && Objects.equals(inteSettleType, that.inteSettleType) && Objects.equals(isBad, that.isBad) && Objects.equals(conCrlType, that.conCrlType) && Objects.equals(shiftType, that.shiftType) && Objects.equals(resonType, that.resonType) && Objects.equals(isVcVouch, that.isVcVouch) && Objects.equals(loanUseAdd, that.loanUseAdd) && Objects.equals(finshType, that.finshType) && Objects.equals(finshDate, that.finshDate) && Objects.equals(stsFlag, that.stsFlag) && Objects.equals(srcDt, that.srcDt) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, contractNo, applyNo, artificialNo, occurDate, loanCustNo, custName, bussType, occurType, isCreditCyc, currType, bussAmt, loanPert, termYear, termMth, termDay, baseRateType, baseRate, floatType, rateFloat, rate, payTimes, payType, direction, loanUse, paySource, putoutDate, matuDate, vouchType, applyType, extendTimes, actuOutAmt, bal, normBal, dlayBal, dullBal, owedIntIn, owedIntOut, finePrInt, fineIntrInt, dlayDays, fiveClass, classDate, mgeOrg, mgrNo, operateOrg, operator, operateDate, regOrg, register, regDate, inteSettleType, isBad, frzAmt, conCrlType, shiftType, dueIntrDays, resonType, shiftBal, isVcVouch, loanUseAdd, finshType, finshDate, stsFlag, srcDt, etlDt);
    }
}
