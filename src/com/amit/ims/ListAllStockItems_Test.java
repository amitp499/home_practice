package com.amit.ims;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;

public class ListAllStockItems_Test {

    InventoryDao lsp = null;

    @Before
    public void loadObj(){
        lsp = new InventoryDao();
    }

    @After
    public void washObj(){
        lsp = null;
    }

    @Test
    public void testListOfAllStocksIsNotEmpty(){

        assertThat(lsp.listAllStockUnit(),not(IsEmptyCollection.empty()));
    }

    @Test
    public void testSizeOfStockList(){

        assertThat(lsp.listAllStockUnit().size(), is(5));
    }

    @Test
    public void testStockProductIdInList(){


        assertThat(lsp.listAllStockUnit(), containsInAnyOrder(hasProperty("productId", is(105)),
                hasProperty("productId", is(110)),
                hasProperty("productId", is(112)),
                hasProperty("productId", is(104)),
                hasProperty("productId", is(125))));

    }

}
