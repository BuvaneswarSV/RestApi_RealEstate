package com.example.springboot.landdetails.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reg {
    @Id
    private int landId;
    private String addressPlace;
    private String landName;
    private String custName;
    private String custNum;
    private double landPrice;
    private String regYear;
    public int getLandId() {
        return landId;
    }
    public void setLandId(int landId) {
        this.landId = landId;
    }
    public String getAddressPlace() {
        return addressPlace;
    }
    public void setAddressPlace(String addressPlace) {
        this.addressPlace = addressPlace;
    }
    public String getLandName() {
        return landName;
    }
    public void setLandName(String landName) {
        this.landName = landName;
    }
    public String getCustName() {
        return  custName;
    }
    public void setCustName(String  custName) {
        this.custName =  custName;
    }
    public String getCustNum() {
        return custNum;
    }
    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }
    public double getLandPrice() {
        return landPrice;
    }
    public void setLandPrice(double landPrice) {
        this.landPrice = landPrice;
    }
    public String getRegYear() {
        return regYear;
    }
    public void setRegYear(String regYear) {
        this.regYear = regYear;
    }
    public Reg(int landId, String addressPlace, String landName, String custName, String custNum,
             double landPrice, String regYear) {
        this.landId = landId;
        this.addressPlace = addressPlace;
        this.landName = landName;
        this.custName = custName;
        this.custNum = custNum;
        this.landPrice = landPrice;
        this.regYear = regYear;
    }
    public Reg() {
    }

}
