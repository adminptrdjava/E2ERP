package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RequsitionForward generated by hbm2java
 */
@Entity
@Table(name="requsition_forward"
    ,catalog="e2rp"
)
public class RequsitionForward  implements java.io.Serializable {


     private Integer reqForwardId;
     private int reqHistoryId;
     private String reqFromId;
     private String reqToIds;
     private String reqType;
     private String reqStatus;
     private int flag1;
     private String flag2;
     private int createdBy;
     private Date createdOn;
     private int editedBy;
     private Date editedOn;

    public RequsitionForward() {
    }

    public RequsitionForward(int reqHistoryId, String reqFromId, String reqToIds, String reqType, String reqStatus, int flag1, String flag2, int createdBy, Date createdOn, int editedBy, Date editedOn) {
       this.reqHistoryId = reqHistoryId;
       this.reqFromId = reqFromId;
       this.reqToIds = reqToIds;
       this.reqType = reqType;
       this.reqStatus = reqStatus;
       this.flag1 = flag1;
       this.flag2 = flag2;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.editedBy = editedBy;
       this.editedOn = editedOn;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="REQ_FORWARD_ID", unique=true, nullable=false)
    public Integer getReqForwardId() {
        return this.reqForwardId;
    }
    
    public void setReqForwardId(Integer reqForwardId) {
        this.reqForwardId = reqForwardId;
    }

    
    @Column(name="REQ_HISTORY_ID", nullable=false)
    public int getReqHistoryId() {
        return this.reqHistoryId;
    }
    
    public void setReqHistoryId(int reqHistoryId) {
        this.reqHistoryId = reqHistoryId;
    }

    
    @Column(name="REQ_FROM_ID", nullable=false, length=100)
    public String getReqFromId() {
        return this.reqFromId;
    }
    
    public void setReqFromId(String reqFromId) {
        this.reqFromId = reqFromId;
    }

    
    @Column(name="REQ_TO_IDS", nullable=false)
    public String getReqToIds() {
        return this.reqToIds;
    }
    
    public void setReqToIds(String reqToIds) {
        this.reqToIds = reqToIds;
    }

    
    @Column(name="REQ_TYPE", nullable=false, length=50)
    public String getReqType() {
        return this.reqType;
    }
    
    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    
    @Column(name="REQ_STATUS", nullable=false, length=50)
    public String getReqStatus() {
        return this.reqStatus;
    }
    
    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

    
    @Column(name="FLAG1", nullable=false)
    public int getFlag1() {
        return this.flag1;
    }
    
    public void setFlag1(int flag1) {
        this.flag1 = flag1;
    }

    
    @Column(name="FLAG2", nullable=false, length=50)
    public String getFlag2() {
        return this.flag2;
    }
    
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    
    @Column(name="CREATED_BY", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_ON", nullable=false, length=19)
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    
    @Column(name="EDITED_BY", nullable=false)
    public int getEditedBy() {
        return this.editedBy;
    }
    
    public void setEditedBy(int editedBy) {
        this.editedBy = editedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EDITED_ON", nullable=false, length=19)
    public Date getEditedOn() {
        return this.editedOn;
    }
    
    public void setEditedOn(Date editedOn) {
        this.editedOn = editedOn;
    }




}


