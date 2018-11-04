package com.amit.homepractice;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class writeUserDetailsOnTextFile {


    ArrayList<userDetails> aa = new ArrayList<>();

    public void add(userDetails ud){
        aa.add(ud);
    }


     public void writeDetailsOnTextFile(String wfile){

        // ArrayList<userDetails> aa = new ArrayList<>();

       //  aa.add(new userDetails("amit","pass"));

         //aa.add(new userDetails("rahul","password"));

         try {

             File ff = new File(wfile);
             if (ff.exists()){

                 ff.createNewFile();

                 //System.out.println(wfile);
                  FileWriter fw = new FileWriter(ff,true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 String newLine = System.getProperty("line.separator");

                 // String txt ="Hellow World"+newLine;
                //  bw.write(txt);


                 for (userDetails a : aa){

                   String str = a.toString();
                    bw.write(str);

                 }

                 bw.close();
                 fw.close();

             }

         }catch (IOException e){
             System.out.println(e.getMessage());
         }

    }

    public void readDetailsFrmTextFile(String rfile){


        try {

                FileReader fo = new FileReader(rfile);
                BufferedReader bw = new BufferedReader(fo);
                String st;

                while ((st=bw.readLine())!=null){

                    System.out.println(st);
                }


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
