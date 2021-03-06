package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProductstockledgerId generated by hbm2java
 */
@Embeddable
public class ProductstockledgerId  implements java.io.Serializable {


     private int stkId;
     private int stkProdid;

    public ProductstockledgerId() {
    }

    public ProductstockledgerId(int stkId, int stkProdid) {
       this.stkId = stkId;
       this.stkProdid = stkProdid;
    }
   


    @Column(name="STK_ID", nullable=false)
    public int getStkId() {
        return this.stkId;
    }
    
    public void setStkId(int stkId) {
        this.stkId = stkId;
    }


    @Column(name="STK_PRODID", nullable=false)
    public int getStkProdid() {
        return this.stkProdid;
    }
    
    public void setStkProdid(int stkProdid) {
        this.stkProdid = stkProdid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProductstockledgerId) ) return false;
		 ProductstockledgerId castOther = ( ProductstockledgerId ) other; 
         
		 return (this.getStkId()==castOther.getStkId())
 && (this.getStkProdid()==castOther.getStkProdid());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getStkId();
         result = 37 * result + this.getStkProdid();
         return result;
   }   


}


