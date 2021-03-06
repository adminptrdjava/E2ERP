package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LeaveMaster generated by hbm2java
 */
@Entity
@Table(name="leave_master"
    ,catalog="e2rp"
)
public class LeaveMaster  implements java.io.Serializable {


     private Integer leaveId;
     private int employeeId;
     private int degsignationId;
     private String paidleave;
     private String unpaidleave;
     private String noofleave;
     private int flag1;
     private String flag2;
     private String flag3;
     private String flag4;
     private String flag5;
     private String leaveIsactive;

    public LeaveMaster() {
    }

    public LeaveMaster(int employeeId, int degsignationId, String paidleave, String unpaidleave, String noofleave, int flag1, String flag2, String flag3, String flag4, String flag5, String leaveIsactive) {
       this.employeeId = employeeId;
       this.degsignationId = degsignationId;
       this.paidleave = paidleave;
       this.unpaidleave = unpaidleave;
       this.noofleave = noofleave;
       this.flag1 = flag1;
       this.flag2 = flag2;
       this.flag3 = flag3;
       this.flag4 = flag4;
       this.flag5 = flag5;
       this.leaveIsactive = leaveIsactive;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="LEAVE_ID", unique=true, nullable=false)
    public Integer getLeaveId() {
        return this.leaveId;
    }
    
    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    
    @Column(name="EMPLOYEE_ID", nullable=false)
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    
    @Column(name="DEGSIGNATION_ID", nullable=false)
    public int getDegsignationId() {
        return this.degsignationId;
    }
    
    public void setDegsignationId(int degsignationId) {
        this.degsignationId = degsignationId;
    }

    
    @Column(name="PAIDLEAVE", nullable=false, length=50)
    public String getPaidleave() {
        return this.paidleave;
    }
    
    public void setPaidleave(String paidleave) {
        this.paidleave = paidleave;
    }

    
    @Column(name="UNPAIDLEAVE", nullable=false, length=50)
    public String getUnpaidleave() {
        return this.unpaidleave;
    }
    
    public void setUnpaidleave(String unpaidleave) {
        this.unpaidleave = unpaidleave;
    }

    
    @Column(name="NOOFLEAVE", nullable=false, length=50)
    public String getNoofleave() {
        return this.noofleave;
    }
    
    public void setNoofleave(String noofleave) {
        this.noofleave = noofleave;
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

    
    @Column(name="LEAVE_ISACTIVE", nullable=false, length=10)
    public String getLeaveIsactive() {
        return this.leaveIsactive;
    }
    
    public void setLeaveIsactive(String leaveIsactive) {
        this.leaveIsactive = leaveIsactive;
    }




}


