package com.example.dataintegration.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pri_cust_base_info", schema = "dm_tmp")
public class PriCustBaseInfo {
    @Id
    private String uid;
    private String certType;
    private String custNo;
    private String custName;
    private String sex;
    private String birthday;
    private String cerExpdDate;
    private String marrige;
    private String education;
    private String homePhone;
    private String mobPhone;
    private String homeAdd;
    private String regAdd;
    private String career;
    private String profTitl;
    private String country;
    private String isEmployee;
    private String isShareholder;
    private String isBlack;
    private String isContact;
    private String mgrName;
    private String mgrNo;
    private String mgeOrgName;
    private String mgeOrg;
    private String createDate;
    private String openOrg;
    private String openTellerNo;
    private String updateDate;
    private String updateOrg;
    private String updateTellerNo;
    private String etlDt;
    private String isMgrDep;

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "cert_type")
    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
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
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "cer_expd_date")
    public String getCerExpdDate() {
        return cerExpdDate;
    }

    public void setCerExpdDate(String cerExpdDate) {
        this.cerExpdDate = cerExpdDate;
    }

    @Basic
    @Column(name = "marrige")
    public String getMarrige() {
        return marrige;
    }

    public void setMarrige(String marrige) {
        this.marrige = marrige;
    }

    @Basic
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "home_phone")
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
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
    @Column(name = "home_add")
    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd;
    }

    @Basic
    @Column(name = "reg_add")
    public String getRegAdd() {
        return regAdd;
    }

    public void setRegAdd(String regAdd) {
        this.regAdd = regAdd;
    }

    @Basic
    @Column(name = "career")
    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Basic
    @Column(name = "prof_titl")
    public String getProfTitl() {
        return profTitl;
    }

    public void setProfTitl(String profTitl) {
        this.profTitl = profTitl;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "is_employee")
    public String getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(String isEmployee) {
        this.isEmployee = isEmployee;
    }

    @Basic
    @Column(name = "is_shareholder")
    public String getIsShareholder() {
        return isShareholder;
    }

    public void setIsShareholder(String isShareholder) {
        this.isShareholder = isShareholder;
    }

    @Basic
    @Column(name = "is_black")
    public String getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(String isBlack) {
        this.isBlack = isBlack;
    }

    @Basic
    @Column(name = "is_contact")
    public String getIsContact() {
        return isContact;
    }

    public void setIsContact(String isContact) {
        this.isContact = isContact;
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
    @Column(name = "mgr_no")
    public String getMgrNo() {
        return mgrNo;
    }

    public void setMgrNo(String mgrNo) {
        this.mgrNo = mgrNo;
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
    @Column(name = "mge_org")
    public String getMgeOrg() {
        return mgeOrg;
    }

    public void setMgeOrg(String mgeOrg) {
        this.mgeOrg = mgeOrg;
    }

    @Basic
    @Column(name = "create_date")
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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
    @Column(name = "open_teller_no")
    public String getOpenTellerNo() {
        return openTellerNo;
    }

    public void setOpenTellerNo(String openTellerNo) {
        this.openTellerNo = openTellerNo;
    }

    @Basic
    @Column(name = "update_date")
    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "update_org")
    public String getUpdateOrg() {
        return updateOrg;
    }

    public void setUpdateOrg(String updateOrg) {
        this.updateOrg = updateOrg;
    }

    @Basic
    @Column(name = "update_teller_no")
    public String getUpdateTellerNo() {
        return updateTellerNo;
    }

    public void setUpdateTellerNo(String updateTellerNo) {
        this.updateTellerNo = updateTellerNo;
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
    @Column(name = "is_mgr_dep")
    public String getIsMgrDep() {
        return isMgrDep;
    }

    public void setIsMgrDep(String isMgrDep) {
        this.isMgrDep = isMgrDep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriCustBaseInfo that = (PriCustBaseInfo) o;
        return Objects.equals(uid, that.uid) && Objects.equals(certType, that.certType) && Objects.equals(custNo, that.custNo) && Objects.equals(custName, that.custName) && Objects.equals(sex, that.sex) && Objects.equals(birthday, that.birthday) && Objects.equals(cerExpdDate, that.cerExpdDate) && Objects.equals(marrige, that.marrige) && Objects.equals(education, that.education) && Objects.equals(homePhone, that.homePhone) && Objects.equals(mobPhone, that.mobPhone) && Objects.equals(homeAdd, that.homeAdd) && Objects.equals(regAdd, that.regAdd) && Objects.equals(career, that.career) && Objects.equals(profTitl, that.profTitl) && Objects.equals(country, that.country) && Objects.equals(isEmployee, that.isEmployee) && Objects.equals(isShareholder, that.isShareholder) && Objects.equals(isBlack, that.isBlack) && Objects.equals(isContact, that.isContact) && Objects.equals(mgrName, that.mgrName) && Objects.equals(mgrNo, that.mgrNo) && Objects.equals(mgeOrgName, that.mgeOrgName) && Objects.equals(mgeOrg, that.mgeOrg) && Objects.equals(createDate, that.createDate) && Objects.equals(openOrg, that.openOrg) && Objects.equals(openTellerNo, that.openTellerNo) && Objects.equals(updateDate, that.updateDate) && Objects.equals(updateOrg, that.updateOrg) && Objects.equals(updateTellerNo, that.updateTellerNo) && Objects.equals(etlDt, that.etlDt) && Objects.equals(isMgrDep, that.isMgrDep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, certType, custNo, custName, sex, birthday, cerExpdDate, marrige, education, homePhone, mobPhone, homeAdd, regAdd, career, profTitl, country, isEmployee, isShareholder, isBlack, isContact, mgrName, mgrNo, mgeOrgName, mgeOrg, createDate, openOrg, openTellerNo, updateDate, updateOrg, updateTellerNo, etlDt, isMgrDep);
    }
}
