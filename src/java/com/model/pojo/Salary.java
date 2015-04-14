package com.model.pojo;
// Generated 13 Apr, 2015 11:03:03 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Salary generated by hbm2java
 */
@Entity
@Table(name="salary"
    ,catalog="e2rp"
)
public class Salary  implements java.io.Serializable {


     private Integer salaryId;
     private int employeeId;
     private int designationId;
     private String basic;
     private String hra;
     private String pf;
     private String otherallowance;
     private int flag1;
     private String flag2;
     private String flag3;
     private String flag4;
     private String flag5;

    public Salary() {
    }

    public Salary(int employeeId, int designationId, String basic, String hra, String pf, String otherallowance, int flag1, String flag2, String flag3, String flag4, String flag5) {
       this.employeeId = employeeId;
       this.designationId = designationId;
       this.basic = basic;
       this.hra = hra;
       this.pf = pf;
       this.otherallowance = otherallowance;
       this.flag1 = flag1;
       this.flag2 = flag2;
       this.flag3 = flag3;
       this.flag4 = flag4;
       this.flag5 = flag5;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="SALARY_ID", unique=true, nullable=false)
    public Integer getSalaryId() {
        return this.salaryId;
    }
    
    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
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

    
    @Column(name="BASIC", nullable=false, length=50)
    public String getBasic() {
        return this.basic;
    }
    
    public void setBasic(String basic) {
        this.basic = basic;
    }

    
    @Column(name="HRA", nullable=false, length=50)
    public String getHra() {
        return this.hra;
    }
    
    public void setHra(String hra) {
        this.hra = hra;
    }

    
    @Column(name="PF", nullable=false, length=50)
    public String getPf() {
        return this.pf;
    }
    
    public void setPf(String pf) {
        this.pf = pf;
    }

    
    @Column(name="OTHERALLOWANCE", nullable=false, length=50)
    public String getOtherallowance() {
        return this.otherallowance;
    }
    
    public void setOtherallowance(String otherallowance) {
        this.otherallowance = otherallowance;
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

