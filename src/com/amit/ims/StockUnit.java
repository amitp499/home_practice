package com.amit.ims;

public class StockUnit {

    private Integer unitId;
    private Integer productId;
    private Integer quantity;


    public StockUnit(Integer unitId, Integer productId, Integer quantity) {
        this.unitId = unitId;
        this.productId = productId;
        this.quantity = quantity;
    }


    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StockUnit{" +
                "unitId=" + unitId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
