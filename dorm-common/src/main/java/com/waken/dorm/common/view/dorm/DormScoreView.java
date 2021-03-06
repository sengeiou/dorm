package com.waken.dorm.common.view.dorm;

import java.util.Date;

/**
 * @ClassName DormScoreView
 * @Description TODO
 * @Author zhaoRong
 * @Date 2019/3/31 19:36
 **/
public class DormScoreView {
    private String pkDormScoreId;

    private String dormNum;

    private Integer cultureScore;

    private Integer disciplineScore;

    private Integer bedScore;

    private Integer deskScore;

    private Integer balconyScore;

    private Integer toiletScore;

    private Integer groundScore;

    private Integer doorWindowScore;

    private Integer metopeScore;

    private Integer totalScore;

    private Integer status;

    private Date createTime;

    private String createUserName;

    private Date lastModifyTime;

    private String lastModifyUserName;

    private String memo;

    public String getPkDormScoreId() {
        return pkDormScoreId;
    }

    public void setPkDormScoreId(String pkDormScoreId) {
        this.pkDormScoreId = pkDormScoreId;
    }

    public String getDormNum() {
        return dormNum;
    }

    public void setDormNum(String dormNum) {
        this.dormNum = dormNum;
    }

    public Integer getCultureScore() {
        return cultureScore;
    }

    public void setCultureScore(Integer cultureScore) {
        this.cultureScore = cultureScore;
    }

    public Integer getDisciplineScore() {
        return disciplineScore;
    }

    public void setDisciplineScore(Integer disciplineScore) {
        this.disciplineScore = disciplineScore;
    }

    public Integer getBedScore() {
        return bedScore;
    }

    public void setBedScore(Integer bedScore) {
        this.bedScore = bedScore;
    }

    public Integer getDeskScore() {
        return deskScore;
    }

    public void setDeskScore(Integer deskScore) {
        this.deskScore = deskScore;
    }

    public Integer getBalconyScore() {
        return balconyScore;
    }

    public void setBalconyScore(Integer balconyScore) {
        this.balconyScore = balconyScore;
    }

    public Integer getToiletScore() {
        return toiletScore;
    }

    public void setToiletScore(Integer toiletScore) {
        this.toiletScore = toiletScore;
    }

    public Integer getGroundScore() {
        return groundScore;
    }

    public void setGroundScore(Integer groundScore) {
        this.groundScore = groundScore;
    }

    public Integer getDoorWindowScore() {
        return doorWindowScore;
    }

    public void setDoorWindowScore(Integer doorWindowScore) {
        this.doorWindowScore = doorWindowScore;
    }

    public Integer getMetopeScore() {
        return metopeScore;
    }

    public void setMetopeScore(Integer metopeScore) {
        this.metopeScore = metopeScore;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifyUserName() {
        return lastModifyUserName;
    }

    public void setLastModifyUserName(String lastModifyUserName) {
        this.lastModifyUserName = lastModifyUserName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
