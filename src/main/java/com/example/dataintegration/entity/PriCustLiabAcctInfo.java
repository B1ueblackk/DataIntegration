package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "pri_cust_liab_acct_info", schema = "dm_tmp")
public class PriCustLiabAcctInfo {
    @Id
    private String loanCustNo;
    private String acctNo;
    private String belongOrg;
    private String examOrg;
    private String custNo;
    private String custName;
    private String uid;
    private String beginDate;
    private String matuDate;
    private String settleDate;
    private String subjectNo;
    private String prodType;
    private String bussType;
    private String bussTypeName;
    private String loanType;
    private String floatTpename;
    private BigDecimal loanAmt;
    private BigDecimal loanBal;
    private String loanMgrNo;
    private String loanMgrName;
    private String mgrPhone;
    private String vouchType;
    private String putoutChannel;
    private String nextRepayDate;
    private String isMortgage;
    private String isOnline;
    private String isExtend;
    private String extendDate;
    private String extMatuDate;
    private String repayType;
    private String termMth;
    private String fiveClass;
    private String overdueClass;
    private String overdueFlag;
    private String owedIntFlag;
    private String contractNo;
    private BigDecimal creditAmt;
    private String creditBeginDate;
    private String creditMatuDate;
    private BigDecimal frstIntr;
    private BigDecimal actuIntr;
    private String loanMobPhone;
    private String loanUse;
    private String inteSettleType;
    private String bankacct;
    private String defectType;
    private BigDecimal owedIntIn;
    private BigDecimal owedIntOut;
    private BigDecimal delayBal;
    private String industrType;
    private String industrTypeName;
    private String acctSts;
    private String artiCtrtNo;
    private String extCtrtNo;
    private String flstTellerNo;
    private String attractNo;
    private String attractName;
    private String loanUseAdd;
    private String putoutAcct;
    private String isBookAcct;
    private String bookAcctBuss;
    private String bookAcctAmt;
    private String subBussType;
    private String proChar;
    private String proCharOri;
    private String payType;
    private String grntrName;
    private String grntrCertNo;
    private String guarNo;
    private String guarRightNo;
    private String guarName;
    private BigDecimal guarAmount;
    private String guarAdd;
    private BigDecimal guarEvaValue;
    private BigDecimal guarConValue;
    private String guarRegDate;
    private String guarMatuDate;
    private String etlDt;

    @Basic
    @Column(name = "loan_cust_no")
    public String getLoanCustNo() {
        return loanCustNo;
    }

