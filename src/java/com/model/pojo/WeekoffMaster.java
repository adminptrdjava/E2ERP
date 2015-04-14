package com.model.pojo;
// Generated 13 Apr, 2015 11:03:03 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WeekoffMaster generated by hbm2java
 */
@Entity
@Table(name="weekoff_master"
    ,catalog="e2rp"
)
public class WeekoffMaster  implements java.io.Serializable {


     private Integer weekoffId;
     private String noOffWkoff;
     private int employeeId;
     private int designationId;
     private int flag1;
     private String flag2;
     private String flag3;
     private String flag4;
     private String flag5;

    public WeekoffMaster() {
    }

    public WeekoffMaster(String noOffWkoff, int employeeId, int designationId, int flag1, String flag2, String flag3, String flag4, String flag5) {
       this.noOffWkoff = noOffWkoff;
       this.employeeId = employeeId;
       this.designationId = designationId;
       this.flag1 = flag1;
       this.flag2 = flag2;
       this.flag3 = flag3;
       this.flag4 = flag4;
       this.flag5 = flag5;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="WEEKOFF_ID", unique=true, nullable=false)
    public Integer getWeekoffId() {
        return this.weekoffId;
    }
    
    public void setWeekoffId(Integer weekoffId) {
        this.weekoffId = weekoffId;
    }

    
    @Column(name="NO_OFF_WKOFF", nullable=false, length=50)
    public String getNoOffWkoff() {
        return this.noOffWkoff;
    }
    
    public void setNoOffWkoff(String noOffWkoff) {
        this.noOffWkoff = noOffWkoff;
    }

    
    @Column(name="EMPLOYEE_ID", nullable=false)
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    
    @Column(name="DESIGNATION_ID", nullable=false)
    public int getDesignationId() {
        return this.designationId;
    }
    
    public void setDesignationId(int designationId) {
        this.designationId = designationId;
    }

    
    @Column(name="FLAG_1", nullable=false)
    public int getFlag1() {
        return this.flag1;
    }
    
    public void setFlag1(int flag1) {
        this.flag1 = flag1;
    }

    
    @Column(name="FLAG_2", nullable=false, length=50)
    public String getFlag2() {
        return this.flag2;
    }
    
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    
    @Column(name="FLAG_3", nullable=false, length=50)
    public String getFlag3() {
        return this.flag3;
    }
    
    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

    
    @Column(name="FLAG_4", nullable=false, length=50)
    public String getFlag4() {
        return this.flag4;
    }
    
    public void setFlag4(String flag4) {
        this.flag4 = flag4;
    }

    
    @Column(name="FLAG_5", nullable=false, length=50)
    public String getFlag5() {
        return this.flag5;
    }
    
    public void setFlag5(String flag5) {
        this.flag5 = flag5;
    }




}

