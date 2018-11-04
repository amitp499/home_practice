package com.amit.ims;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import org.hamcrest.collection.IsEmptyCollection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;




public class ListAllProducts_Test {

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
    public void testListOfAllProductsIsNotEmpty(){

        assertThat(lap.listAllProduct(),not(IsEmptyCollection.empty()));
    }

    @Test
    public void testSizeOfProductList(){

        assertThat(lap.listAllProduct().size(), is(5));
    }

    @Test
    public void testProductNameInList(){


         assertThat(lap.listAllProduct(), containsInAnyOrder(hasProperty("name", is("Shirts")),
                 hasProperty("name", is("T-Shirts")),
                 hasProperty("name", is("Jeans")),
                 hasProperty("name", is("Shoes")),
                 hasProperty("name", is("Floaters"))));


    }

}
