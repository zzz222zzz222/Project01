package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args) {
        //region Description
        System.out.println("helloworld");
        ArrayList list = new ArrayList();
        //endregion
        list.add(0, 123);

    }
    public static void method(){
        int num=10;
        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
