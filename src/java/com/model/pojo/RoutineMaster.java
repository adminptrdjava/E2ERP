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
 * RoutineMaster generated by hbm2java
 */
@Entity
@Table(name="routine_master"
    ,catalog="e2rp"
)
public class RoutineMaster  implements java.io.Serializable {


     private Integer rmId;
     private int classId;
     private String section;
     private int createdBy;
     private Date createdOn;
     private String rmIsactive;

    public RoutineMaster() {
    }

    public RoutineMaster(int classId, String section, int createdBy, Date createdOn, String rmIsactive) {
       this.classId = classId;
       this.section = section;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.rmIsactive = rmIsactive;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="RM_ID", unique=true, nullable=false)
    public Integer getRmId() {
        return this.rmId;
    }
    
    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    
    @Column(name="CLASS_ID", nullable=false)
    public int getClassId() {
        return this.classId;
    }
    
    public void setClassId(int classId) {
        this.classId = classId;
    }

    
    @Column(name="SECTION", nullable=false, length=20)
    public String getSection() {
        return this.section;
    }
    
    public void setSection(String section) {
        this.section = section;
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

    
    @Column(name="RM_ISACTIVE", nullable=false, length=10)
    public String getRmIsactive() {
        return this.rmIsactive;
    }
    
    public void setRmIsactive(String rmIsactive) {
        this.rmIsactive = rmIsactive;
    }




}


