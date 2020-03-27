package com.wenkong.pojo;

import java.util.Date;
import java.util.List;

public class QqcReport {
    private String guid;
    private String epscode;
    private String bgmc;
    private Date bdrq;
    private Integer bgtype;
    private List<QqcReportImg> qqcReportImgList;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getEpscode() {
        return epscode;
    }

    public void setEpscode(String epscode) {
        this.epscode = epscode;
    }

    public String getBgmc() {
        return bgmc;
    }

    public void setBgmc(String bgmc) {
        this.bgmc = bgmc;
    }

    public Date getBdrq() {
        return bdrq;
    }

    public void setBdrq(Date bdrq) {
        this.bdrq = bdrq;
    }

    public Integer getBgtype() {
        return bgtype;
    }

    public void setBgtype(Integer bgtype) {
        this.bgtype = bgtype;
    }

    public List<QqcReportImg> getQqcReportImgList() {
        return qqcReportImgList;
    }

    public void setQqcReportImgList(List<QqcReportImg> qqcReportImgList) {
        this.qqcReportImgList = qqcReportImgList;
    }
}
