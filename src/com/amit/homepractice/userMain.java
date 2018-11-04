package com.amit.homepractice;

public class userMain {

    public static void main(String[] args) {

        writeUserDetailsOnTextFile nn = new writeUserDetailsOnTextFile();

        nn.add(new userDetails("amit","pass"));
        nn.add(new userDetails("anu","password"));
        nn.add(new userDetails("pihoo","abcd1234  "));

        System.out.println("Writing on file");
        nn.writeDetailsOnTextFile("D:\\user.txt");

        System.out.println("Reading from file");
        nn.readDetailsFrmTextFile("D:\\user.txt");
    }

}
