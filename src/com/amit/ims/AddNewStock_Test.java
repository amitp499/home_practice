package com.amit.ims;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class AddNewStock_Test {

    InventoryDao suTest = null;


    @Before
    public void loadObj() {

        suTest = new InventoryDao();
    }

    @After
    public void dropObj() {

        suTest = null;
    }

    public void addTestProduct(){
        suTest.addProduct(new Product(56, "Pen","Stationary",98));
    }

    @Test
    public void testStockHappyPathWhenProductIdExist(){
        addTestProduct();
        assertEquals(true,suTest.addStockUnit(270,new StockUnit(38,56,712)));
    }



    @Test
    public void testStockQuantityIsZero(){
        addTestProduct();
        assertEquals(false,suTest.addStockUnit(270,new StockUnit(38,56,0)));
    }

    @Test
    public void testStockQuantityIsNegative(){
        addTestProduct();
        assertEquals(false,suTest.addStockUnit(270,new StockUnit(38,56,-987)));
    }

    @Test
    public void testStockWhenKeyIsZero(){
        addTestProduct();
        assertEquals(false,suTest.addStockUnit(0,new StockUnit(38,56,712)));
    }

    @Test
    public void testStockWhenKeyIsNegative(){
         addTestProduct();
        assertEquals(false,suTest.addStockUnit(-86,new StockUnit(38,56,712)));
    }

    @Test
    public void testStockWhenUnitIdIsZero(){
         addTestProduct();
        assertEquals(false,suTest.addStockUnit(-86,new StockUnit(0,56,712)));
    }

    @Test
    public void testStockWhenUnitIdIsNegative(){
         addTestProduct();
        assertEquals(false,suTest.addStockUnit(-86,new StockUnit(-58,56,712)));
    }

    @Test
    public void testStockUnitWhenProdIdDoesNotExistInProduct(){

        assertEquals(false,suTest.addStockUnit(298,new StockUnit(29,45,690)));
    }


}