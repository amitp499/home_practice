package com.amit.Interface;

public class computer {

    protected storage pendrive;  //storage = interface name and pendrive is storage type
    protected display ui; //display = interface name and ui is interface type

    public computer(storage pendrive,display ui ){

        this.pendrive = pendrive;
        this.ui = ui;

        pendrive.read();
        pendrive.write();
        ui.show();
    }



}




