package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Groupmaster generated by hbm2java
 */
@Entity
@Table(name="groupmaster"
    ,catalog="e2rp"
)
public class Groupmaster  implements java.io.Serializable {


     private Integer grpId;
     private int grpCodeid;
     private String grpCode;
     private int grpTocid;
     private String grpName;
     private int grpMinAge;
     private int grpMaxAge;

    public Groupmaster() {
    }

    public Groupmaster(int grpCodeid, String grpCode, int grpTocid, String grpName, int grpMinAge, int grpMaxAge) {
       this.grpCodeid = grpCodeid;
       this.grpCode = grpCode;
       this.grpTocid = grpTocid;
       this.grpName = grpName;
       this.grpMinAge = grpMinAge;
       this.grpMaxAge = grpMaxAge;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="GRP_ID", unique=true, nullable=false)
    public Integer getGrpId() {
        return this.grpId;
    }
    
    public void setGrpId(Integer grpId) {
        this.grpId = grpId;
    }

    
    @Column(name="GRP_CODEID", nullable=false)
    public int getGrpCodeid() {
        return this.grpCodeid;
    }
    
    public void setGrpCodeid(int grpCodeid) {
        this.grpCodeid = grpCodeid;
    }

    
    @Column(name="GRP_CODE", nullable=false, length=50)
    public String getGrpCode() {
        return this.grpCode;
    }
    
    public void setGrpCode(String grpCode) {
        this.grpCode = grpCode;
    }

    
    @Column(name="GRP_TOCID", nullable=false)
    public int getGrpTocid() {
        return this.grpTocid;
    }
    
    public void setGrpTocid(int grpTocid) {
        this.grpTocid = grpTocid;
    }

    
    @Column(name="GRP_NAME", nullable=false, length=10)
    public String getGrpName() {
        return this.grpName;
    }
    
    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }

    
    @Column(name="GRP_MIN_AGE", nullable=false)
    public int getGrpMinAge() {
        return this.grpMinAge;
    }
    
    public void setGrpMinAge(int grpMinAge) {
        this.grpMinAge = grpMinAge;
    }

    
    @Column(name="GRP_MAX_AGE", nullable=false)
    public int getGrpMaxAge() {
        return this.grpMaxAge;
    }
    
    public void setGrpMaxAge(int grpMaxAge) {
        this.grpMaxAge = grpMaxAge;
    }




}


