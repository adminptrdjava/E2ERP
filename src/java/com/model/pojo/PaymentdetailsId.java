package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PaymentdetailsId generated by hbm2java
 */
@Embeddable
public class PaymentdetailsId  implements java.io.Serializable {


     private int pymDtlid;
     private int pymId;

    public PaymentdetailsId() {
    }

    public PaymentdetailsId(int pymDtlid, int pymId) {
       this.pymDtlid = pymDtlid;
       this.pymId = pymId;
    }
   


    @Column(name="PYM_DTLID", nullable=false)
    public int getPymDtlid() {
        return this.pymDtlid;
    }
    
    public void setPymDtlid(int pymDtlid) {
        this.pymDtlid = pymDtlid;
    }


    @Column(name="PYM_ID", nullable=false)
    public int getPymId() {
        return this.pymId;
    }
    
    public void setPymId(int pymId) {
        this.pymId = pymId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PaymentdetailsId) ) return false;
		 PaymentdetailsId castOther = ( PaymentdetailsId ) other; 
         
		 return (this.getPymDtlid()==castOther.getPymDtlid())
 && (this.getPymId()==castOther.getPymId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPymDtlid();
         result = 37 * result + this.getPymId();
         return result;
   }   


}


