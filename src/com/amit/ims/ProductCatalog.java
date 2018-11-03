package com.amit.ims;

public class ProductCatalog implements Comparable<ProductCatalog>{

    private Integer id;
    private String name;

    public ProductCatalog(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(ProductCatalog pcc){
        return  this.id - pcc.id;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
