package com.amit.ims;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ImsLoadData {



    public static void main(String[] args) {

        InventoryDao idao = new InventoryDao();

        System.out.println("**************** Menu for User ****************");
        System.out.println("Press : A :  Add new Product");
        System.out.println("Press : I :  Add new Stock Unit");
        System.out.println("Press : L :  List all Products");
        System.out.println("Press : P :  List all Stock Units");
        System.out.println("Press : S :  Search in Stock Units by Product Name");
        System.out.println("Press : Q :  Quit");
        System.out.println("Instruction : Enter your input through keyboard");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        boolean invalidInp = false;

        while(true){
            System.out.println("******************************************************");
            System.out.println("Please enter your choice from Menu");
            String inp = sc.nextLine();

            switch (inp.toUpperCase()) {

                case "A":

                    try{

                        System.out.println("Please enter Product details to be added (Id, Name, Description, CatalogId)");

                        System.out.println("Please enter Product: Id");
                        Integer id = sc1.nextInt();


                        System.out.println("Please enter Product: Name");
                        String enmae = sc1.next();


                        System.out.println("Please enter Product: Description");
                        String descp = sc1.next();


                        System.out.println("Please enter Product: CatalogId");
                        Integer cata = sc1.nextInt();


                        if (idao.addProduct(new Product(id, enmae, descp, cata))){
                            System.out.println("Product Added Successfully");

                        }else{
                            System.out.println("Error obtained while adding Product, Please contact support team");

                        }
                    }catch (InputMismatchException e){
                        System.out.println("Please enter correct input from your keyboard");
                    }finally {
                        break;
                    }


                case "I":

                    try {

                        System.out.println("Please enter Stock Unit to be added (unitId, productId, quantity)");

                        System.out.println("Please enter Stock Unit: SerialNo");
                        Integer srNo = sc1.nextInt();

                        System.out.println("Please enter Stock Unit: Unit Id");
                        Integer unitId = sc1.nextInt();

                        System.out.println("Please enter Stock Unit: Product Id");
                        Integer prdId = sc1.nextInt();

                        System.out.println("Please enter Stock Unit: Quantity");
                        Integer qty = sc1.nextInt();


                        if (idao.addStockUnit(srNo, new StockUnit(unitId, prdId,qty))){
                            System.out.println("Stock Unit Added Successfully");
                        }else{
                            System.out.println("Error obtained while adding Stock Unit detail, Please contact support");
                        }
                    }catch (InputMismatchException ex){
                        System.out.println("Please enter correct input from your keyboard");
                    }finally {
                        break;
                    }



                case "L":

                        System.out.println("Displaying List of All Products");
                        ArrayList<Product> prList = new ArrayList<>();
                        prList = idao.listAllProduct();
                        if (prList.isEmpty()){

                            for (Product pr : prList){
                                System.out.println(pr);
                            }

                        }else {
                            System.out.println("Product List is Empty, No Data to display");
                        }

                        break;

                case "P":

                        System.out.println("Displaying List of All Stock Units");
                        //idao.listAllStockUnit();

                        ArrayList<StockUnit> suList = new ArrayList<>();
                        suList = idao.listAllStockUnit();

                        if (!suList.isEmpty()) {

                            for (StockUnit sum : suList){
                                // System.out.println(sum);
                                System.out.println("Unit Id : "+sum.getUnitId()+",Product Id : "+sum.getProductId()+" , Quantity : "+sum.getQuantity());
                            }
                          }else {
                            System.out.println("Stock Unit List is Empty, No Data to display");
                        }

                        break;

                case "S":

                         System.out.println("Enter Product Name to be serached in Stock Units");
                         String spname = sc.nextLine();

                        if (!idao.getStockUnitByProductName(spname)){
                            System.out.println("No record found for searched input "+spname);
                        }
                         break;

                case "Q":

                        System.out.println("You have selected the option to Quit, Thank You for visiting");
                       invalidInp=true;
                        break;

                default:
                        System.out.println("Incorrect input, please refer the Menu List");

                    break;

            }

            if (invalidInp==true){
                break;
            }



        }




    }

}
