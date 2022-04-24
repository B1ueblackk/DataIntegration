package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "pri_cust_asset_acct_info", schema = "dm_tmp")
public class PriCustAssetAcctInfo {
    @Id
    private String custNo;
    private String custName;
    private String uid;
    private String acctNo;
    private String cardNo;
    private String currType;
    private String subjectNo;
    private String prodType;
    private String term;
    private int rate;
    private String autoDpFlg;
    private String belongOrg;
    private String examOrg;
    private String openOrg;
    private String openDate;
    private String openTellerNo;
    private String matuDate;
    private String acctChar;
    private String depsType;
    private String prodCode;
    private String clsdOrg;
    private String clsdDate;
    private String clsdTellerNo;
    private String isSecuCard;
    private String acctSts;
    private String frzSts;
    private String stpSts;
    private BigDecimal acctBal;
    private BigDecimal bal;
    private BigDecimal avgMth;
    private BigDecimal avgQur;
    private BigDecimal avgYear;
    private String etlDt;

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
    @Column(name = "curr_type")
    public String getCurrType() {
        return currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
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
    @Column(name = "term")
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Basic
    @Column(name = "rate")
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "auto_dp_flg")
    public String getAutoDpFlg() {
        return autoDpFlg;
    }

    public void setAutoDpFlg(String autoDpFlg) {
        this.autoDpFlg = autoDpFlg;
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
    @Column(name = "open_org")
    public String getOpenOrg() {
        return openOrg;
    }

    public void setOpenOrg(String openOrg) {
        this.openOrg = openOrg;
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
    @Column(name = "open_teller_no")
    public String getOpenTellerNo() {
        return openTellerNo;
    }

    public void setOpenTellerNo(String openTellerNo) {
        this.openTellerNo = openTellerNo;
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
    @Column(name = "acct_char")
    public String getAcctChar() {
        return acctChar;
    }

    public void setAcctChar(String acctChar) {
        this.acctChar = acctChar;
    }

    @Basic
    @Column(name = "deps_type")
    public String getDepsType() {
        return depsType;
    }

    public void setDepsType(String depsType) {
        this.depsType = depsType;
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
    @Column(name = "clsd_org")
    public String getClsdOrg() {
        return clsdOrg;
    }

    public void setClsdOrg(String clsdOrg) {
        this.clsdOrg = clsdOrg;
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
    @Column(name = "clsd_teller_no")
    public String getClsdTellerNo() {
        return clsdTellerNo;
    }

    public void setClsdTellerNo(String clsdTellerNo) {
        this.clsdTellerNo = clsdTellerNo;
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
    @Column(name = "acct_sts")
    public String getAcctSts() {
        return acctSts;
    }

    public void setAcctSts(String acctSts) {
        this.acctSts = acctSts;
    }

    @Basic
    @Column(name = "frz_sts")
    public String getFrzSts() {
        return frzSts;
    }

    public void setFrzSts(String frzSts) {
        this.frzSts = frzSts;
    }

    @Basic
    @Column(name = "stp_sts")
    public String getStpSts() {
        return stpSts;
    }

    public void setStpSts(String stpSts) {
        this.stpSts = stpSts;
    }

    @Basic
    @Column(name = "acct_bal")
    public BigDecimal getAcctBal() {
        return acctBal;
    }

    public void setAcctBal(BigDecimal acctBal) {
        this.acctBal = acctBal;
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
    @Column(name = "avg_mth")
    public BigDecimal getAvgMth() {
        return avgMth;
    }

    public void setAvgMth(BigDecimal avgMth) {
        this.avgMth = avgMth;
    }

    @Basic
    @Column(name = "avg_qur")
    public BigDecimal getAvgQur() {
        return avgQur;
    }

    public void setAvgQur(BigDecimal avgQur) {
        this.avgQur = avgQur;
    }

    @Basic
    @Column(name = "avg_year")
    public BigDecimal getAvgYear() {
        return avgYear;
    }

    public void setAvgYear(BigDecimal avgYear) {
        this.avgYear = avgYear;
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
        PriCustAssetAcctInfo that = (PriCustAssetAcctInfo) o;
        return rate == that.rate && Objects.equals(custNo, that.custNo) && Objects.equals(custName, that.custName) && Objects.equals(uid, that.uid) && Objects.equals(acctNo, that.acctNo) && Objects.equals(cardNo, that.cardNo) && Objects.equals(currType, that.currType) && Objects.equals(subjectNo, that.subjectNo) && Objects.equals(prodType, that.prodType) && Objects.equals(term, that.term) && Objects.equals(autoDpFlg, that.autoDpFlg) && Objects.equals(belongOrg, that.belongOrg) && Objects.equals(examOrg, that.examOrg) && Objects.equals(openOrg, that.openOrg) && Objects.equals(openDate, that.openDate) && Objects.equals(openTellerNo, that.openTellerNo) && Objects.equals(matuDate, that.matuDate) && Objects.equals(acctChar, that.acctChar) && Objects.equals(depsType, that.depsType) && Objects.equals(prodCode, that.prodCode) && Objects.equals(clsdOrg, that.clsdOrg) && Objects.equals(clsdDate, that.clsdDate) && Objects.equals(clsdTellerNo, that.clsdTellerNo) && Objects.equals(isSecuCard, that.isSecuCard) && Objects.equals(acctSts, that.acctSts) && Objects.equals(frzSts, that.frzSts) && Objects.equals(stpSts, that.stpSts) && Objects.equals(acctBal, that.acctBal) && Objects.equals(bal, that.bal) && Objects.equals(avgMth, that.avgMth) && Objects.equals(avgQur, that.avgQur) && Objects.equals(avgYear, that.avgYear) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custNo, custName, uid, acctNo, cardNo, currType, subjectNo, prodType, term, rate, autoDpFlg, belongOrg, examOrg, openOrg, openDate, openTellerNo, matuDate, acctChar, depsType, prodCode, clsdOrg, clsdDate, clsdTellerNo, isSecuCard, acctSts, frzSts, stpSts, acctBal, bal, avgMth, avgQur, avgYear, etlDt);
    }
}
