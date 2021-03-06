package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContradetailsId generated by hbm2java
 */
@Embeddable
public class ContradetailsId  implements java.io.Serializable {


     private int conDtlid;
     private int conId;

    public ContradetailsId() {
    }

    public ContradetailsId(int conDtlid, int conId) {
       this.conDtlid = conDtlid;
       this.conId = conId;
    }
   


    @Column(name="CON_DTLID", nullable=false)
    public int getConDtlid() {
        return this.conDtlid;
    }
    
    public void setConDtlid(int conDtlid) {
        this.conDtlid = conDtlid;
    }


    @Column(name="CON_ID", nullable=false)
    public int getConId() {
        return this.conId;
    }
    
    public void setConId(int conId) {
        this.conId = conId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ContradetailsId) ) return false;
		 ContradetailsId castOther = ( ContradetailsId ) other; 
         
		 return (this.getConDtlid()==castOther.getConDtlid())
 && (this.getConId()==castOther.getConId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getConDtlid();
         result = 37 * result + this.getConId();
         return result;
   }   


}


