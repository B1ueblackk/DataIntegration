package com.example.dataintegration.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "dm_v_tr_shop_mx", schema = "dm_tmp")
public class DmVTrShopMx {
    @Id
    private String tranChannel;
    private String orderCode;
    private String shopCode;
    private String shopName;
    private String hlwTranType;
    private String tranDate;
    private String tranTime;
    private BigDecimal tranAmt;
    private String currentStatus;
    private BigDecimal scoreNum;
    private String payChannel;
    private String uid;
    private String legalName;
    private String etlDt;

    @Basic
    @Column(name = "tran_channel")
    public String getTranChannel() {
        return tranChannel;
    }

    public void setTranChannel(String tranChannel) {
        this.tranChannel = tranChannel;
    }

    @Basic
    @Column(name = "order_code")
    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    @Basic
    @Column(name = "shop_code")
    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    @Basic
    @Column(name = "shop_name")
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "hlw_tran_type")
    public String getHlwTranType() {
        return hlwTranType;
    }

    public void setHlwTranType(String hlwTranType) {
        this.hlwTranType = hlwTranType;
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
    @Column(name = "tran_time")
    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
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
    @Column(name = "current_status")
    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Basic
    @Column(name = "score_num")
    public BigDecimal getScoreNum() {
        return scoreNum;
    }

    public void setScoreNum(BigDecimal scoreNum) {
        this.scoreNum = scoreNum;
    }

    @Basic
    @Column(name = "pay_channel")
    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
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
    @Column(name = "legal_name")
    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
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
        DmVTrShopMx that = (DmVTrShopMx) o;
        return Objects.equals(tranChannel, that.tranChannel) && Objects.equals(orderCode, that.orderCode) && Objects.equals(shopCode, that.shopCode) && Objects.equals(shopName, that.shopName) && Objects.equals(hlwTranType, that.hlwTranType) && Objects.equals(tranDate, that.tranDate) && Objects.equals(tranTime, that.tranTime) && Objects.equals(tranAmt, that.tranAmt) && Objects.equals(currentStatus, that.currentStatus) && Objects.equals(scoreNum, that.scoreNum) && Objects.equals(payChannel, that.payChannel) && Objects.equals(uid, that.uid) && Objects.equals(legalName, that.legalName) && Objects.equals(etlDt, that.etlDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranChannel, orderCode, shopCode, shopName, hlwTranType, tranDate, tranTime, tranAmt, currentStatus, scoreNum, payChannel, uid, legalName, etlDt);
    }
}
