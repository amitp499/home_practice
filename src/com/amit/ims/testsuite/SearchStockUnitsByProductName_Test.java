package com.amit.ims.testsuite;


import com.amit.ims.InventoryDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SearchStockUnitsByProductName_Test {

    InventoryDao lap = null;

    @Before
    public void loadObj(){
        lap = new InventoryDao();
    }

    @After
    public void washObj(){
        lap = null;
    }

    @Test
    public void testGetUnitByProductNameRecordExist(){

        assertEquals(true, lap.getStockUnitByProductName("Shirts"));
    }

    @Test
    public void testGetUnitByProductNameRecordNotExist(){

        assertEquals(false, lap.getStockUnitByProductName("Book"));
    }

    @Test
    public void testGetUnitByBlankProductName(){

        assertEquals(false, lap.getStockUnitByProductName(" "));
    }

    @Test
    public void testGetUnitByProductNameInNos(){

        assertEquals(false, lap.getStockUnitByProductName("3532"));
    }


}
