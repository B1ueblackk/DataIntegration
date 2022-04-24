package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "pri_cust_asset_info", schema = "dm_tmp")
public class PriCustAssetInfo {
    @Id
    private String custNo;
    private String custName;
    private String uid;
    private String belongOrg;
    private String examOrg;
    private BigDecimal allBal;
    private BigDecimal avgMth;
    private BigDecimal avgQur;
    private BigDecimal avgYear;
    private BigDecimal saBal;
    private BigDecimal tdBal;
    private BigDecimal finBal;
    private BigDecimal saCrdBal;
    private BigDecimal tdCrdBal;
    private BigDecimal saTdBal;
    private BigDecimal ntcBal;
    private BigDecimal td3MBal;
    private BigDecimal td6MBal;
    private BigDecimal td1YBal;
    private BigDecimal td2YBal;
    private BigDecimal td3YBal;
    private BigDecimal td5YBal;
    private BigDecimal othTdBal;
    private BigDecimal cdBal;
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
    @Column(name = "all_bal")
    public BigDecimal getAllBal() {
        return allBal;
    }

    public void setAllBal(BigDecimal allBal) {
        this.allBal = allBal;
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
    @Column(name = "sa_bal")
    public BigDecimal getSaBal() {
        return saBal;
    }

    public void setSaBal(BigDecimal saBal) {
        this.saBal = saBal;
    }

    @Basic
    @Column(name = "td_bal")
    public BigDecimal getTdBal() {
        return tdBal;
    }

    public void setTdBal(BigDecimal tdBal) {
        this.tdBal = tdBal;
    }

    @Basic
    @Column(name = "fin_bal")
    public BigDecimal getFinBal() {
        return finBal;
    }

    public void setFinBal(BigDecimal finBal) {
        this.finBal = finBal;
    }

    @Basic
    @Column(name = "sa_crd_bal")
    public BigDecimal getSaCrdBal() {
        return saCrdBal;
    }

    public void setSaCrdBal(BigDecimal saCrdBal) {
        this.saCrdBal = saCrdBal;
    }

    @Basic
    @Column(name = "td_crd_bal")
    public BigDecimal getTdCrdBal() {
        return tdCrdBal;
    }

    public void setTdCrdBal(BigDecimal tdCrdBal) {
        this.tdCrdBal = tdCrdBal;
    }

    @Basic
    @Column(name = "sa_td_bal")
    public BigDecimal getSaTdBal() {
        return saTdBal;
    }

    public void setSaTdBal(BigDecimal saTdBal) {
        this.saTdBal = saTdBal;
    }

    @Basic
    @Column(name = "ntc_bal")
    public BigDecimal getNtcBal() {
        return ntcBal;
    }

    public void setNtcBal(BigDecimal ntcBal) {
        this.ntcBal = ntcBal;
    }

    @Basic
    @Column(name = "td_3m_bal")
    public BigDecimal getTd3MBal() {
        return td3MBal;
    }

    public void setTd3MBal(BigDecimal td3MBal) {
        this.td3MBal = td3MBal;
    }

    @Basic
    @Column(name = "td_6m_bal")
    public BigDecimal getTd6MBal() {
        return td6MBal;
    }

    public void setTd6MBal(BigDecimal td6MBal) {
        this.td6MBal = td6MBal;
    }

    @Basic
    @Column(name = "td_1y_bal")
    public BigDecimal getTd1YBal() {
        return td1YBal;
    }

    public void setTd1YBal(BigDecimal td1YBal) {
        this.td1YBal = td1YBal;
    }

    @Basic
    @Column(name = "td_2y_bal")
    public BigDecimal getTd2YBal() {
        return td2YBal;
    }

    public void setTd2YBal(BigDecimal td2YBal) {
        this.td2YBal = td2YBal;
    }

    @Basic
    @Column(name = "td_3y_bal")
    public BigDecimal getTd3YBal() {
        return td3YBal;
    }

    public void setTd3YBal(BigDecimal td3YBal) {
        this.td3YBal = td3YBal;
    }

    @Basic
    @Column(name = "td_5y_bal")
    public BigDecimal getTd5YBal() {
        return td5YBal;
    }

    public void setTd5YBal(BigDecimal td5YBal) {
        this.td5YBal = td5YBal;
    }

    @Basic
    @Column(name = "oth_td_bal")
    public BigDecimal getOthTdBal() {
        return othTdBal;
    }

    public void setOthTdBal(BigDecimal othTdBal) {
        this.othTdBal = othTdBal;
    }

    @Basic
    @Column(name = "cd_bal")
    public BigDecimal getCdBal() {
        return cdBal;
    }

    public void setCdBal(BigDecimal cdBal) {
        this.cdBal = cdBal;
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
        PriCustAssetInfo that = (PriCustAssetInfo) o;
        return Objects.equals(custNo, that.custNo) && Objects.equals(custName, that.custName) && Objects.equals(uid, that.uid) && Objects.equals(belongOrg, that.belongOrg) && Objects.equals(examOrg, that.examOrg) && Objects.equals(allBal, that.allBal) && Objects.equals(avgMth, that.avgMth) && Objects.equals(avgQur, that.avgQur) && Objects.equals(avgYear, that.avgYear) && Objects.equals(saBal, that.saBal) && Objects.equals(tdBal, that.tdBal) && Objects.equals(finBal, that.finBal) && Objects.equals(saCrdBal, that.saCrdBal) && Objects.equals(tdCrdBal, that.tdCrdBal) && Objects.equals(saTdBal, that.saTdBal) && Objects.equals(ntcBal, that.ntcBal) && Objects.equals(td3MBal, that.td3MBal) && Objects.equals(td6MBal, that.td6MBal) && Objects.equals(td1YBal, that.td1YBal) && Objects.equals(td2YBal, that.td2YBal) && Objects.equals(td3YBal, that.td3YBal) && Objects.equals(td5YBal, that.td5YBal) && Objects.equals(othTdBal, that.othTdBal) && Objects.equals(cdBal, that.cdBal) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custNo, custName, uid, belongOrg, examOrg, allBal, avgMth, avgQur, avgYear, saBal, tdBal, finBal, saCrdBal, tdCrdBal, saTdBal, ntcBal, td3MBal, td6MBal, td1YBal, td2YBal, td3YBal, td5YBal, othTdBal, cdBal, etlDt);
    }
}
