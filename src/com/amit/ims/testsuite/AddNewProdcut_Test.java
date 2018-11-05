package com.amit.ims.testsuite;

import com.amit.ims.InventoryDao;
import com.amit.ims.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.*;

import static junit.framework.TestCase.assertEquals;


public class AddNewProdcut_Test {

    InventoryDao id = null;
    Product pdt;
    boolean expectedValue;

    /*public AddNewProdcut_Test(boolean expectedValue,Product pdt ){

        this.expectedValue=expectedValue;
        this.pdt=pdt;

    }*/


    @Before
    public void setProduct(){
        id = new InventoryDao();
    }

    @After
    public void tearDown(){
        id = null;
    }

    @Test
    public void valAddProductCatalogIdAsNegative(){

        boolean addPrd = id.addProduct(new Product(8,"TestProduct","TestDesc",-2));

        assertEquals(false,addPrd);

    }


    @Test
    public void valAddProductCatalogIdAsZero(){

        boolean addPrd = id.addProduct(new Product(8,"TestProduct","TestDesc",0));

        assertEquals(false,addPrd);

    }

    @Test
    public void valAddProductIdAsZero(){

        boolean addPrd = id.addProduct(new Product(0,"TestProduct","TestDesc",1));

        assertEquals(false,addPrd);

    }

    @Test
    public void valAddProductIdAsNegative(){

        boolean addPrd = id.addProduct(new Product(-8,"TestProduct","TestDesc",1));

        assertEquals(false,addPrd);

    }

    @Test
    public void valAddProductCatalogAsBlank(){

        boolean addPrd = id.addProduct(new Product(8,"TestProduct"," ",1));

        assertEquals(false,addPrd);

    }

    @Test
    public void valAddProductNameAsBlank(){

        boolean addPrd = id.addProduct(new Product(8," ","Test",1));

        assertEquals(false,addPrd);

    }

    @Test
    public void valAddProductAllInputInvalid(){

        boolean addPrd = id.addProduct(new Product(0," "," ",0));

        assertEquals(false,addPrd);

    }

    /*@Parameterized.Parameters
    public static Collection params(){

        List data = new ArrayList();
       // data.add(true, id.addProduct(new Product(501,"Saree","LadiesWear",29)));
        //data.add(new Object[] {true,addProduct(new Product(501,"Saree","LadiesWear",29))});

        return data;
    }*/

    @Test
    public void valAddProductHappyPath(){

       // boolean addPrd = id.addProduct(new Product(501,"Saree","LadiesWear",29));

        assertEquals(expectedValue,pdt);

    }
}
