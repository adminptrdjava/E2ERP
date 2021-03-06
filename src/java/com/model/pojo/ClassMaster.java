package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassMaster generated by hbm2java
 */
@Entity
@Table(name="class_master"
    ,catalog="e2rp"
)
public class ClassMaster  implements java.io.Serializable {


     private Integer classId;
     private String className;
     private String classIsactive;

    public ClassMaster() {
    }

    public ClassMaster(String className, String classIsactive) {
       this.className = className;
       this.classIsactive = classIsactive;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="CLASS_ID", unique=true, nullable=false)
    public Integer getClassId() {
        return this.classId;
    }
    
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    
    @Column(name="CLASS_NAME", nullable=false, length=10)
    public String getClassName() {
        return this.className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }

    
    @Column(name="CLASS_ISACTIVE", nullable=false, length=10)
    public String getClassIsactive() {
        return this.classIsactive;
    }
    
    public void setClassIsactive(String classIsactive) {
        this.classIsactive = classIsactive;
    }




}


