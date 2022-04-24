package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_sbyb_mx", schema = "dm_tmp")
public class DmVTrSbybMx {
    @Id
    private String uid;
    private String custName;
    private String tranDate;
    private String tranSts;
    private String tranOrg;
    private String tranTellerNo;
    private BigDecimal tranAmtFen;
    private String tranType;
    private String returnMsg;
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
    @Column(name = "cust_name")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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
    @Column(name = "tran_sts")
    public String getTranSts() {
        return tranSts;
    }

    public void setTranSts(String tranSts) {
        this.tranSts = tranSts;
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
    @Column(name = "tran_amt_fen")
    public BigDecimal getTranAmtFen() {
        return tranAmtFen;
    }

    public void setTranAmtFen(BigDecimal tranAmtFen) {
        this.tranAmtFen = tranAmtFen;
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
    @Column(name = "return_msg")
    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
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
        DmVTrSbybMx that = (DmVTrSbybMx) o;
        return Objects.equals(uid, that.uid) && Objects.equals(custName, that.custName) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranSts, that.tranSts) && Objects.equals(tranOrg, that.tranOrg) && Objects.equals(tranTellerNo, that.tranTellerNo) && Objects.equals(tranAmtFen, that.tranAmtFen) && Objects.equals(tranType, that.tranType) && Objects.equals(returnMsg, that.returnMsg) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, custName, tranDate, tranSts, tranOrg, tranTellerNo, tranAmtFen, tranType, returnMsg, etlDt);
    }
}
