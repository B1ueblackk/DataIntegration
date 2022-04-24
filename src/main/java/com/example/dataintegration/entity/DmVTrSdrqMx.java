package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_sdrq_mx", schema = "dm_tmp")
public class DmVTrSdrqMx {
    @Id
    private String hosehldNo;
    private String acctNo;
    private String custName;
    private String tranType;
    private String tranDate;
    private BigDecimal tranAmtFen;
    private String channelFlg;
    private String tranOrg;
    private String tranTellerNo;
    private String tranLogNo;
    private String batchNo;
    private String tranSts;
    private String returnMsg;
    private String etlDt;
    private String uid;

    @Basic
    @Column(name = "hosehld_no")
    public String getHosehldNo() {
        return hosehldNo;
    }

    public void setHosehldNo(String hosehldNo) {
        this.hosehldNo = hosehldNo;
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
    @Column(name = "cust_name")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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
    @Column(name = "tran_date")
    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
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
    @Column(name = "tran_log_no")
    public String getTranLogNo() {
        return tranLogNo;
    }

    public void setTranLogNo(String tranLogNo) {
        this.tranLogNo = tranLogNo;
    }

    @Basic
    @Column(name = "batch_no")
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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
        DmVTrSdrqMx that = (DmVTrSdrqMx) o;
        return Objects.equals(hosehldNo, that.hosehldNo) && Objects.equals(acctNo, that.acctNo) && Objects.equals(custName, that.custName) && Objects.equals(tranType, that.tranType) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranAmtFen, that.tranAmtFen) && Objects.equals(channelFlg, that.channelFlg) && Objects.equals(tranOrg, that.tranOrg) && Objects.equals(tranTellerNo, that.tranTellerNo) && Objects.equals(tranLogNo, that.tranLogNo) && Objects.equals(batchNo, that.batchNo) && Objects.equals(tranSts, that.tranSts) && Objects.equals(returnMsg, that.returnMsg) && Objects.equals(etlDt, that.etlDt) && Objects.equals(uid, that.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hosehldNo, acctNo, custName, tranType, tranDate, tranAmtFen, channelFlg, tranOrg, tranTellerNo, tranLogNo, batchNo, tranSts, returnMsg, etlDt, uid);
    }
}
