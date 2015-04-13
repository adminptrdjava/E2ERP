
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swarnendu
 */
public class NewClass {
    @Entity
@Table(name="usertab"
    ,catalog="test"
)
public class Usertab  implements java.io.Serializable {


     private Integer id;
     @NotBlank
     private String uid;
     @NotBlank
     private String pass;
     private String status;
     private String pst;
     

    public Usertab() {
    }

    public Usertab(String uid, String pass, String status, String pst) {
       this.uid = uid;
       this.pass = pass;
       this.status = status;
       this.pst = pst;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="uid", nullable=false, length=20)
    public String getUid() {
        return this.uid;
    }
    
    public void setUid(String uid) {
        this.uid = uid;
    }

    
    @Column(name="pass", nullable=false, length=30)
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

    
    @Column(name="Status", nullable=false)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="Pst", nullable=false)
    public String getPst() {
        return this.pst;
    }
    
    public void setPst(String pst) {
        this.pst = pst;
    }




}



}
