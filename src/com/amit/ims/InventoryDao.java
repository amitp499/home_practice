package com.amit.ims;

import java.util.*;

public class InventoryDao {

    ArrayList<Product> pr = new ArrayList<>();

    TreeSet<ProductCatalog> pc = new TreeSet<>();

    HashMap<Integer, StockUnit> su = new HashMap<>();

    InventoryDao(){

        loadData();
    }


    protected boolean addStockUnit(Integer no, StockUnit sua) {
        boolean suFlag=false;

        for (Product po : pr){

            Integer stockPrChk = po.getId().compareTo(sua.getProductId());
            if (stockPrChk==0){
                suFlag=true;
                su.put(no, sua);

                break;
            }
        }

        if (suFlag==true) {
            if (su.containsKey(no)) {
                suFlag = true;
            }else {
                suFlag=false;
            }
        }

        return suFlag;
    }

    protected boolean addProduct(Product pra) {

        pr.add(pra);

        boolean prdAdd = false;

        for (Product pt : pr) {

            if (pra.getName().equalsIgnoreCase(pt.getName())){
                prdAdd = true;
                break;
            }

        }

        return prdAdd;


    }

    protected void addProductCatalog(ProductCatalog pca) {

        pc.add(pca);
    }

    public void listAllProduct() {


        for (Product pt : pr) {

            System.out.println(pt);

        }

    }

    public void listAllProductCatalog() {


        for (ProductCatalog pcl : pc) {

            System.out.println(pcl);

        }


    }

    public void listAllStockUnit() {

        for (StockUnit ssu : su.values()){


            System.out.println("Unit Id : "+ssu.getUnitId()+",Product Id : "+ssu.getProductId()+" , Quantity : "+ssu.getQuantity());
        }
    }

    public boolean getStockUnitByProductName(String spn) {

        boolean pdFound = false;
        Integer fid=0,aid, fQty, fpid, fuid;

        for (Product spt : pr) {

            if (spt.getName().equalsIgnoreCase(spn)) {
                fid = spt.getId();
                pdFound = true;
                break;
            }

        }

        if (pdFound == true) {

            for (StockUnit pt : su.values()){

                aid= pt.getProductId();
                pdFound=false;
            Integer calcInt =aid.compareTo(fid);
                    if (calcInt==0){
                    pdFound=true;
                    fQty= pt.getQuantity();
                    fpid= pt.getProductId();
                    fuid= pt.getUnitId();
                    System.out.println("Unit Id : "+fuid+",Product Id : "+fpid+" , Quantity : "+fQty);
                    break;
                }

            }

        }else{
            return pdFound;

        }

        return pdFound;
    }


    public void loadData(){

        addProduct(new Product(105,"Shirts","Cotton Shirts",15));
        addProduct(new Product(110,"T-Shirts","Polo Cotton T-Shirts",18));
        addProduct(new Product(112,"Jeans","Blue Jeans",12));
        addProduct(new Product(104,"Shoes","Leather Shoes",25));
        addProduct(new Product(125,"Floaters","All Season Floaters",8));

        addProductCatalog(new ProductCatalog(8,"Cotton Shirts"));
        addProductCatalog(new ProductCatalog(9,"Polo Cotton T-Shirts"));
        addProductCatalog( new ProductCatalog(10,"Blue Jeans"));
        addProductCatalog( new ProductCatalog(11,"Leather Shoes"));
        addProductCatalog(new ProductCatalog(12,"All Season Floaters"));

        addStockUnit(1,new StockUnit(11,105,15));
        addStockUnit(2,new StockUnit(15,110,25));
        addStockUnit(3,new StockUnit(18,112,11));
        addStockUnit(4,new StockUnit(10,104,36));
        addStockUnit(5,new StockUnit(25,125,45));
    }


    }