    public void setLoanCustNo(String loanCustNo) {
        this.loanCustNo = loanCustNo;
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
    @Column(name = "belong_org")
    public String getBelongOrg() {
        return belongOrg;
    }

    public void setBelongOrg(String belongOrg) {
        this.belongOrg = belongOrg;
    }

    @Basic
    @Column(name = "exam_org")
    public String getExamOrg() {
        return examOrg;
    }

    public void setExamOrg(String examOrg) {
        this.examOrg = examOrg;
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
    @Column(name = "begin_date")
    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
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
    @Column(name = "settle_date")
    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
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
    @Column(name = "prod_type")
    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
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
    @Column(name = "buss_type_name")
    public String getBussTypeName() {
        return bussTypeName;
    }

    public void setBussTypeName(String bussTypeName) {
        this.bussTypeName = bussTypeName;
    }

    @Basic
    @Column(name = "loan_type")
    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    @Basic
    @Column(name = "float_tpename")
    public String getFloatTpename() {
        return floatTpename;
    }

    public void setFloatTpename(String floatTpename) {
        this.floatTpename = floatTpename;
    }

    @Basic
    @Column(name = "loan_amt")
    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    @Basic
    @Column(name = "loan_bal")
    public BigDecimal getLoanBal() {
        return loanBal;
    }

    public void setLoanBal(BigDecimal loanBal) {
        this.loanBal = loanBal;
    }

    @Basic
    @Column(name = "loan_mgr_no")
    public String getLoanMgrNo() {
        return loanMgrNo;
    }

    public void setLoanMgrNo(String loanMgrNo) {
        this.loanMgrNo = loanMgrNo;
    }

    @Basic
    @Column(name = "loan_mgr_name")
    public String getLoanMgrName() {
        return loanMgrName;
    }

    public void setLoanMgrName(String loanMgrName) {
        this.loanMgrName = loanMgrName;
    }

    @Basic
    @Column(name = "mgr_phone")
    public String getMgrPhone() {
        return mgrPhone;
    }

    public void setMgrPhone(String mgrPhone) {
        this.mgrPhone = mgrPhone;
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
    @Column(name = "putout_channel")
    public String getPutoutChannel() {
        return putoutChannel;
    }

    public void setPutoutChannel(String putoutChannel) {
        this.putoutChannel = putoutChannel;
    }

    @Basic
    @Column(name = "next_repay_date")
    public String getNextRepayDate() {
        return nextRepayDate;
    }

    public void setNextRepayDate(String nextRepayDate) {
        this.nextRepayDate = nextRepayDate;
    }

    @Basic
    @Column(name = "is_mortgage")
    public String getIsMortgage() {
        return isMortgage;
    }

    public void setIsMortgage(String isMortgage) {
        this.isMortgage = isMortgage;
    }

    @Basic
    @Column(name = "is_online")
    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    @Basic
    @Column(name = "is_extend")
    public String getIsExtend() {
        return isExtend;
    }

    public void setIsExtend(String isExtend) {
        this.isExtend = isExtend;
    }

    @Basic
    @Column(name = "extend_date")
    public String getExtendDate() {
        return extendDate;
    }

    public void setExtendDate(String extendDate) {
        this.extendDate = extendDate;
    }

    @Basic
    @Column(name = "ext_matu_date")
    public String getExtMatuDate() {
        return extMatuDate;
    }

    public void setExtMatuDate(String extMatuDate) {
        this.extMatuDate = extMatuDate;
    }

    @Basic
    @Column(name = "repay_type")
    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    @Basic
    @Column(name = "term_mth")
    public String getTermMth() {
        return termMth;
    }

    public void setTermMth(String termMth) {
        this.termMth = termMth;
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
    @Column(name = "overdue_class")
    public String getOverdueClass() {
        return overdueClass;
    }

    public void setOverdueClass(String overdueClass) {
        this.overdueClass = overdueClass;
    }

    @Basic
    @Column(name = "overdue_flag")
    public String getOverdueFlag() {
        return overdueFlag;
    }

    public void setOverdueFlag(String overdueFlag) {
        this.overdueFlag = overdueFlag;
    }

    @Basic
    @Column(name = "owed_int_flag")
    public String getOwedIntFlag() {
        return owedIntFlag;
    }

    public void setOwedIntFlag(String owedIntFlag) {
        this.owedIntFlag = owedIntFlag;
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
    @Column(name = "credit_amt")
    public BigDecimal getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(BigDecimal creditAmt) {
        this.creditAmt = creditAmt;
    }

    @Basic
    @Column(name = "credit_begin_date")
    public String getCreditBeginDate() {
        return creditBeginDate;
    }

    public void setCreditBeginDate(String creditBeginDate) {
        this.creditBeginDate = creditBeginDate;
    }

    @Basic
    @Column(name = "credit_matu_date")
    public String getCreditMatuDate() {
        return creditMatuDate;
    }

    public void setCreditMatuDate(String creditMatuDate) {
        this.creditMatuDate = creditMatuDate;
    }

    @Basic
    @Column(name = "frst_intr")
    public BigDecimal getFrstIntr() {
        return frstIntr;
    }

    public void setFrstIntr(BigDecimal frstIntr) {
        this.frstIntr = frstIntr;
    }

    @Basic
    @Column(name = "actu_intr")
    public BigDecimal getActuIntr() {
        return actuIntr;
    }

    public void setActuIntr(BigDecimal actuIntr) {
        this.actuIntr = actuIntr;
    }

    @Basic
    @Column(name = "loan_mob_phone")
    public String getLoanMobPhone() {
        return loanMobPhone;
    }

    public void setLoanMobPhone(String loanMobPhone) {
        this.loanMobPhone = loanMobPhone;
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
    @Column(name = "inte_settle_type")
    public String getInteSettleType() {
        return inteSettleType;
    }

    public void setInteSettleType(String inteSettleType) {
        this.inteSettleType = inteSettleType;
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
    @Column(name = "defect_type")
    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType;
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
    @Column(name = "delay_bal")
    public BigDecimal getDelayBal() {
        return delayBal;
    }

    public void setDelayBal(BigDecimal delayBal) {
        this.delayBal = delayBal;
    }

    @Basic
    @Column(name = "industr_type")
    public String getIndustrType() {
        return industrType;
    }

    public void setIndustrType(String industrType) {
        this.industrType = industrType;
    }

    @Basic
    @Column(name = "industr_type_name")
    public String getIndustrTypeName() {
        return industrTypeName;
    }

    public void setIndustrTypeName(String industrTypeName) {
        this.industrTypeName = industrTypeName;
    }

    @Basic
    @Column(name = "acct_sts")
    public String getAcctSts() {
        return acctSts;
    }

    public void setAcctSts(String acctSts) {
        this.acctSts = acctSts;
    }

    @Basic
    @Column(name = "arti_ctrt_no")
    public String getArtiCtrtNo() {
        return artiCtrtNo;
    }

    public void setArtiCtrtNo(String artiCtrtNo) {
        this.artiCtrtNo = artiCtrtNo;
    }

    @Basic
    @Column(name = "ext_ctrt_no")
    public String getExtCtrtNo() {
        return extCtrtNo;
    }

    public void setExtCtrtNo(String extCtrtNo) {
        this.extCtrtNo = extCtrtNo;
    }

    @Basic
    @Column(name = "flst_teller_no")
    public String getFlstTellerNo() {
        return flstTellerNo;
    }

    public void setFlstTellerNo(String flstTellerNo) {
        this.flstTellerNo = flstTellerNo;
    }

    @Basic
    @Column(name = "attract_no")
    public String getAttractNo() {
        return attractNo;
    }

    public void setAttractNo(String attractNo) {
        this.attractNo = attractNo;
    }

    @Basic
    @Column(name = "attract_name")
    public String getAttractName() {
        return attractName;
    }

    public void setAttractName(String attractName) {
        this.attractName = attractName;
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
    @Column(name = "putout_acct")
    public String getPutoutAcct() {
        return putoutAcct;
    }

    public void setPutoutAcct(String putoutAcct) {
        this.putoutAcct = putoutAcct;
    }

    @Basic
    @Column(name = "is_book_acct")
    public String getIsBookAcct() {
        return isBookAcct;
    }

    public void setIsBookAcct(String isBookAcct) {
        this.isBookAcct = isBookAcct;
    }

    @Basic
    @Column(name = "book_acct_buss")
    public String getBookAcctBuss() {
        return bookAcctBuss;
    }

    public void setBookAcctBuss(String bookAcctBuss) {
        this.bookAcctBuss = bookAcctBuss;
    }

    @Basic
    @Column(name = "book_acct_amt")
    public String getBookAcctAmt() {
        return bookAcctAmt;
    }

    public void setBookAcctAmt(String bookAcctAmt) {
        this.bookAcctAmt = bookAcctAmt;
    }

    @Basic
    @Column(name = "sub_buss_type")
    public String getSubBussType() {
        return subBussType;
    }

    public void setSubBussType(String subBussType) {
        this.subBussType = subBussType;
    }

    @Basic
    @Column(name = "pro_char")
    public String getProChar() {
        return proChar;
    }

    public void setProChar(String proChar) {
        this.proChar = proChar;
    }

    @Basic
    @Column(name = "pro_char_ori")
    public String getProCharOri() {
        return proCharOri;
    }

    public void setProCharOri(String proCharOri) {
        this.proCharOri = proCharOri;
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
    @Column(name = "grntr_name")
    public String getGrntrName() {
        return grntrName;
    }

    public void setGrntrName(String grntrName) {
        this.grntrName = grntrName;
    }

    @Basic
    @Column(name = "grntr_cert_no")
    public String getGrntrCertNo() {
        return grntrCertNo;
    }

    public void setGrntrCertNo(String grntrCertNo) {
        this.grntrCertNo = grntrCertNo;
    }

    @Basic
    @Column(name = "guar_no")
    public String getGuarNo() {
        return guarNo;
    }

    public void setGuarNo(String guarNo) {
        this.guarNo = guarNo;
    }

    @Basic
    @Column(name = "guar_right_no")
    public String getGuarRightNo() {
        return guarRightNo;
    }

    public void setGuarRightNo(String guarRightNo) {
        this.guarRightNo = guarRightNo;
    }

    @Basic
    @Column(name = "guar_name")
    public String getGuarName() {
        return guarName;
    }

    public void setGuarName(String guarName) {
        this.guarName = guarName;
    }

    @Basic
    @Column(name = "guar_amount")
    public BigDecimal getGuarAmount() {
        return guarAmount;
    }

    public void setGuarAmount(BigDecimal guarAmount) {
        this.guarAmount = guarAmount;
    }

    @Basic
    @Column(name = "guar_add")
    public String getGuarAdd() {
        return guarAdd;
    }

    public void setGuarAdd(String guarAdd) {
        this.guarAdd = guarAdd;
    }

    @Basic
    @Column(name = "guar_eva_value")
    public BigDecimal getGuarEvaValue() {
        return guarEvaValue;
    }

    public void setGuarEvaValue(BigDecimal guarEvaValue) {
        this.guarEvaValue = guarEvaValue;
    }

    @Basic
    @Column(name = "guar_con_value")
    public BigDecimal getGuarConValue() {
        return guarConValue;
    }

    public void setGuarConValue(BigDecimal guarConValue) {
        this.guarConValue = guarConValue;
    }

    @Basic
    @Column(name = "guar_reg_date")
    public String getGuarRegDate() {
        return guarRegDate;
    }

    public void setGuarRegDate(String guarRegDate) {
        this.guarRegDate = guarRegDate;
    }

    @Basic
    @Column(name = "guar_matu_date")
    public String getGuarMatuDate() {
        return guarMatuDate;
    }

    public void setGuarMatuDate(String guarMatuDate) {
        this.guarMatuDate = guarMatuDate;
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
        PriCustLiabAcctInfo that = (PriCustLiabAcctInfo) o;
        return Objects.equals(loanCustNo, that.loanCustNo) && Objects.equals(acctNo, that.acctNo) && Objects.equals(belongOrg, that.belongOrg) && Objects.equals(examOrg, that.examOrg) && Objects.equals(custNo, that.custNo) && Objects.equals(custName, that.custName) && Objects.equals(uid, that.uid) && Objects.equals(beginDate, that.beginDate) && Objects.equals(matuDate, that.matuDate) && Objects.equals(settleDate, that.settleDate) && Objects.equals(subjectNo, that.subjectNo) && Objects.equals(prodType, that.prodType) && Objects.equals(bussType, that.bussType) && Objects.equals(bussTypeName, that.bussTypeName) && Objects.equals(loanType, that.loanType) && Objects.equals(floatTpename, that.floatTpename) && Objects.equals(loanAmt, that.loanAmt) && Objects.equals(loanBal, that.loanBal) && Objects.equals(loanMgrNo, that.loanMgrNo) && Objects.equals(loanMgrName, that.loanMgrName) && Objects.equals(mgrPhone, that.mgrPhone) && Objects.equals(vouchType, that.vouchType) && Objects.equals(putoutChannel, that.putoutChannel) && Objects.equals(nextRepayDate, that.nextRepayDate) && Objects.equals(isMortgage, that.isMortgage) && Objects.equals(isOnline, that.isOnline) && Objects.equals(isExtend, that.isExtend) && Objects.equals(extendDate, that.extendDate) && Objects.equals(extMatuDate, that.extMatuDate) && Objects.equals(repayType, that.repayType) && Objects.equals(termMth, that.termMth) && Objects.equals(fiveClass, that.fiveClass) && Objects.equals(overdueClass, that.overdueClass) && Objects.equals(overdueFlag, that.overdueFlag) && Objects.equals(owedIntFlag, that.owedIntFlag) && Objects.equals(contractNo, that.contractNo) && Objects.equals(creditAmt, that.creditAmt) && Objects.equals(creditBeginDate, that.creditBeginDate) && Objects.equals(creditMatuDate, that.creditMatuDate) && Objects.equals(frstIntr, that.frstIntr) && Objects.equals(actuIntr, that.actuIntr) && Objects.equals(loanMobPhone, that.loanMobPhone) && Objects.equals(loanUse, that.loanUse) && Objects.equals(inteSettleType, that.inteSettleType) && Objects.equals(bankacct, that.bankacct) && Objects.equals(defectType, that.defectType) && Objects.equals(owedIntIn, that.owedIntIn) && Objects.equals(owedIntOut, that.owedIntOut) && Objects.equals(delayBal, that.delayBal) && Objects.equals(industrType, that.industrType) && Objects.equals(industrTypeName, that.industrTypeName) && Objects.equals(acctSts, that.acctSts) && Objects.equals(artiCtrtNo, that.artiCtrtNo) && Objects.equals(extCtrtNo, that.extCtrtNo) && Objects.equals(flstTellerNo, that.flstTellerNo) && Objects.equals(attractNo, that.attractNo) && Objects.equals(attractName, that.attractName) && Objects.equals(loanUseAdd, that.loanUseAdd) && Objects.equals(putoutAcct, that.putoutAcct) && Objects.equals(isBookAcct, that.isBookAcct) && Objects.equals(bookAcctBuss, that.bookAcctBuss) && Objects.equals(bookAcctAmt, that.bookAcctAmt) && Objects.equals(subBussType, that.subBussType) && Objects.equals(proChar, that.proChar) && Objects.equals(proCharOri, that.proCharOri) && Objects.equals(payType, that.payType) && Objects.equals(grntrName, that.grntrName) && Objects.equals(grntrCertNo, that.grntrCertNo) && Objects.equals(guarNo, that.guarNo) && Objects.equals(guarRightNo, that.guarRightNo) && Objects.equals(guarName, that.guarName) && Objects.equals(guarAmount, that.guarAmount) && Objects.equals(guarAdd, that.guarAdd) && Objects.equals(guarEvaValue, that.guarEvaValue) && Objects.equals(guarConValue, that.guarConValue) && Objects.equals(guarRegDate, that.guarRegDate) && Objects.equals(guarMatuDate, that.guarMatuDate) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanCustNo, acctNo, belongOrg, examOrg, custNo, custName, uid, beginDate, matuDate, settleDate, subjectNo, prodType, bussType, bussTypeName, loanType, floatTpename, loanAmt, loanBal, loanMgrNo, loanMgrName, mgrPhone, vouchType, putoutChannel, nextRepayDate, isMortgage, isOnline, isExtend, extendDate, extMatuDate, repayType, termMth, fiveClass, overdueClass, overdueFlag, owedIntFlag, contractNo, creditAmt, creditBeginDate, creditMatuDate, frstIntr, actuIntr, loanMobPhone, loanUse, inteSettleType, bankacct, defectType, owedIntIn, owedIntOut, delayBal, industrType, industrTypeName, acctSts, artiCtrtNo, extCtrtNo, flstTellerNo, attractNo, attractName, loanUseAdd, putoutAcct, isBookAcct, bookAcctBuss, bookAcctAmt, subBussType, proChar, proCharOri, payType, grntrName, grntrCertNo, guarNo, guarRightNo, guarName, guarAmount, guarAdd, guarEvaValue, guarConValue, guarRegDate, guarMatuDate, etlDt);
    }
}
