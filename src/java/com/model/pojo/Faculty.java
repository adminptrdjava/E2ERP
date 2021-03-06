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
 * Faculty generated by hbm2java
 */
@Entity
@Table(name="faculty"
    ,catalog="e2rp"
)
public class Faculty  implements java.io.Serializable {


     private Integer facId;
     private String category;
     private int createdBy;
     private Date createdOn;
     private String facIsactive;

    public Faculty() {
    }

    public Faculty(String category, int createdBy, Date createdOn, String facIsactive) {
       this.category = category;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.facIsactive = facIsactive;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="FAC_ID", unique=true, nullable=false)
    public Integer getFacId() {
        return this.facId;
    }
    
    public void setFacId(Integer facId) {
        this.facId = facId;
    }

    
    @Column(name="CATEGORY", nullable=false, length=10)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
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

    
    @Column(name="FAC_ISACTIVE", nullable=false, length=10)
    public String getFacIsactive() {
        return this.facIsactive;
    }
    
    public void setFacIsactive(String facIsactive) {
        this.facIsactive = facIsactive;
    }




}


