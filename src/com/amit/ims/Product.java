package com.amit.ims;

public class Product {

    private Integer id;
    private String name;
    private String description;
    private Integer catalogId;

    Product(Integer id,String name,String description , Integer catalogId ){

        this.catalogId =catalogId;
        this.description = description;
        this.id = id;
        this.name=name;

    }

    public void setId(Integer id){

        this.id=id;

    }

    public Integer getId(){

        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", catalogId=" + catalogId +
                '}';
    }
}
