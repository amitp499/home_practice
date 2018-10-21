package com.amit.Interface;

public class computer_main {


    public static void main(String[] args) {

        storage hd = new hardisk(); //storage =interface name and hardisk = class name
        display di = new Monitor(); //display =interface name and Monitor = class name

        computer cm = new computer(hd, di);  //implementation class name

    }
}