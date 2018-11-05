package com.amit.ims.testsuite;


import com.amit.ims.ListAllStockItems_Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AddNewProdcut_Test.class, AddNewStock_Test.class, ListAllProducts_Test.class,
        ListAllStockItems_Test.class, SearchStockUnitsByProductName_Test.class})

public class ImsTestSuite {

}
