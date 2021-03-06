package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Productstockledger generated by hbm2java
 */
@Entity
@Table(name="productstockledger"
    ,catalog="e2rp"
)
public class Productstockledger  implements java.io.Serializable {


     private ProductstockledgerId id;
     private Date stkDate;
     private int stkPurId;
     private BigDecimal stkOpenstock;
     private BigDecimal stkPurcstock;
     private BigDecimal stkSalestock;
     private BigDecimal stkFloorstock;
     private BigDecimal stkTransitstock;
     private BigDecimal stkClosingstock;
     private String stkType;

    public Productstockledger() {
    }

    public Productstockledger(ProductstockledgerId id, Date stkDate, int stkPurId, BigDecimal stkOpenstock, BigDecimal stkPurcstock, BigDecimal stkSalestock, BigDecimal stkFloorstock, BigDecimal stkTransitstock, BigDecimal stkClosingstock, String stkType) {
       this.id = id;
       this.stkDate = stkDate;
       this.stkPurId = stkPurId;
       this.stkOpenstock = stkOpenstock;
       this.stkPurcstock = stkPurcstock;
       this.stkSalestock = stkSalestock;
       this.stkFloorstock = stkFloorstock;
       this.stkTransitstock = stkTransitstock;
       this.stkClosingstock = stkClosingstock;
       this.stkType = stkType;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="stkId", column=@Column(name="STK_ID", nullable=false) ), 
        @AttributeOverride(name="stkProdid", column=@Column(name="STK_PRODID", nullable=false) ) } )
    public ProductstockledgerId getId() {
        return this.id;
    }
    
    public void setId(ProductstockledgerId id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="STK_DATE", nullable=false, length=19)
    public Date getStkDate() {
        return this.stkDate;
    }
    
    public void setStkDate(Date stkDate) {
        this.stkDate = stkDate;
    }

    
    @Column(name="STK_PUR_ID", nullable=false)
    public int getStkPurId() {
        return this.stkPurId;
    }
    
    public void setStkPurId(int stkPurId) {
        this.stkPurId = stkPurId;
    }

    
    @Column(name="STK_OPENSTOCK", nullable=false, precision=18)
    public BigDecimal getStkOpenstock() {
        return this.stkOpenstock;
    }
    
    public void setStkOpenstock(BigDecimal stkOpenstock) {
        this.stkOpenstock = stkOpenstock;
    }

    
    @Column(name="STK_PURCSTOCK", nullable=false, precision=18)
    public BigDecimal getStkPurcstock() {
        return this.stkPurcstock;
    }
    
    public void setStkPurcstock(BigDecimal stkPurcstock) {
        this.stkPurcstock = stkPurcstock;
    }

    
    @Column(name="STK_SALESTOCK", nullable=false, precision=18)
    public BigDecimal getStkSalestock() {
        return this.stkSalestock;
    }
    
    public void setStkSalestock(BigDecimal stkSalestock) {
        this.stkSalestock = stkSalestock;
    }

    
    @Column(name="STK_FLOORSTOCK", nullable=false, precision=18)
    public BigDecimal getStkFloorstock() {
        return this.stkFloorstock;
    }
    
    public void setStkFloorstock(BigDecimal stkFloorstock) {
        this.stkFloorstock = stkFloorstock;
    }

    
    @Column(name="STK_TRANSITSTOCK", nullable=false, precision=18)
    public BigDecimal getStkTransitstock() {
        return this.stkTransitstock;
    }
    
    public void setStkTransitstock(BigDecimal stkTransitstock) {
        this.stkTransitstock = stkTransitstock;
    }

    
    @Column(name="STK_CLOSINGSTOCK", nullable=false, precision=18)
    public BigDecimal getStkClosingstock() {
        return this.stkClosingstock;
    }
    
    public void setStkClosingstock(BigDecimal stkClosingstock) {
        this.stkClosingstock = stkClosingstock;
    }

    
    @Column(name="STK_TYPE", nullable=false, length=20)
    public String getStkType() {
        return this.stkType;
    }
    
    public void setStkType(String stkType) {
        this.stkType = stkType;
    }




}


