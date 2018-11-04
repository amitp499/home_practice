package com.amit.ims;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddNewProdcut_Test {

    InventoryDao id = null;


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

    @Test
    public void valAddProductHappyPath(){

        boolean addPrd = id.addProduct(new Product(501,"Saree","LadiesWear",29));

        assertEquals(true,addPrd);

    }
}
